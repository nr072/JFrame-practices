import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFrame;


public class task2_3 implements GLEventListener {
	
	

   public void display(GLAutoDrawable drawable) {
	   
      final GL2 gl = drawable.getGL().getGL2();
      
      // Straight line is drawn through the x-axis
      float x1 = -0.5f;
      float y1 = 0f;
      float x2 = 0f;
      float y2 = 0f;
      float x3 = 0.5f;
      float y3 = 0f;
            
      gl.glBegin (GL2.GL_LINES);
      gl.glVertex2d(x1,y1);
      gl.glVertex2d(x2,y2);
      gl.glEnd();
      
      gl.glBegin (GL2.GL_LINES);
      gl.glVertex2d(x2,y2);
      gl.glVertex2d(x3,y3);
      gl.glEnd();

   }
   
   
            
   public void dispose(GLAutoDrawable arg0) {
	   // blank
   }
            
   public void init(GLAutoDrawable arg0) {
	   // blank
   }

   public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
	   // blank
   }
   
   
	
   public static void main(String[] args) {
	   
	   final GLProfile profile = GLProfile.get(GLProfile.GL2);
	   GLCapabilities capabilities = new GLCapabilities(profile);
	   
	   final GLCanvas glcanvas = new GLCanvas(capabilities);
	   task2_3 drawing = new task2_3();
	   glcanvas.addGLEventListener(drawing);
	   glcanvas.setSize(500, 500);

	   final JFrame frame = new JFrame ("Straight line using multiple points");
	   
	   frame.getContentPane().add(glcanvas);

	   frame.setSize(frame.getContentPane().getPreferredSize());
	   frame.setVisible(true);
      
   }
   
   
	
}