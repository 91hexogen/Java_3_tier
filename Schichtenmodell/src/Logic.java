import java.util.ArrayList;

// DREI SCHICHTEN MODELL
// Verarbeitung der Daten (Spielelogik, Parser, usw.)

public class Logic {

	Data data;
	
	public Logic () {
		data = new Data(); //er kennt die Schicht unter sich
	}
	
	public String getPersons() {
		//verarbeitung
		return data.getPersonsFromDatabase();
	}
	
	public ArrayList<Personen> getListPersonen(){
		
		return data.getPersonObjektList();
	}
	
	//main - einzelne Module können getestet werden
	public static void main(String [] args) {
		Logic l = new Logic();
		System.out.println(l.getPersons());
	}
	
}
