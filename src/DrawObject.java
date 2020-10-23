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
	private int amountOfClicks = 0;
	
	public DrawObject() {
		setSize(500, 500);
		setBackground(Color.white);
		addMouseListener(this);
	}

	@Override
	public void paint(Graphics g) {
		if (amountOfClicks == 0) return;
		if (amountOfClicks >= 3) {
			amountOfClicks = 0;
			repaint();
			return;
		}
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(2.5F));
		Ellipse2D ellipse = new Ellipse2D.Float(
							posX-25, posY-25,
							50, 50);
		g2d.draw(ellipse);
		
		g2d.drawString("" + posX + " " + posY, posX - 30, posY - 30);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		amountOfClicks++;
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
}
