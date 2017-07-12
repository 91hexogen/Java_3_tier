import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.MemoryImageSource;

// MVC

public class ViewRaumschiff extends Canvas{
	
	Image raumschiffImage;
	
	int posX;
	int posY;
	
	
	public ViewRaumschiff(ModelArt art, int x, int y) {
		posX = x;
		posY = y;
		
		// baut ein Bild aus einem IntegerArray
		raumschiffImage = createImage(new MemoryImageSource(32,21,art.data,15,32)); // 5 Parameter - Schaf von vorne
		
		// (32,21,art.data,0,32)
		
	}
	
	public void paint(Graphics g) {
		g.drawImage(raumschiffImage, posX, posY, 80, 80, this);
	}

}
