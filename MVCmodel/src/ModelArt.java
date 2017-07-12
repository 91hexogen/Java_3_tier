// MVC

import java.awt.Color;

// Das Model wird einfach gehalten, die Daten werden nicht extern gezogen,
// sondern fest notiert

public class ModelArt {

	
	int a= new Color(0,0,0,0).getRGB(); //transparent - Bauen eines Objektes (new)
	int b= Color.black.getRGB(); //statischer Zugriff (kein new)
	int c= Color.yellow.getRGB();
	
	/*int [] data ={ 
	a,a,a,a,a,a,a,a,a,a,b,b,b,b,b,b,b,b,b,b,b,a,a,a,a,a,a,a,a,a,a,a,
	a,a,a,a,a,a,a,b,b,b,b,b,c,c,c,c,c,c,c,b,b,b,b,b,a,a,a,a,a,a,a,a,
	a,a,a,a,a,b,b,b,c,c,c,c,c,b,c,c,c,b,c,c,c,c,c,b,b,b,a,a,a,a,a,a,
	a,a,a,b,b,b,c,c,b,b,c,c,c,b,b,b,b,b,c,c,c,b,b,c,c,b,b,b,a,a,a,a,
	a,a,b,b,c,c,c,b,b,c,c,c,c,b,c,b,c,b,c,c,c,c,b,b,c,c,c,b,b,a,a,a,
	a,b,b,c,c,b,b,b,b,c,c,c,c,b,b,b,b,b,c,c,c,c,b,b,b,b,c,c,b,b,a,a,
	a,b,c,b,b,b,b,b,b,c,c,c,c,b,b,b,b,b,c,c,c,c,b,b,b,b,b,b,c,b,a,a,
	b,b,c,b,b,b,b,b,b,b,c,c,b,b,b,b,b,b,b,c,c,b,b,b,b,b,b,b,c,b,b,a,
	b,c,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,c,b,a,
	b,c,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,c,b,a,
	b,c,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,c,b,a,
	b,c,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,c,b,a,
	b,c,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,c,b,a,
	b,b,c,b,b,b,b,c,c,b,b,b,b,b,b,b,b,b,b,b,b,b,c,c,b,b,b,b,c,b,b,a,
	a,b,c,b,b,b,c,c,c,c,b,c,c,b,b,b,b,b,c,c,b,c,c,c,c,b,b,b,c,b,a,a,
	a,b,b,c,c,b,c,c,c,c,b,c,c,c,b,b,b,c,c,c,b,c,c,c,c,b,c,c,b,b,a,a,
	a,a,b,b,c,c,b,c,c,c,c,c,c,c,c,b,c,c,c,c,c,c,c,c,b,c,c,b,b,a,a,a,
	a,a,a,b,b,b,c,c,c,c,c,c,c,c,c,b,c,c,c,c,c,c,c,c,c,b,b,b,a,a,a,a,
	a,a,a,a,a,b,b,b,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,b,b,b,a,a,a,a,a,a,
	a,a,a,a,a,a,a,b,b,b,b,b,c,c,c,c,c,c,c,b,b,b,b,b,a,a,a,a,a,a,a,a,
	a,a,a,a,a,a,a,a,a,a,b,b,b,b,b,b,b,b,b,b,b,a,a,a,a,a,a,a,a,a,a,a
	
	
	};*/
	
	int [] data ={ 
			a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,
			a,a,a,a,a,a,a,a,a,a,a,a,a,a,b,b,b,b,b,b,b,b,b,b,c,c,c,c,c,c,c,c,c,c,c,c,c,c,b,b,b,b,b,b,b,b,b,b,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,
			a,a,a,a,a,a,a,a,a,a,b,b,b,b,b,b,c,c,c,c,c,c,c,c,c,c,b,b,c,c,c,c,c,c,b,b,c,c,c,c,c,c,c,c,c,c,b,b,b,b,b,b,a,a,a,a,a,a,a,a,a,a,a,a,
			a,a,a,a,a,a,b,b,b,b,b,b,c,c,c,c,b,b,b,b,c,c,c,c,c,c,b,b,b,b,b,b,b,b,b,b,c,c,c,c,c,c,b,b,b,b,c,c,c,c,b,b,b,b,b,b,a,a,a,a,a,a,a,a,
			a,a,a,a,b,b,b,b,c,c,c,c,c,c,b,b,b,b,c,c,c,c,c,c,c,c,b,b,c,c,b,b,c,c,b,b,c,c,c,c,c,c,c,c,b,b,b,b,c,c,c,c,c,c,b,b,b,b,a,a,a,a,a,a,
			a,a,b,b,b,b,c,c,c,c,b,b,b,b,b,b,b,b,c,c,c,c,c,c,c,c,b,b,b,b,b,b,b,b,b,b,c,c,c,c,c,c,c,c,b,b,b,b,b,b,b,b,c,c,c,c,b,b,b,b,a,a,a,a,
			a,a,b,b,c,c,b,b,b,b,b,b,b,b,b,b,b,b,c,c,c,c,c,c,c,c,b,b,b,b,b,b,b,b,b,b,c,c,c,c,c,c,c,c,b,b,b,b,b,b,b,b,b,b,b,b,c,c,b,b,a,a,a,a,
			b,b,b,b,c,c,b,b,b,b,b,b,b,b,b,b,b,b,b,b,c,c,c,c,b,b,b,b,b,b,b,b,b,b,b,b,b,b,c,c,c,c,b,b,b,b,b,b,b,b,b,b,b,b,b,b,c,c,b,b,b,b,a,a,
			b,b,c,c,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,c,c,b,b,a,a,
			b,b,c,c,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,c,c,b,b,a,a,
			b,b,c,c,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,c,c,b,b,a,a,
			b,b,c,c,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,c,c,b,b,a,a,
			b,b,c,c,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,c,c,b,b,a,a,
			b,b,b,b,c,c,b,b,b,b,b,b,b,b,c,c,c,c,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,c,c,c,c,b,b,b,b,b,b,b,b,c,c,b,b,b,b,a,a,
			a,a,b,b,c,c,b,b,b,b,b,b,c,c,c,c,c,c,c,c,b,b,c,c,c,c,b,b,b,b,b,b,b,b,b,b,c,c,c,c,b,b,c,c,c,c,c,c,c,c,b,b,b,b,b,b,c,c,b,b,a,a,a,a,
			a,a,b,b,b,b,c,c,c,c,b,b,c,c,c,c,c,c,c,c,b,b,c,c,c,c,c,c,b,b,b,b,b,b,c,c,c,c,c,c,b,b,c,c,c,c,c,c,c,c,b,b,c,c,c,c,b,b,b,b,a,a,a,a,
			a,a,a,a,b,b,b,b,c,c,c,c,b,b,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,b,b,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,b,b,c,c,c,c,b,b,b,b,a,a,a,a,a,a,
			a,a,a,a,a,a,b,b,b,b,b,b,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,b,b,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,b,b,b,b,b,b,a,a,a,a,a,a,a,a,
			a,a,a,a,a,a,a,a,a,a,b,b,b,b,b,b,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,b,b,b,b,b,b,a,a,a,a,a,a,a,a,a,a,a,a,
			a,a,a,a,a,a,a,a,a,a,a,a,a,a,b,b,b,b,b,b,b,b,b,b,c,c,c,c,c,c,c,c,c,c,c,c,c,c,b,b,b,b,b,b,b,b,b,b,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,
			a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a
			
			
	};
	
	
	public ModelArt getRaumschiff() {
		return this;
	}

}
