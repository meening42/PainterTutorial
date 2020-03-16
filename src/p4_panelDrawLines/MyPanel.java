package p4_panelDrawLines;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.JPanel;


public class MyPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private ArrayList<LineShape> lines= new ArrayList<LineShape>();
	
	public MyPanel() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lines.add(new LineShape(e.getX(),e.getY(),Color.black));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				int lastElement = lines.size()-1;
				lines.get(lastElement).setSecondPos(e.getX(), e.getY());
				repaint(); 
			}
		});
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				if (lines.size() >0) {
					int lastElement = lines.size()-1;
					lines.get(lastElement).setSecondPos(e.getX(), e.getY());
					repaint(); 
				}  	
			}
		});
		setBackground(new Color(150,255,150));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for(LineShape line:lines) {
			g.setColor(line.getColor()); 
			g.drawLine(line.getX1(),
						line.getY1(),
						line.getX2(),
						line.getY2()); 
		}
	}
	
	
}
