package entities;

import entities.color.Color;

public class retangule extends Shape{

	private Double height;
	private Double Width;
	
	public retangule() {
		super();
	}
	
	
	public retangule(Color color, Double height, Double width) {
		super(color);
		this.height = height;
		Width = width;
	}

	

	public Double getHeight() {
		return height;
	}


	public void setHeight(Double height) {
		this.height = height;
	}


	public Double getWidth() {
		return Width;
	}


	public void setWidth(Double width) {
		Width = width;
	}


	@Override
	public double area() {
		return Width * height;
	}

}
