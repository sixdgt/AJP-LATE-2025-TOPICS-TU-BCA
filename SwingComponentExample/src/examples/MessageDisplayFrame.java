package examples;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MessageDisplayFrame extends JFrame{
	// parameterized constructor
	public MessageDisplayFrame(String message) {
		setTitle("Message Display Frame");
		setBounds(100, 100, 300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JLabel output = new JLabel();
		output.setText(message);
		output.setForeground(Color.red);
		add(output);
	}
}
