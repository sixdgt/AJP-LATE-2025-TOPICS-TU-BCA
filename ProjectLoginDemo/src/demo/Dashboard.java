package demo;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener{
	JLabel greet;
	JButton logout;
	JPanel panel;
	// parameterized constructor: taking two parameter
	public Dashboard(String username, String usertype) {
		setTitle("Dashboard");
		setBounds(100, 100, 600, 350);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		greet = new JLabel();
		greet.setText("Welcome: " + username + ", Role: " + usertype);
		
		logout = new JButton("Logout");
		logout.addActionListener(this);
		
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(greet);
		panel.add(logout);
		
		add(panel);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.logout) {
			this.dispose();
			LoginForm lf = new LoginForm();
		}		
	}
}
