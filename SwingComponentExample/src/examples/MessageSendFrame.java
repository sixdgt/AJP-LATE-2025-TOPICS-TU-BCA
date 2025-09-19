package examples;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class MessageSendFrame extends JFrame implements ActionListener{
	JButton btn_send;
	JTextField txt_message;
	JLabel lbl_message;
	JPanel panel;
	public MessageSendFrame() {
		setTitle("Message Send Form");
		setBounds(100, 100, 300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		lbl_message = new JLabel("Your Message: ");
		txt_message = new JTextField();
		btn_send = new JButton("Send Message");
		btn_send.addActionListener(this);
		panel.add(lbl_message);
		panel.add(txt_message);
		panel.add(btn_send);
		add(panel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.btn_send) {
			String message = txt_message.getText(); // accessing message
			// validation
			if(message.equals("")) {
				JOptionPane.showMessageDialog(null, "Please enter message first");
			} else {
				MessageDisplayFrame md = new MessageDisplayFrame(message); // creating obj
				md.setVisible(true);
				this.dispose();
			}
		}
	}
	
	public static void main(String args[]) {
		MessageSendFrame ms = new MessageSendFrame();
		ms.setVisible(true);
	}
}
