package listener;
import java.awt.event.*;

import gui.WindowFrame;

public class ButtonEditListener implements ActionListener {
	WindowFrame frame;

	public ButtonEditListener(WindowFrame frame) {
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getPlantediter());
		frame.revalidate();
		frame.repaint();
	}
}
