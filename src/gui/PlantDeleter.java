package gui;

import java.awt.event.*;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.PlantManager;
import plant.PlantInput;

public class PlantDeleter extends JPanel implements ActionListener{
	WindowFrame frame;
	PlantManager plantmanager;
	JButton del;
	DefaultTableModel model;
	JTable table;
	PlantViewer plantViewer;

	public PlantManager getPlantmanager() {
		return plantmanager;
	}
	public void setPlantmanager(PlantManager plantmanager) {
		this.plantmanager = plantmanager;
		this.removeAll();
		del = new JButton("Del");
		this.plantViewer = new PlantViewer(frame, plantmanager);

		this.add(del);
		this.model = this.plantViewer.getModel();
		this.model = new DefaultTableModel();
		this.model.addColumn("ID");
		this.model.addColumn("NAME");
		this.model.addColumn("TYPE");
		this.model.addColumn("LIGHT");

		for(int i = 0; i< plantmanager.size();i++) {
			Vector row = new Vector();
			PlantInput pi = plantmanager.get(i);
			row.add(pi.getId());
			row.add(pi.getName());
			row.add(pi.getType());
			row.add(pi.getLight());
			this.model.addRow(row);
		}

		this.add(del);
		del.addActionListener(this);
		this.table = new JTable(this.model);
		this.table.setModel(this.model);
		JScrollPane sp = new JScrollPane(this.table);
		this.add(sp);
	}
	public PlantDeleter(WindowFrame frame, PlantManager plantmanager) {
		this.frame = frame;
		this.plantmanager = plantmanager;		

		del = new JButton("Del");
		System.out.println("***" + plantmanager.size() + "***");

		this.model = new DefaultTableModel();
		this.model.addColumn("ID");
		this.model.addColumn("NAME");
		this.model.addColumn("TYPE");
		this.model.addColumn("LIGHT");

		for(int i = 0; i< plantmanager.size();i++) {
			Vector row = new Vector();
			PlantInput pi = plantmanager.get(i);
			row.add(pi.getId());
			row.add(pi.getName());
			row.add(pi.getType());
			row.add(pi.getLight());
			this.model.addRow(row);
		}
		this.add(del);

		del.addActionListener(this);
		this.table = new JTable(this.model);
		this.table.setModel(this.model);
		JScrollPane sp = new JScrollPane(this.table);
		this.add(sp);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == del) {			
			int n = 0;
			String name = JOptionPane.showInputDialog(this, "이름 입력하세요");
			for(int j = 0; j<this.model.getRowCount(); j++) {
				if(name.equals(this.model.getValueAt(j, 1))) {
					this.model.removeRow(j);
					j--;
					n = 1;
				}
			}
			if(n==0) {
				JOptionPane.showMessageDialog(this, "해당 이름은 없습니다.");
			}
		}
	}
}
