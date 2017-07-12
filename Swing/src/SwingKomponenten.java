import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class SwingKomponenten extends JFrame {

	
	public SwingKomponenten() {
		
		
		new JFrame("SWINGING");
		setBounds(100,100,400,400);
		JLabel panel1 = new JLabel("label1");
		JLabel panel2 = new JLabel("label2");
		JLabel panel3 = new JLabel("label3");
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JButton b1 = new JButton("OK");
		add(b1);
		JButton b2 = new JButton("OPEN");
		add(b2);
		JButton b3 = new JButton("CLOSE");
		add(b3);
		
		add(panel1);
		add(panel2);
		add(panel3);
		
		JCheckBox box = new JCheckBox("CHECK");
		add(box);
		JRadioButton radio = new JRadioButton("RADIO");
		add(radio);
		JTextArea area = new JTextArea(10,15);
		add(area);
		
		
		JEditorPane editor = new JEditorPane();
		add(editor);
		

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		
		new SwingKomponenten();
		
	

	}

}

/*
 
 Standardsachen die man braucht:
 
Fenster
Layout
Container
Buttons
Checkbox
Textfelder (Labels)
Dialoge
Editfelder
*/