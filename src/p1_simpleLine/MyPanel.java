package p1_simpleLine;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class MyPanel extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.green);
		g.setColor(Color.black); // barva risanja
		g.drawLine(50, 80, 350, 150); // izris crte
		g.drawLine(200, 80, 250, 90); // izris crte
		
	} // paintComponent
}
