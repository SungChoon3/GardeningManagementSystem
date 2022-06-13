package gui;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import manager.PlantManager;
import plant.PlantInput;

public class PlantViewer extends JPanel {
	WindowFrame frame;
	PlantManager plantmanager;
	DefaultTableModel model;
	JTable table;
	JScrollPane sp;
	public PlantManager getPlantmanager() {
		return plantmanager;
	}
	public void setPlantmanager(PlantManager plantmanager) {
		this.plantmanager = plantmanager;
		this.removeAll();
		
		this.setModel(this.model);
		this.table = new JTable(this.model);
		this.sp = new JScrollPane(this.table);
		
		this.add(sp);
	}
	public PlantViewer(WindowFrame frame, PlantManager plantmanager) {
		this.frame = frame;
		this.plantmanager = plantmanager;
		
		System.out.println("***" + plantmanager.size() + "***");
		
		this.setModel(this.model);
		this.table = new JTable(this.model);
		this.sp = new JScrollPane(this.table);
		
		this.add(sp);
	}	
	public void setModel(DefaultTableModel model) {		
		model = new DefaultTableModel();
		this.model = model;
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
	}
	public DefaultTableModel getModel() {
		return this.model;
	}
}
