import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Window extends Frame implements WindowListener {
	
	public static DrawObject drawObject = new DrawObject();
	public static DialogueWindow diaWindow;
	
	public Window() {
		setTitle("Metrik v1.2.1");
        setSize(500,300);
        setVisible(true);
        addWindowListener(this);
        add(drawObject);
        setMenuBar(new MainMenuBar());
	}

	public static void setBackgroundColor(Color c) {
		drawObject.setBackground(c);
	}
	
	@Override
	public void windowActivated(WindowEvent arg0) {
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		dispose();
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		
	}
	
}
