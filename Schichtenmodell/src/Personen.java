// DREI SCHICHTEN MODELL
// Objekt/Entity, das die Datensätze aufnimmt(mappt)

public class Personen {
	
	private String vorname;
	private String name;
	
	// Konstruktor
	public Personen(String vor, String na) {
		vorname=vor;
		name=na;
	}
	
	
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String v) {
		vorname = v;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	
	
	public static void main(String [] args) {
		
	}
	
	
}
