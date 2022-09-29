import javax.swing.JFrame;

public class V1ClientInfoViewer {

	public static void main(String[] args) {
		JFrame frame = new V1ClientInfo();
	      
	      //The setDefaultCloseOperation() method is used to specify one of several options for the close button. 

	      //JFrame.EXIT_ON_CLOSE — Exit the application.
	      //JFrame.HIDE_ON_CLOSE — Hide the frame, but keep the application running.
	      //JFrame.DISPOSE_ON_CLOSE — Dispose of the frame object, but keep the application running.
	      //JFrame.DO_NOTHING_ON_CLOSE — Ignore the click.

	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setVisible(true);
	   }
	}