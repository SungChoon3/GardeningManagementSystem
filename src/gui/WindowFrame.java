package gui;

import javax.swing.*;

import manager.PlantManager;


public class WindowFrame extends JFrame {
	PlantManager plantmanager;
	MenuSelection menuselection;
	PlantAdder plantadder;
	PlantViewer plantviewer;
	
	public WindowFrame(PlantManager plantmanager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.plantmanager = plantmanager;
		this.menuselection = new MenuSelection(this);
		this.plantadder = new PlantAdder(this);
		this.plantviewer = new PlantViewer(this, this.plantmanager);
		
		this.add(menuselection);
		
		this.setVisible(true);
	}
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	public MenuSelection getMenuselection() {
		return menuselection;
	}
	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}
	public PlantAdder getPlantadder() {
		return plantadder;
	}
	public void setPlantadder(PlantAdder plantadder) {
		this.plantadder = plantadder;
	}
	public PlantViewer getPlantviewer() {
		return plantviewer;
	}
	public void setPlantviewer(PlantViewer plantviewer) {
		this.plantviewer = plantviewer;
	}
}
