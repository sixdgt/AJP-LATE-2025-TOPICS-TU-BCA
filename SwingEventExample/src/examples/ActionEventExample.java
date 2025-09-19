package examples;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ActionEventExample implements ActionListener {
	JButton click = new JButton("Click Me");
	JButton add = new JButton("Add");
	JTextField num_one, num_two;
	JLabel output;
	JFrame frame;
	
	public ActionEventExample() {
		frame = new JFrame();
		frame.setTitle("Action Event Example");
		frame.setBounds(100, 100, 700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(4, 2));
		num_one = new JTextField();
		num_two = new JTextField();
		output = new JLabel("Output will be shown here..");
		
		frame.add(num_one);
		frame.add(num_two);
		frame.add(add);
		frame.add(output);
		frame.add(click);
		add.addActionListener(this);
		click.addActionListener(this); // adding listener in button so that
		// it will get triggered once the event is fired
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.click) { // getting the event source from frame
			System.out.println("I am clicked");
		} else if (e.getSource() == this.add) {
			try {
				int num_one = Integer.parseInt(this.num_one.getText());
				int num_two = Integer.parseInt(this.num_two.getText());
				int sum = num_one + num_two;
				this.output.setText("Sum of two integer: " + sum);
			} catch(NumberFormatException error) {
				JOptionPane.showMessageDialog(null, "Message: Please enter numeric value");
			}
		}
	}
	
	public static void main(String args[]) {
		ActionEventExample ae = new ActionEventExample();
	}
}
