package gui;
import javax.swing.*;

public class PlantAdder extends JFrame{
	public PlantAdder() {
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
		panel.add(labelLight);
		panel.add(fieldLight);
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));

		SpringUtilities.makeCompactGrid(panel,  5,  2,  6, 6,  6,  6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}
}
