package p6_panelWithLinesAndRectangles;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
	protected int x1;
	protected int y1;
	protected int x2;
	protected int y2;
	protected Color color;
	

	// constructor
	public Shape(int x1, int y1, Color color) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x1;
		this.y2 = y1;
		this.color = color;
	}
	
	// set second position
	public void setSecondPos(int x2, int y2) {
		this.x2 = x2;
		this.y2 = y2;
	}
	
	
	public int getX1() {
		return x1;
	}
	public int getY1() {
		return y1;
	}
	public int getX2() {
		return x2;
	}
	public int getY2() {
		return y2;
	}
	public Color getColor() {
		return color;
	}

	void draw(Graphics g) {
		
	}

}
