package p5_panelWithShapesAndLines;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.JPanel;


public class MyPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private ArrayList<Shape> shapes= new ArrayList<Shape>();
	
	public MyPanel() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				shapes.add(new LineShape(e.getX(),e.getY(),Color.black));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				int lastElement = shapes.size()-1;
				shapes.get(lastElement).setSecondPos(e.getX(), e.getY());
				repaint(); 
			}
		});
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				if (shapes.size() >0) {
					int lastElement = shapes.size()-1; 
					shapes.get(lastElement).setSecondPos(e.getX(), e.getY());
					repaint(); 
				}  	
			}
		});
		
		
		
		
		
		setBackground(new Color(200,255,200));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for(Shape shape:shapes) {
			shape.draw(g);
		}
	}
	
	
}
