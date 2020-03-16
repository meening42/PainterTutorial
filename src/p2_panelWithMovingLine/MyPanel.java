package p2_panelWithMovingLine;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private int lineX =100;
	private int lineY =100;
	public MyPanel() {
		
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lineX = e.getX();
				lineY = e.getY();
				repaint(); 
			}
		});
		setBackground(new Color(50,255,50));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black); // barva risanja
		g.drawLine(0, 10, lineX, lineY); // izris crte
		g.drawLine(200, 80, 250, 90); // izris crte
	} // paintComponent
	
	
}
