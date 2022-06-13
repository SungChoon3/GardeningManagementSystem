package listener;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import gui.PlantDeleter;
import gui.PlantViewer;
import gui.WindowFrame;
import manager.PlantManager;

public class ButtonDeleteListener implements ActionListener {
	WindowFrame frame;

	public ButtonDeleteListener(WindowFrame frame) {
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		PlantDeleter plantDeleter = frame.getPlantdeleter();
		PlantManager plantmanager = getObject("plantmanager.ser");
		plantDeleter.setPlantmanager(plantmanager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(plantDeleter);
		frame.revalidate();
		frame.repaint();
	}
	public static PlantManager getObject(String filename) {
		PlantManager plantmanager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			plantmanager = (PlantManager)in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return plantmanager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return plantmanager;
	}
}
