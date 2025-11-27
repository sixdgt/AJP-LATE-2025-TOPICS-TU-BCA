package example;

import javax.swing.JTable;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;

public class LoadDataJTableExample extends JFrame{
	private JTable table;
	private DefaultTableModel model;
	
	public LoadDataJTableExample() {
		setTitle("Data Load with JTable");
		setBounds(100, 100, 500, 300);
		
		// frame title
		JLabel title = new JLabel("Student List");
		
		model = new DefaultTableModel();
		table = new JTable(model);
		
		// Scroll Pane for making table scroll
		JScrollPane scroll = new JScrollPane(table);
		JPanel panel = new JPanel();
		// calling function to load data
		loadData();
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // setting panel layout
		panel.add(title); // adding component to panel
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

            // Get column names
            Vector<String> columnNames = new Vector<>();
            for (int i = 1; i <= columnCount; i++) {
                columnNames.add(metaData.getColumnName(i));
            }
            model.setColumnIdentifiers(columnNames);

            // Get row data
            while (rs.next()) {
                Vector<Object> row = new Vector<>();
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
}