import javax.swing.SwingUtilities;

// MVC
// F�r die Kollegen
public class Start {
	
	
	public static void main(String [] args) {
		
		
		
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new ViewSpiel();
				
			}});
	}
}
