import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;

import javax.swing.JFrame;

public class line implements GLEventListener {

   public void display(GLAutoDrawable drawable) {
      final GL2 gl = drawable.getGL().getGL2();
      
      gl.glBegin (GL2.GL_LINES);//static field
      gl.glVertex3f(0.50f,-0.50f,0);
      gl.glVertex3f(-0.50f,0.50f,0);
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

      //getting the capabilities object of GL2 profile        
      final GLProfile profile = GLProfile.get(GLProfile.GL2);
      GLCapabilities capabilities = new GLCapabilities(profile);
      
      // The canvas
      final GLCanvas glcanvas = new GLCanvas(capabilities);
      line l = new line();
      glcanvas.addGLEventListener(l);
      glcanvas.setSize(400, 100);
      
      //creating frame
      final JFrame frame = new JFrame ("straight Line");
      
      //adding canvas to frame
      frame.getContentPane().add(glcanvas);
      
      frame.setSize(frame.getContentPane().getPreferredSize());
      frame.setVisible(true);
      
   }//end of main
   
}//end of classimport javax.media.opengl.GL2;
