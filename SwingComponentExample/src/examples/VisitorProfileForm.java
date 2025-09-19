package examples;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;

public class VisitorProfileForm extends JFrame{
	public VisitorProfileForm() {
		setTitle("Visitor Profile Form");
		setBounds(100, 50, 600, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// for panels
		JPanel main = new JPanel();
		JPanel top = new JPanel();
		JPanel content = new JPanel();
		JPanel bottom = new JPanel();
		top.setBackground(new Color(0, 64, 48));
		content.setBackground(new Color(74, 151, 130));
		bottom.setBackground(new Color(0, 64, 48));
		// components: top panel
		JLabel title = new JLabel("DAV Visitor Profile".toUpperCase());
		title.setForeground(new Color(220, 208, 168));
		title.setFont(new Font("Serif", Font.BOLD, 15));
		title.setAlignmentX(CENTER_ALIGNMENT);
		
		JLabel date = new JLabel("2025");
		date.setForeground(new Color(220, 208, 168));
		date.setFont(new Font("Serif", Font.BOLD, 15));
		date.setAlignmentX(CENTER_ALIGNMENT);
		
		top.setLayout(new BoxLayout(top, BoxLayout.Y_AXIS));
		top.add(title);
		top.add(date);
		
		// components: content panel (form)
		JLabel name = new JLabel("Name: ");
		name.setForeground(new Color(220, 208, 168));
		name.setFont(new Font("Serif", Font.BOLD, 13));
		
		JLabel contact = new JLabel("Contact: ");
		contact.setForeground(new Color(220, 208, 168));
		contact.setFont(new Font("Serif", Font.BOLD, 13));
		
		JLabel address = new JLabel("Address: ");
		address.setForeground(new Color(220, 208, 168));
		address.setFont(new Font("Serif", Font.BOLD, 13));
		
		JLabel time_in = new JLabel("Time In: ");
		time_in.setForeground(new Color(220, 208, 168));
		time_in.setFont(new Font("Serif", Font.BOLD, 13));
		
		JLabel time_out = new JLabel("Time Out: ");
		time_out.setForeground(new Color(220, 208, 168));
		time_out.setFont(new Font("Serif", Font.BOLD, 13));
		
		JLabel purpose = new JLabel("Purpose: ");
		purpose.setForeground(new Color(220, 208, 168));
		purpose.setFont(new Font("Serif", Font.BOLD, 13));
		
		JTextField txt_name = new JTextField();
		txt_name.setForeground(new Color(220, 208, 168));
		txt_name.setFont(new Font("Serif", Font.BOLD, 13));
		
		JTextField txt_contact = new JTextField();
		txt_contact.setForeground(new Color(220, 208, 168));
		txt_contact.setFont(new Font("Serif", Font.BOLD, 13));
		
		JTextField txt_address = new JTextField();
		txt_address.setForeground(new Color(220, 208, 168));
		txt_address.setFont(new Font("Serif", Font.BOLD, 13));
		
		JTextField txt_time_in = new JTextField();
		txt_time_in.setForeground(new Color(220, 208, 168));
		txt_time_in.setFont(new Font("Serif", Font.BOLD, 13));
		
		JTextField txt_time_out = new JTextField();
		txt_time_out.setForeground(new Color(220, 208, 168));
		txt_time_out.setFont(new Font("Serif", Font.BOLD, 13));
		
		JTextField txt_purpose = new JTextField();
		txt_purpose.setForeground(new Color(220, 208, 168));
		txt_purpose.setFont(new Font("Serif", Font.BOLD, 13));
		
		// form layout
		GridLayout gl = new GridLayout(6, 2, 15, 15);
		content.setLayout(gl); // form layout
		content.add(name); // label for name
		content.add(txt_name); // textfield for name
		
		content.add(contact);
		content.add(txt_contact);
		
		content.add(address);
		content.add(txt_address);
		
		content.add(time_in);
		content.add(txt_time_in);
		
		content.add(time_out);
		content.add(txt_time_out);
		
		content.add(purpose);
		content.add(txt_purpose);
		
		// components: bottom 
		JButton submit = new JButton();
		submit.setText("Submit".toUpperCase());
		submit.setForeground(new Color(138, 187, 108));
		submit.setBackground(new Color(147, 47, 103));
		submit.setFont(new Font("Serif", Font.BOLD, 15));
		submit.setSize(100, 50);
		
		Border line = BorderFactory.createLineBorder(new Color(138, 187, 108), 2);
		submit.setBorder(line);
		
		bottom.setLayout(new BoxLayout(bottom, BoxLayout.X_AXIS));
		bottom.add(submit);
		
		// setting panel in frame with BorderLayout
		BorderLayout bl = new BorderLayout();
		main.setLayout(bl);
		main.add(top, bl.NORTH);
		main.add(content, bl.CENTER);
		main.add(bottom, bl.SOUTH);
		add(main);
	}
	public static void main(String args[]) {
		VisitorProfileForm vp = new VisitorProfileForm();
		vp.setVisible(true);
	}
}
