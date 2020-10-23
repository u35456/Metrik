import java.awt.Color;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuBar extends MenuBar implements ActionListener {
	
	private Menu menu1;
	private Menu menu2;
	private MenuItem[] buttons = new MenuItem[4];
	private MenuItem kreisButton = new MenuItem("Radius");
	
	public MainMenuBar() {
		menu1 = new Menu("Hintergrundfarbe");
		
		buttons[0] = new MenuItem("Farbe: white");
		buttons[1] = new MenuItem("Farbe: blau");
		buttons[2] = new MenuItem("Farbe: grün");
		buttons[3] = new MenuItem("Farbe: magenta");
		
		for(int i = 0; i < 4; i++) {
			buttons[i].addActionListener(this);
			menu1.add(buttons[i]);
		}
        
		add(menu1);
		
		menu2 = new Menu("Kreis");
		menu2.add(kreisButton);
		kreisButton.addActionListener(this);
		add(menu2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source == kreisButton) {
			Window.diaWindow = new DialogueWindow();
			return;
		}
		
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
