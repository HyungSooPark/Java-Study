package com.silsub2.point.model.vo;

public class Circle extends Point{
	//필드
	private int radius;
	
	//생성자
	public Circle() {}
	
	public Circle(int x, int y, int radius) {
		super(x,y);
		if(radius>0) this.radius = radius;
		else this.radius = (-radius);
	}
	
	//메소드
	@Override
	public void draw() {
		System.out.println("원의 중심: "+"("+super.x+","+super.y+")");
		System.out.println("반지름: "+radius);
		System.out.printf("원의 면적: %.1f\n",Math.PI * radius * radius);
		System.out.printf("원의 둘레: %.1f\n",Math.PI * radius * 2);
	}
}
