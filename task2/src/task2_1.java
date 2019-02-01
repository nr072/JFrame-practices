import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFrame;


public class task2_1 implements GLEventListener {
	
	

   public void display(GLAutoDrawable drawable) {
	   
      final GL2 gl = drawable.getGL().getGL2();
      
      float x = (float) ( Math.random() - Math.random() );
      float y = (float) ( Math.random() - Math.random() );
            
      gl.glBegin (GL2.GL_POINTS);
      gl.glVertex2d(x,y);
      gl.glEnd();

   }
   
   
            
   public void dispose(GLAutoDrawable arg0) {
      //method body
   }
            
   public void init(GLAutoDrawable arg0) {
	   // method body
   }

   public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
	   // method body
   }
   
   
	
   public static void main(String[] args) {

	   final GLProfile profile = GLProfile.get(GLProfile.GL2);
	   GLCapabilities capabilities = new GLCapabilities(profile);
	   
	   final GLCanvas glcanvas = new GLCanvas(capabilities);
	   for (int c=0; c<100; ++c) {
		   task2_1 drawing = new task2_1();
		   glcanvas.addGLEventListener(drawing);
		   glcanvas.setSize(500, 500);
	   }
	   
	   final JFrame frame = new JFrame ("100 random points");
	   
	   frame.getContentPane().add(glcanvas);
	   
	   frame.setSize(frame.getContentPane().getPreferredSize());
	   frame.setVisible(true);
      
   }
   
   
	
}