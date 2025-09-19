package examples;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExample extends JFrame implements ActionListener{
	JButton b1, b2, b3;
	Container cpane;
	CardLayout cl;
	public CardLayoutExample() {
		setTitle("CartLayout Example");
		b1 = new JButton("Button One");
		b2 = new JButton("Button Two");
		b3 = new JButton("Button Three");
		
		cpane = getContentPane();
		cl = new CardLayout();
		cpane.setLayout(cl);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		cpane.add("a", b1);
		cpane.add("b", b2);
		cpane.add("c", b3);
		setBounds(100, 100, 500, 500);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		cl.next(cpane);
	}
	
	public static void main(String args[]) {
		new CardLayoutExample();
	}
}
