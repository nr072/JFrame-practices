import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFrame;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class task2_2 implements GLEventListener {
	
	

	public void display(GLAutoDrawable drawable) {

		final GL2 gl = drawable.getGL().getGL2();
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader("src/coordinates.txt"));
			String line = null;
			
			try {
				
				// If next line exists, read as string, convert into
				// float and split using comma (,).
				while ( (line = br.readLine())!=null ) {
					float x = Float.parseFloat( line.split(",")[0] );
					float y = Float.parseFloat( line.split(",")[1] );
					gl.glBegin(GL2.GL_POINTS);
					gl.glVertex2d(x,y);
					gl.glEnd();
				}
				
			}
			
			// If can not read line:
			catch (IOException e) {
				System.out.println("Error: Probably no line in file!");
			}
			
		}
		
		// If file not found:
		catch (FileNotFoundException e) {
			System.out.println("Error: File not found!");
		}

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
	
	
	
	public static void generateCoordinates() {
		for (int c=0; c<20; ++c) {
			System.out.print( (float) (Math.random()-Math.random()) + ","  );
			System.out.print( (float) (Math.random()-Math.random()) + "\n" );
	   }
	}
	
	
	
	public static void main(String[] args) {
		
//		// If feeling too lazy or it is too urgent, automatically
//		// generate coordinates and copy-paste into text file.
//		// All x- and y- coordinates are separated by commas (,).
//		generateCoordinates();
		
		final GLProfile profile = GLProfile.get(GLProfile.GL2);
		GLCapabilities capabilities = new GLCapabilities(profile);
		
		final GLCanvas glcanvas = new GLCanvas(capabilities);
		task2_2 drawing = new task2_2();
		glcanvas.addGLEventListener(drawing);
	   	glcanvas.setSize(500, 500);
	   	
	   	final JFrame frame = new JFrame ("Points drawn with coordinates taken from text file");

	   	frame.getContentPane().add(glcanvas);
	   
	   	frame.setSize(frame.getContentPane().getPreferredSize());
	   	frame.setVisible(true);

	}
	
	

}
