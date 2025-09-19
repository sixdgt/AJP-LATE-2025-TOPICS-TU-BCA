package demo;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame implements ActionListener{
	JButton login;
	JLabel lbl_username, lbl_password, lbl_title;
	JPanel panel;
	JComboBox<String> cmb_usertype;
	JTextField txt_username;
	JPasswordField txt_password;
	
	public LoginForm() {
		setTitle("Login Form");
		setBounds(100, 100, 350, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lbl_title = new JLabel("Please provide your credentials");
		lbl_username = new JLabel("Enter Username");
		lbl_password = new JLabel("Enter Password");
		
		txt_username = new JTextField();
		txt_password = new JPasswordField();
		
		String user_type[] = {"Guest", "User", "Admin"};
		cmb_usertype = new JComboBox<>(user_type);
		
		login = new JButton("Login");
		login.addActionListener(this);
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		panel.add(lbl_title);
		panel.add(lbl_username);
		panel.add(txt_username);
		panel.add(lbl_password);
		panel.add(txt_password);
		panel.add(cmb_usertype);
		panel.add(login);
		add(panel);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.login) {
			String username = txt_username.getText();
			String password = new String(txt_password.getPassword());
			String usertype = cmb_usertype.getSelectedItem().toString(); // getting data of combobox
			if(username.equals("admin") && password.equals("1234") && usertype.toLowerCase().equals("admin")) {
				JOptionPane.showMessageDialog(null, "Welcome Admin");
				Dashboard db= new Dashboard(username, usertype);
				this.dispose();
			} else if (username.equals("user") && password.equals("1234") && usertype.toLowerCase().equals("user")) {
				JOptionPane.showMessageDialog(null, "Welcome User");
				Dashboard db= new Dashboard(username, usertype);
				this.dispose();
			} else if (username.equals("guest") && password.equals("1234") && usertype.toLowerCase().equals("guest")) {
				JOptionPane.showMessageDialog(null, "Welcome Guest");
				Dashboard db= new Dashboard(username, usertype);
				this.dispose();
			} else {
				JOptionPane.showMessageDialog(null, "Invalid username or password. Try again.");
			}
		}
	}
	
	public static void main(String args[]) {
		LoginForm lf = new LoginForm();
	}
}
