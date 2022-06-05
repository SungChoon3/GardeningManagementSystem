package gui;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import manager.PlantManager;
import plant.PlantInput;

public class PlantViewer extends JPanel {
	WindowFrame frame;
	PlantManager plantmanager;
	
	public PlantViewer(WindowFrame frame, PlantManager plantmanager) {
		this.frame = frame;
		this.plantmanager = plantmanager;
		
		System.out.println("***" + plantmanager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("NAME");
		model.addColumn("TYPE");
		model.addColumn("LIGHT");
		
		for(int i = 0; i< plantmanager.size();i++) {
			Vector row = new Vector();
			PlantInput pi = plantmanager.get(i);
			row.add(pi.getId());
			row.add(pi.getName());
			row.add(pi.getType());
			row.add(pi.getLight());
			
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
