package p8_panelMakeLineOrRect;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shape{

	public Line(int x1, int y1, Color color) {
		super(x1, y1, color);
	}

	@Override
	void draw(Graphics g) {
		g.setColor(color); 
		g.drawLine(x1, y1, x2, y2); 
	}

}
