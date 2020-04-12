package com.inherit.silsub0;

public class Car {
	//필드
	private String color;
	private int speed;
	
	//생성자
	public Car() {}
	
	public Car(String color) {
		this.color = color;
	}
	
	public Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	//getter & setter
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	
	public void accelPedal() {
		System.out.println("속도가 올라갑니다.");
		setSpeed(getSpeed()+10);
	}
	public void breakPedal() {
		setSpeed(getSpeed()-10);
		
		if(getSpeed()>0) {
			System.out.println("속도가 내려갑니다.");
		}
		else {
			System.out.println("정지하였습니다.");
			setSpeed(0);
		}
	}
	
	//속도 출력 메소드(필드확인 메소드)
	@Override
	public String toString() {
		return "현재 속도는 "+speed+"입니다.";
	}
	
}
