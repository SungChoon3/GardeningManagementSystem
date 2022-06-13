package listener;
import java.awt.event.*;
import javax.swing.*;

import gui.PlantAdder;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener {
	WindowFrame frame;

	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getPlantadder());
		frame.revalidate();
		frame.repaint();
	}
//	public void actionPerformed(ActionEvent e) {
//		JButton b = (JButton) e.getSource();
//		PlantAdder adder = frame.getPlantadder();
//		frame.setupPanel(adder);
//	}

}
