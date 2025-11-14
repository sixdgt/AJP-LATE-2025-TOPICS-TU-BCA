package examples;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class ColorGraphicExample extends JPanel{
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(new Color(0, 0, 0));
		
		// set new drawing with integer values of Color class i.e RGB
		g.setColor(new Color(255, 0, 0)); // red color
		g.fillRect(14, 20, 100, 20); // will draw rectangle with fill color
		g.drawString("Current RGB: " + g.getColor(), 130, 40);
		
		// set new drawing with float values of Color class
		g.setColor(new Color(0.50f, 0.75f, 0.0f));
		g.fillRect(14, 50, 100, 20);
		g.drawString("Current RGB: " + g.getColor(), 130, 65);
		
		// set new drawing with pre-defined color attribute
		g.setColor(Color.BLUE);
		g.fillRect(14, 75, 100, 20);
		g.drawString("Current RGB: " + g.getColor(), 130, 90);
		
		// set new drawing with border only 
		g.setColor(Color.WHITE);
		g.drawRect(14, 100, 100, 20);
		g.drawString("Current RGB" + g.getColor(), 130, 115);
		
		// set new drawing with straight horizontal line
		g.setColor(Color.MAGENTA);
		g.drawLine(14, 140, 110, 140); // x1, y1, x2, y2: here y1 and y2 has same value
		
		// set new drawing with straight vertical line - x1 and x2 value must be same
		g.setColor(Color.YELLOW);
		g.drawLine(14, 150, 14, 180);
	} 
}
