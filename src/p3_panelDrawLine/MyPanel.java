package p3_panelDrawLine;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.JPanel;


public class MyPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private Line line;
	
	public MyPanel() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				line = new Line(e.getX(),e.getY(),Color.black);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				line.setSecondPos(e.getX(), e.getY());
				repaint(); 
			}
		});
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				line.setSecondPos(e.getX(), e.getY());
				repaint();   	
			}
		});
		setBackground(new Color(100,255,100));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(line != null) {
			g.setColor(line.getColor()); 
			g.drawLine(line.getX1(),
					line.getY1(),
					line.getX2(),
					line.getY2()); 
		}
	}
}
