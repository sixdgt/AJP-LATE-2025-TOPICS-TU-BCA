package example;

import javax.swing.JTable;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JTableExample extends JFrame{
	public JTableExample() {
		setTitle("Swing JTable Example");
		setBounds(100, 100, 500, 300);
		
		// frame title
		JLabel title = new JLabel("JTable Example");
		
		// for table column
		String columns[] = {"S.No.", "First Name", "Last Name", "Email", "Gender"};
		// for table data -> here we have added 5 rows
		Object data[][] = {
				{"1", "Abiral", "Shrestha", "abiral@gmail.com", "Male"},
				{"2", "Prasiddha", "Bajracharya", "prasiddha@gmail.com", "Male"},
				{"3", "Sita", "Thada Magar", "sita@gmail.com", "Female"},
				{"4", "Basanta", "Upadhyaya", "basanta@gmail.com", "Male"},
				{"5", "Sagar", "Panta", "sagar@gmail.com", "Male"},
				{"6", "Bibek", "Tripathi", "bibek@gmail.com", "Male"},
				{"7", "Dhirendra", "Tripathi", "dhirendra@gmail.com", "Male"},
				{"8", "Sushil", "Nemkul", "sushil@gmail.com", "Male"},
				{"9", "Prezen", "Shrestha", "prezen@gmail.com", "Male"},
				{"10", "Maheshwor", "Silwal", "maheshwor@gmail.com", "Male"},
				{"11", "Abhishek", "Shakya", "abhishek@gmail.com", "Male"},
				{"12", "Jeson", "Gurung", "jeson@gmail.com", "Male"},
				{"13", "Bibek", "Maharjan", "bibekmhzn@gmail.com", "Male"},
				{"14", "Prezen", "Shrestha", "prezen@gmail.com", "Male"},
				{"15", "Meera", "Dhungana", "meera@gmail.com", "Female"},
				{"16", "Nilam", "Rai", "nilam@gmail.com", "Female"},
				{"17", "Saurav", "Gurung", "saurav@gmail.com", "Male"},
				{"18", "Hira", "Thapa", "hira@gmail.com", "Male"},
		};
		// table for displaying list of data
		JTable table = new JTable(data, columns);
		
		// Scroll Pane for making table scroll
		JScrollPane scroll = new JScrollPane(table);
		JPanel panel = new JPanel();
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // setting panel layout
		panel.add(title); // adding component to panel
		panel.add(scroll);
		
		add(panel); // adding panel to frame
		setVisible(true);
	}
	
	public static void main(String args[]) {
		JTableExample jt = new JTableExample();
	}
}
