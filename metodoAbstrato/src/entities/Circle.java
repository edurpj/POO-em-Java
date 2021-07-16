package entities;

import entities.color.Color;

public class Circle extends Shape{

	private Double radious;
	
	public Circle() {
		super();
	}
	

	public Circle(Color color, Double radious) {
		super(color);
		this.radious = radious;
	}

	

	public Double getRadious() {
		return radious;
	}


	public void setRadious(Double radious) {
		this.radious = radious;
	}


	@Override
	public double area() {
		return Math.PI * radious * radious;
	}

}
