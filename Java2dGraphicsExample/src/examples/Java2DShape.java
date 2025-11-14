package examples;
import javax.swing.JFrame;

public class Java2DShape {
	public static void main(String args[]) {
		JFrame frame = new JFrame("2D Shape");
		frame.setBounds(100, 100, 800, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Java2DApiExample shape = new Java2DApiExample();
		frame.add(shape);
		frame.setVisible(true);
	}
}
