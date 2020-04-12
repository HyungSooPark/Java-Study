package com.silsub2.point.model.vo;

public class Rectangle extends Point{
	//필드
	private int width;
	private int height;
	
	//생성자
	public Rectangle() {}
	
	public Rectangle(int x, int y,	 int width, int height) {
		super(x,y);
		if(width>0) this.width = width;
		else this.width = (-width);
		
		if(height>0) this.height = height;
		else this.height = (-height);
	}
	
	//getter & setter
	public void setWidth(int width) {
		if(width>0) this.width = width;
		else this.width = (-width);
	}
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int height) {
		if(height>0) this.height = height;
		else this.height = (-height);
	}
	public int getHeight() {
		return height;
	}
	
	@Override
	public void draw() {
		System.out.println("좌측 상단 꼭지점: "+"("+super.x+","+super.y+")");
		System.out.println("우측 상단 꼭지점: "+"("+(super.x+width)+","+super.y+")");
		System.out.println("좌측 하단 꼭지점: "+"("+super.x+","+(super.y-height)+")");
		System.out.println("우측 하단 꼭지점: "+"("+(super.x+width)+","+(super.y-height)+")");
		System.out.println("사각형의 면적: "+(width*height));
		System.out.println("사각형의 둘레: "+2*(width+height));
	}
}
