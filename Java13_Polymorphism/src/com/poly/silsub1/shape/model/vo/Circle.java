package com.poly.silsub1.shape.model.vo;

public class Circle implements IShape {
	static final double PI = Math.PI;
	private double radius;
	
	public Circle() {}
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return PI*radius*radius;
	}

	@Override
	public double perimeter() {
		return PI*radius*2.0;
	}
}
