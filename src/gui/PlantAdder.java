package gui;
import javax.swing.*;

import listener.PlantAdderCancelListener;
import listener.PlantAdderListener;
import manager.PlantManager;

public class PlantAdder extends JPanel{
	WindowFrame frame;
	PlantManager plantmanager;
	
	public PlantAdder(WindowFrame frame, PlantManager plantmanager) {
		this.frame = frame;
		this.plantmanager = plantmanager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID : ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelID.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelType = new JLabel("Type : ", JLabel.TRAILING);
		JTextField fieldType = new JTextField(10);
		labelID.setLabelFor(fieldType);
		panel.add(labelType);
		panel.add(fieldType);

		JLabel labelLight = new JLabel("Light : ", JLabel.TRAILING);
		JTextField fieldLight = new JTextField(10);
		labelID.setLabelFor(fieldLight);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new PlantAdderListener(fieldID, fieldName, fieldType, fieldLight, plantmanager));
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new PlantAdderCancelListener(frame));
		
		panel.add(labelLight);
		panel.add(fieldLight);
		panel.add(saveButton);
		panel.add(cancelButton);

		SpringUtilities.makeCompactGrid(panel,  5,  2,  6, 6,  6,  6);

		this.add(panel);
		this.setVisible(true);
	}
}
