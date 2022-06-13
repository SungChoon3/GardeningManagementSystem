package gui;
import javax.swing.*;

import listener.ButtonAddListener;
import listener.ButtonDeleteListener;
import listener.ButtonEditListener;
import listener.ButtonViewListener;
import java.awt.event.*;
import java.awt.*;

public class MenuSelection extends JPanel{
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		this.frame = frame;
		
		this.setLayout(new BorderLayout());

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		JButton button1 = new JButton("Add Plant");
		JButton button2 = new JButton("Delete Plant");
		JButton button3 = new JButton("Edit Plant");
		JButton button4 = new JButton("View Plant");
		JButton button5 = new JButton("Exit Program");
		
		button1.addActionListener(new ButtonAddListener(frame));
		button2.addActionListener(new ButtonDeleteListener(frame));
		button3.addActionListener(new ButtonEditListener(frame));
		button4.addActionListener(new ButtonViewListener(frame));
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);

		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
	}
}
