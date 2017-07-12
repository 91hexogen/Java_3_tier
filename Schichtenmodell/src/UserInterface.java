import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

// DREI SCHICHTEN MODELL

// Grafische Oberfläche

public class UserInterface extends JFrame{
	
	
	JLabel label = new JLabel();
	Logic logic;
	
	ArrayList<Personen> liste = new ArrayList<Personen>();
	
	public UserInterface() {
		
		logic = new Logic();
		
		this.setSize(400,400);
		this.setTitle("SCHICHTENMODELL - THREE TIER ARCHITECTURE");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(label);
		this.label.setText("Ausgabe: ");
		
		
		this.setVisible(true);
		
		einEvent();
	}
	
	// Emulation eines Knopfdruckes
	void einEvent() {
		String personen = logic.getPersons();
		label.setText(label.getText() + personen);
		
		liste = logic.getListPersonen();
		
		// durch das Personenobjekt können wir die einzelnen Werte
		// abgreifen und später damit weiterarbeiten
		for (Personen p : liste) {
			System.out.println(p.getName() + p.getVorname());
		}
	}
	
	
	
	public static void main(String [] args) {
		
		UserInterface ui = new UserInterface();
	}
	
}
