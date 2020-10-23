import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class DialogueWindow extends Frame implements WindowListener, ActionListener{

	private JTextField textField = new JTextField();
	
	public DialogueWindow() {
		setTitle("Set Circle Diameter");
        setSize(200,200);
        setVisible(true);
        addWindowListener(this);
        
        textField.setBounds(0, 0, 100, 20);
        textField.setText("" + DrawObject.getRadius());
        add(textField);
        
        Button button = new Button();
        button.setBounds(0, 30, 100, 20);
        button.addActionListener(this);
        add(button);
	}
	
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		dispose();
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		DrawObject.setRadius(Integer.parseInt(textField.getText()));
	}

}
