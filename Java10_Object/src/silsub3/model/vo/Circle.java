package silsub3.model.vo;

public class Circle {
	public static final double PI = 3.14;
	private static int radius;
	
	public Circle() {}
	
	public void setRadius(int radius) {
		Circle.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	
	public double getArea() {
		return PI*(radius*radius);
	}
	
	public double getCir() {
		return PI*radius*2.0;
	}
	
	public void incrementRadius() {
		radius++;
		System.out.println("반지름 1 증가 완료.");
	}
}