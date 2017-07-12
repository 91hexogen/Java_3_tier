import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

// DREI SCHICHTEN MODELL

//flexibler Zugriff, R�ckgabe als String und als Personenobjektliste
public class Data {

	
	ArrayList<Personen> personen=new ArrayList<Personen>();
	
	
	// getter
	public ArrayList<Personen> getPersonObjektList(){
		
		return personen;
	}
	
	
	
	public String getPersonsFromDatabase() {
		Connection conn = null;
		
		
		try {
			// Manager m�chte eine speziell formatierte Zeichenkette (gibt es online)
			conn = DriverManager.getConnection
				(
				"jdbc:mysql://localhost/test?autoReconnect=true&useSSL=false&user=root&password="
				);
			
			// SQL STRING
			Statement statement = conn.createStatement();
			
			// ERGEBNIS
			ResultSet resultSet = null;
			
			if(statement.execute("SELECT * FROM personen")) {
				
				// ERGEBNIS abholen
				resultSet = statement.getResultSet();
				
				String personentmp="";
				while(resultSet.next()) {
					
					String name=resultSet.getString("p_name");
					String vorname=resultSet.getString("p_vorname");
					personentmp += name + "," + vorname + " - ";
					
					// tempor�res Objekt bauen und f�llen
					Personen p = new Personen(vorname, name);
					
					// in die Liste einh�ngen
					personen.add(p);
				}
				
				return personentmp;
				
			}
			
			
			
		} catch (SQLException e) {
			// er zeigt mir den Fehler, wenn der Kontakt nicht klappt
			e.printStackTrace();
		}
		
				
		return "";
	}
	
	// Module sollen unabh�ngig voneinander getestet werden k�nnen
	public static void main (String [] args) {
		
		Data d=new Data();
		System.out.println(d.getPersonsFromDatabase());
	}
	
}
