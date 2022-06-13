package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import manager.PlantManager;
import plant.PlantInput;
import plant.PlantKind;
import plant.Seedling;

public class PlantAdderListener implements ActionListener {
	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldType;
	JTextField fieldLight;
	
	PlantManager plantmanager;
	
	public PlantAdderListener(
			JTextField fieldID, 
			JTextField fieldName, 
			JTextField fieldType, 
			JTextField fieldLight, PlantManager plantmanager) {
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldType = fieldType;
		this.fieldLight = fieldLight;
		this.plantmanager = plantmanager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println(fieldID.getText());
//		System.out.println(fieldName.getText());
//		System.out.println(fieldType.getText());
//		System.out.println(fieldLight.getText());
//		
		PlantInput plant = new Seedling(PlantKind.Seedling);
		plant.setId(Integer.parseInt(fieldID.getText()));
		plant.setName(fieldName.getText());
		plant.setType(fieldType.getText());
		plant.setLight(fieldLight.getText());
		plantmanager.addPlant(plant);
		putObject(plantmanager, "plantmanager.ser");
		plant.printInfo();
	}
	public static void putObject(PlantManager plantmanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(plantmanager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
