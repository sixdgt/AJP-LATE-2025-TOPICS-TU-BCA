package com.examples;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class CheckBoxExample extends JFrame implements ActionListener{
	JCheckBox check_one, check_two;
	JButton check;
	JPanel panel;
	public CheckBoxExample() {
		setTitle("Checkbox Example");
		setBounds(100, 100, 350, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		check_one = new JCheckBox("Item One", false);
		check_two = new JCheckBox("Item Two", true);
		
		check = new JButton("Check");
		check.addActionListener(this);
		panel.add(check_one);
		panel.add(check_two);
		panel.add(check);
		add(panel);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.check) {
			boolean isCheckOneSelected = this.check_one.isSelected();
			boolean isCheckTwoSelected = this.check_two.isSelected();
			System.out.println("Item One Status: " + isCheckOneSelected);
			System.out.println("Item Two Status: " + isCheckTwoSelected);
		}
	}
	
	public static void main(String args[]) {
		new CheckBoxExample();
	}

}
