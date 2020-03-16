package p6_panelWithLinesAndRectangles;

import java.awt.Color;
import java.awt.Graphics;


public class Rectangle extends Shape {

	public Rectangle(int x1, int y1, Color color) {
		super(x1, y1, color);
	}
	
	@Override
	void draw(Graphics g) {
		g.setColor(color); 
		g.drawRect(x1,y1,x2-x1,y2-y1); 
	}
}
