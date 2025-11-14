package examples;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.BasicStroke;
import java.awt.GradientPaint;
import java.awt.TexturePaint;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import javax.swing.JPanel;

public class Java2DApiExample extends JPanel{
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		// drawing 2d ellipse
		g2d.setPaint(new GradientPaint(5, 30, Color.BLUE, 35, 100, Color.YELLOW, true));
		g2d.fill(new Ellipse2D.Double(5, 30, 65, 100));
		
		// drawing 2d rectangle
		g2d.setPaint(Color.RED);
		g2d.setStroke(new BasicStroke(10.0f)); // set stroke for rectangle
		g2d.fill(new Rectangle2D.Double(80, 30, 65, 100));
		
		// drawing 2d pie-shaped arc
		g2d.setPaint(Color.WHITE);
		g2d.setStroke(new BasicStroke(6.0f));
		g2d.fill(new Arc2D.Double(240, 30, 75, 100, 0, 270, Arc2D.PIE));
		
		// drawing 2d line
		g2d.setPaint(Color.GREEN);
		g2d.fill(new Line2D.Double(395, 30, 320, 150));
	}
}
