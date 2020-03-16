package p8_panelMakeLineOrRect;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {

	public Rectangle(int x1, int y1, Color color) {
		super(x1, y1, color);
	}
	
	@Override
	void draw(Graphics g) {
		g.setColor(color); 
		int rectWidth = Math.abs(x2-x1);
		int rectHeight = Math.abs(y2-y1);
		g.drawRect(Math.min(x1,x2),Math.min(y1,y2),rectWidth,rectHeight); 
	}
}
