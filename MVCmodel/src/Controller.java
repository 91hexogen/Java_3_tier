import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// MVC

// das ganze muss ich als UML-Diagramm zeichnen können

public class Controller implements ActionListener {
	
	private ViewSpiel viewSpiel;
	private ModelArt modelArt;
	
	// Konstruktor
	public Controller(ViewSpiel viewSpiel) {
		
		this.viewSpiel = viewSpiel;
		this.modelArt = new ModelArt(); // Objekt erstellen
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		viewSpiel.setRaumschiff(modelArt.getRaumschiff());
		
	}

}
