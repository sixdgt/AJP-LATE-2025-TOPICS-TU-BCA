package example;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentEditForm extends JFrame implements ActionListener{
	
	private JLabel lbl_first_name, lbl_last_name, lbl_email, lbl_gender, lbl_address, lbl_reg_no;
	private JTextField txt_first_name, txt_last_name, txt_email, txt_address, txt_reg_no;
	private JComboBox<String> cmb_gender;
	private JPanel panel;
	private JButton update, back;
	private int student_id;
	
	public StudentEditForm(String student_id, String fname, String lname, String email, String address, String reg_no) {
		setTitle("Student Add Form");
		setBounds(100, 100, 300, 400);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		lbl_first_name = new JLabel("First Name: ");
		lbl_last_name = new JLabel("Last Name: ");
		lbl_email = new JLabel("Email: ");
		lbl_gender = new JLabel("Gender: ");
		lbl_address = new JLabel("Address: ");
		lbl_reg_no = new JLabel("Registration No: ");
		
		this.student_id = Integer.parseInt(student_id);
		txt_first_name = new JTextField();
		txt_first_name.setText(fname);
		txt_last_name = new JTextField();
		txt_last_name.setText(lname);
		txt_email = new JTextField();
		txt_email.setText(email);
		txt_address = new JTextField();
		txt_address.setText(address);
		txt_reg_no = new JTextField();
		txt_reg_no.setText(reg_no);
		txt_reg_no.setEditable(false);
		cmb_gender = new JComboBox<String>();
		cmb_gender.addItem("Male");
		cmb_gender.addItem("Femail");
		cmb_gender.addItem("Others");
		
		update = new JButton("Update Student");
		update.addActionListener(this);
		back = new JButton("Back");
		back.addActionListener(this);
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		panel.add(lbl_first_name);
		panel.add(txt_first_name);
		panel.add(lbl_last_name);
		panel.add(txt_last_name);
		panel.add(lbl_email);
		panel.add(txt_email);
		panel.add(lbl_gender);
		panel.add(cmb_gender);
		panel.add(lbl_address);
		panel.add(txt_address);
		panel.add(lbl_reg_no);
		panel.add(txt_reg_no);
		panel.add(update);
		panel.add(back);
		add(panel);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.update) {
			try {
				String url = "jdbc:mysql://localhost:3306/jdbc_demo";
		        String user = "root";
		        String password = "1234";
		        
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, user, password);
				Statement stmt = con.createStatement();
				
				String first_name = txt_first_name.getText();
				String last_name = txt_last_name.getText();
				String email = txt_email.getText();
				String gender = cmb_gender.getSelectedItem().toString();
				String address = txt_address.getText();
				int reg_no = Integer.parseInt(txt_reg_no.getText());
				
				String sql = "UPDATE student SET "
						+ "first_name='" + first_name + "',"
						+ "last_name='" + last_name +"', "
						+ "email='" + email +"', "
						+ "gender='" + gender + "', "
						+ "address='" + address + "'"
						+ " WHERE registration_no="+ reg_no + " AND student_id="+ this.student_id;
				
				if(stmt.executeUpdate(sql) > 0) {
					JOptionPane.showMessageDialog(rootPane, "Student updated successfully!");
					this.dispose();
					LoadDataJTableExample jt = new LoadDataJTableExample();
				} else {
					JOptionPane.showMessageDialog(rootPane, "Not able to update at the moment");
				}
			} catch (SQLException | ClassNotFoundException e2) {
				System.out.println("Error: " + e2.getMessage());
			}
		} else if (e.getSource() == this.back) {
			this.dispose();
			LoadDataJTableExample jt = new LoadDataJTableExample();
		}
	}
}
