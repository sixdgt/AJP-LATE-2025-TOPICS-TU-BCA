package examples;

import javax.swing.JFrame;

public class GraphicExample {
	
	// here we will show ColorDisplay with Graphics
	public static void main(String args[]) {
		JFrame frame = new JFrame("Displaying Colors");
		frame.setBounds(50, 100, 400, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ColorGraphicExample cg = new ColorGraphicExample();
		frame.add(cg);
		frame.setVisible(true);
	}
}
