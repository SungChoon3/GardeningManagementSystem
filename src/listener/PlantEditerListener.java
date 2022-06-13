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

public class PlantEditerListener implements ActionListener {
	JTextField fieldSearch;
	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldType;
	JTextField fieldLight;
	PlantManager plantmanager;
	
	public PlantEditerListener(JTextField fieldSearch, PlantManager plantmanager) {
		this.fieldSearch = fieldSearch;
		this.plantmanager = plantmanager;
	}
	public PlantEditerListener(
			JTextField fieldSearch,
			JTextField fieldID, 
			JTextField fieldName, 
			JTextField fieldType, 
			JTextField fieldLight, PlantManager plantmanager) {
		this.fieldSearch = fieldSearch;
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldType = fieldType;
		this.fieldLight = fieldLight;
		this.plantmanager = plantmanager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		PlantInput plant = new Seedling(PlantKind.Seedling);
		for(int i = 0; i< plantmanager.size();i++) {
			PlantInput pi = plantmanager.get(i);
			if(Integer.parseInt(fieldSearch.getText())==pi.getId()) {
				
				pi.setId(Integer.parseInt(fieldID.getText()));
				pi.setName(fieldName.getText());
				pi.setType(fieldType.getText());
				pi.setLight(fieldLight.getText());
				plantmanager.editPlant(pi);
				putObject(plantmanager, "plantmanager.ser");
				pi.printInfo();	
			}
		}
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
