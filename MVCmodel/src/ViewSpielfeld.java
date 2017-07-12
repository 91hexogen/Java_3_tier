import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

// MVC

public class ViewSpielfeld extends Canvas {

	int hoehe = 700;
	int breite = 700;
	
	ViewRaumschiff raumschiff;
	
	//Konstruktor
	public ViewSpielfeld (ViewRaumschiff r) {
		raumschiff = r;
		
		setBackground (Color.black);
		setSize(breite, hoehe);
		
		setVisible(true);
	}
	
	void play() {
		
		addKeyListener(new KeyAdapter(){
			
			public void keyPressed(KeyEvent e) {
				System.out.println("Key gedrückt");
			
				// Raumschiffsteuerung
				// Welche Taste wird als Zahl gedrückt?
				int action = e.getKeyCode();
				
				switch (action){
					case KeyEvent.VK_RIGHT:
						if(raumschiff.posX <= (breite - 80)) {
							raumschiff.posX +=10;
						}
						break;
						
					case KeyEvent.VK_LEFT:
						if(raumschiff.posX >10) {
							raumschiff.posX -=10;
						}
						
						break;
						
					case KeyEvent.VK_UP:
						if(raumschiff.posY >10) {
							raumschiff.posY -=10;
						}
						
						break;
						
					case KeyEvent.VK_DOWN:
						if(raumschiff.posY >10) {
							raumschiff.posY +=10;
						}
						
						break;	
				}
				
				repaint();
			}
			
		});
	}
	
	public void paint(Graphics g) {
		
		if(raumschiff != null) {
			raumschiff.update(g);
		}
	}
	
	/*public static void main(String [] args) {
	
		new ViewSpielfeld(
				new ViewRaumschiff(
						new ModelArt(),30,30)).play();
		
	}*/
	
}









