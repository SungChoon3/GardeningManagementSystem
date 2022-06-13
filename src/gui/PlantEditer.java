package gui;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import manager.PlantManager;
import plant.PlantInput;

public class PlantEditer extends JPanel implements ActionListener{
	WindowFrame frame;
	PlantManager plantmanager;
	JButton edit;
	DefaultTableModel model;
	JTable table;
	PlantViewer plantViewer;
	PlantInput pi;

	public PlantManager getPlantmanager() {
		return plantmanager;
	}

	public void setPlantmanager(PlantManager plantmanager) {
		this.plantmanager = plantmanager;
		this.removeAll();
		edit = new JButton("edit");
		this.plantViewer = new PlantViewer(frame, plantmanager);

		this.add(edit);
		this.model = this.plantViewer.getModel();
		this.model = new DefaultTableModel();
		this.model.addColumn("ID");
		this.model.addColumn("NAME");
		this.model.addColumn("TYPE");
		this.model.addColumn("LIGHT");

		for(int i = 0; i< plantmanager.size();i++) {
			Vector row = new Vector();
			this.pi = plantmanager.get(i);
			row.add(pi.getId());
			row.add(pi.getName());
			row.add(pi.getType());
			row.add(pi.getLight());
			this.model.addRow(row);
		}

		this.add(edit);

		edit.addActionListener(this);
		this.table = new JTable(this.model);
		this.table.setModel(this.model);
		JScrollPane sp = new JScrollPane(this.table);
		this.add(sp);
	}

	public PlantEditer(WindowFrame frame, PlantManager plantmanager) {
		this.frame = frame;
		this.plantmanager = plantmanager;

		edit = new JButton("edit");
		System.out.println("***" + plantmanager.size() + "***");
		this.model = new DefaultTableModel();
		this.model.addColumn("ID");
		this.model.addColumn("NAME");
		this.model.addColumn("TYPE");
		this.model.addColumn("LIGHT");

		for(int i = 0; i< plantmanager.size();i++) {
			Vector row = new Vector();
			this.pi = plantmanager.get(i);
			row.add(pi.getId());
			row.add(pi.getName());
			row.add(pi.getType());
			row.add(pi.getLight());
			this.model.addRow(row);
		}

		this.add(edit);

		edit.addActionListener(this);
		this.table = new JTable(this.model);
		this.table.setModel(this.model);
		JScrollPane sp = new JScrollPane(this.table);
		this.add(sp);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == edit) {
			int n = 0;
			String name = JOptionPane.showInputDialog(this, "수정할 이름 입력하세요");
			String rename = JOptionPane.showInputDialog(this, "이름 입력하세요");
			String id = JOptionPane.showInputDialog(this, "id 입력하세요");
			String type = JOptionPane.showInputDialog(this, "종류 입력하세요");
			String light = JOptionPane.showInputDialog(this, "광량 입력하세요");
			for(int j = 0; j<this.model.getRowCount(); j++) {
				if(name.equals(this.model.getValueAt(j, 1))) {
					this.model.removeRow(j);
					this.pi = plantmanager.get(j);
					if(pi.getId() == Integer.parseInt(id)) {
						pi.setId(Integer.parseInt(id));
						pi.setName(rename);
						pi.setType(type);
						pi.setLight(light);
						Vector row = new Vector();
						row.add(pi.getId());
						row.add(pi.getName());
						row.add(pi.getType());
						row.add(pi.getLight());
						this.model.addRow(row);
					}
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
