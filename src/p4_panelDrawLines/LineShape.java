package p4_panelDrawLines;

import java.awt.Color;

public class LineShape {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	// constructor
	public LineShape(int x1, int y1, Color color) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x1;
		this.y2 = y1;
		this.color = color;
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

	private Color color;
	

	
	// set second position
	public void setSecondPos(int x2, int y2) {
		this.x2 = x2;
		this.y2 = y2;
	}
	
}
