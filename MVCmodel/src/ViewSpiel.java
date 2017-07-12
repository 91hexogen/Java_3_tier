// MVC

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViewSpiel extends JFrame{
	
	// Membervariablen
	int breite = 200, hoehe = 200;
	JButton button;
	
	ViewRaumschiff raumschiff;
	ViewSpielfeld spielfeld;
	
	
	// Konstruktor
	public ViewSpiel() {
		super("I want to believe...");
		
		setSize(breite, hoehe);
		button = new JButton("START");
		button.setSize(200,200);
		
		button.addActionListener(new Controller(this));
		
		add(button);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
	}
	
	void setRaumschiff(ModelArt art) {
		
		button.setVisible(false);
		// in das gleiche Fenster das Spielfeld reingezogen werden
		
		raumschiff = new ViewRaumschiff(art,50,50); // Anfangsposition des Raumschiffs
		spielfeld = new ViewSpielfeld(raumschiff);
		
		add(spielfeld); // lege die Leinwand(canvas) in das Fenster
		pack(); // vergrößere das Fenster (frame) auf die Canvasfläche
		spielfeld.play();
		spielfeld.requestFocus();
		
		
	}
	
	
}
