package entities;

import entities.color.Color;

public abstract class  Shape {
	 
	private Color color;
	
	public Shape() {
	}
	
	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public static double area() {
		// TODO Auto-generated method stub
		return 0;
	}
}
