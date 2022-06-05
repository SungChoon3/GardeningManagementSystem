package listener;
import java.awt.event.*;
import javax.swing.*;

import gui.PlantViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener {
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		PlantViewer viewer = frame.getPlantviewer();
		frame.setupPanel(viewer);
	}

}
