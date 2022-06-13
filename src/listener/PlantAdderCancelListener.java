package listener;
import java.awt.event.*;
import javax.swing.*;

import gui.PlantAdder;
import gui.WindowFrame;

public class PlantAdderCancelListener implements ActionListener {
	WindowFrame frame;

	public PlantAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
	}
}
