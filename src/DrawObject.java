import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.io.StringWriter;

public class DrawObject extends Canvas implements MouseListener {
	
	private int posX, posY = 0;
	private int oldX, oldY = 0;
	private int amountOfClicks = 0;
	private static int radius = 50;
	private double distance = 0F;
	
	public DrawObject() {
		setSize(500, 500);
		setBackground(Color.white);
		addMouseListener(this);
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		switch (amountOfClicks) {
		case 0: {
			return;
		}
		case 1: {
			g2d.setStroke(new BasicStroke(2.5F));
			Ellipse2D ellipse = new Ellipse2D.Float(
								posX-25, posY-25,
								50, 50);
			g2d.draw(ellipse);
			g2d.drawString("" + posX + " " + posY, posX - 30, posY - 30);
			return;
		}
		case 2: {
			g2d.setStroke(new BasicStroke(2.5F));
			Ellipse2D ellipse = new Ellipse2D.Float(
								posX-25, posY-25,
								50, 50);
			g2d.draw(ellipse);
			
			g2d.drawString("" + posX + " " + posY, posX - 30, posY - 30);
			distance = Math.sqrt(Math.pow(oldX - posX, 2) + Math.pow(oldY - posY, 2));
			g2d.drawString("d = " + distance, (posX + oldX) / 2, (posY + oldY)/2);
			
			g2d.drawLine(oldX, oldY, posX, posY);
			return;
		}
		case 3: {
			amountOfClicks = 0;
			repaint();
			return;
		}}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		amountOfClicks++;
		oldX = posX;
		oldY = posY;
		posX = e.getX();
		posY = e.getY();
		paint(getGraphics());
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	
	public static void setRadius(int r) {
		radius = r;
	}
	
	public static int getRadius() {
		return radius;
	}
}
