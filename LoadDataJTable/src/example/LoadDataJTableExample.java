package example;

import javax.swing.JTable;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JButton;

public class LoadDataJTableExample extends JFrame implements ActionListener{
	private JTable table;
	private DefaultTableModel model;
	private JButton show;
	public LoadDataJTableExample() {
		setTitle("Data Load with JTable");
		setBounds(100, 100, 500, 300);
		
		// frame title
		JLabel title = new JLabel("Student List");
		show = new JButton("Show");
		show.addActionListener(this);
		
		model = new DefaultTableModel();
		table = new JTable(model);
		
		// Scroll Pane for making table scroll
		JScrollPane scroll = new JScrollPane(table);
		JPanel panel = new JPanel();
		// calling function to load data
		loadData();
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // setting panel layout
		panel.add(title); // adding component to panel
		panel.add(show);
		panel.add(scroll);
		
		add(panel); // adding panel to frame
		setVisible(true);
	}
	
	private void loadData() {
        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String user = "root";
        String password = "1234";

        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            
            // Clear existing table data
            model.setRowCount(0);
            
            // Get column names
            Vector<String> columnNames = new Vector<>();
            columnNames.add("SN"); // for serial number
            
            for (int i = 1; i <= columnCount; i++) {
                columnNames.add(metaData.getColumnName(i)); // will fetch table column from db
            }
            model.setColumnIdentifiers(columnNames);
            
            int sn = 1; // Serial no counter
            
            // Get row data
            while (rs.next()) {
                Vector<Object> row = new Vector<>();
                row.add(sn++); // incrementing serial number
                
                for (int i = 1; i <= columnCount; i++) {
                    row.add(rs.getObject(i));
                }
                model.addRow(row);
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage(), 
            		"Error", JOptionPane.ERROR_MESSAGE);
        }
    }
	
	public static void main(String args[]) {
		LoadDataJTableExample dt = new LoadDataJTableExample();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.show) {
			int row = table.getSelectedRow();
			if(row != -1) {
				String student_id = table.getValueAt(row, 1).toString();
				System.out.println("Student ID: " + student_id);
				
				String first_name = table.getValueAt(row, 2).toString();
				System.out.println("First Name: " + first_name);
				
				String last_name = table.getValueAt(row, 3).toString();
				System.out.println("Last Name: " + last_name);
				
				String email = table.getValueAt(row, 4).toString();
				System.out.println("Email: " + email);
				
				String gender = table.getValueAt(row, 5).toString();
				System.out.println("Gender: " + gender);
				
				String address = table.getValueAt(row, 6).toString();
				System.out.println("Address: " + address);
				
				String registration_no = table.getValueAt(row, 7).toString();
				System.out.println("Registration No: " + registration_no);
				
				System.out.println("--------------------------");
				System.out.println();
			}
		}		
	}
}