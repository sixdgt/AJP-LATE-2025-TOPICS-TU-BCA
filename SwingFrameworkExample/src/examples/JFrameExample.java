package examples;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class JFrameExample extends JFrame {
	public JFrameExample() {
		setTitle("JFrame Example"); // will set title of JFrame
		setBounds(200, 200, 400, 500); // will set frame size with x,y coordinate
		setDefaultCloseOperation(EXIT_ON_CLOSE); // frame close operation
		// 1. Exit on close 2. Dispose 3. Do nothing
		// creating components
		JLabel title = new JLabel("JFrame & Panel Example"); // for labeling any components
		title.setForeground(new Color(234, 34, 100)); // will set text color
		title.setFont(new Font("Serif", Font.BOLD, 16)); // setting font family
		JLabel subtitle = new JLabel("| Swing Framework");
		subtitle.setForeground(new Color(234, 34, 100));
		subtitle.setFont(new Font("Serif", Font.ITALIC, 16));
		
		// creating Jpanel and adding to frame
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout()); // setting layouts in panel
		//panel.setBackground(Color.RED); // setting panel color
		panel.setBackground(new Color(13, 17, 100)); // setting custom color
		// adding components to panel
		panel.add(title);
		panel.add(subtitle);
		// adding components to frame
		add(panel); // it will add panel to frame
		
		setVisible(true); // will display the frame
	}
	
	public static void main(String args[]) {
		JFrameExample jfe = new JFrameExample();
	}
}
