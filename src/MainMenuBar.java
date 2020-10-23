import java.awt.Color;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuBar extends MenuBar implements ActionListener {
	
	private Menu menu;
	private MenuItem[] buttons = new MenuItem[4];
	
	public MainMenuBar() {
		menu = new Menu("Hintergrundfarbe");
		
		buttons[0] = new MenuItem("Farbe: white");
		buttons[1] = new MenuItem("Farbe: blau");
		buttons[2] = new MenuItem("Farbe: grün");
		buttons[3] = new MenuItem("Farbe: magenta");
		
		for(int i = 0; i < 4; i++) {
			buttons[i].addActionListener(this);
			menu.add(buttons[i]);
		}
        
		add(menu);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == buttons[0]) {
			Window.setBackgroundColor(Color.white);
		} else if (source == buttons[1]) {
			Window.setBackgroundColor(Color.blue);
		} else if (source == buttons[2]) {
			Window.setBackgroundColor(Color.green);
		} else {
			Window.setBackgroundColor(Color.magenta);
		}
		
	}
}
