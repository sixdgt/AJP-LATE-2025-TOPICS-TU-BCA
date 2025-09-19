package examples;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Font;

public class JFrameExerciseOne extends JFrame{
	public JFrameExerciseOne() {
		setTitle("Exercise One");
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel title = new JLabel("DAV College".toUpperCase());
		title.setFont(new Font("Serif", Font.BOLD, 16));
		title.setForeground(Color.WHITE);
		
		JLabel subtitle = new JLabel("BCA | CSIT | BSC".toUpperCase());
		subtitle.setFont(new Font("Serif", Font.BOLD, 16));
		subtitle.setForeground(Color.WHITE);
		
		JLabel content = new JLabel("Affiliated to TU");
		content.setFont(new Font("Serif", Font.ITALIC, 16));
		content.setForeground(Color.WHITE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setBackground(Color.GRAY);
		panel.add(title);
		panel.add(subtitle);
		panel.add(content);
		
		add(panel);
		setVisible(true);
	}
	
	public static void main(String args[]) {
		new JFrameExerciseOne();
	}
}
