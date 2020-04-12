package com.inherit.silsub0;

public class SportsCar extends Car{
	public SportsCar() {
		super();	//원래 생략되있지만 명시해도 상관없다.
		System.out.println("sportscar 생성");
	}
	
	public SportsCar(String color) {
		super(color);
		System.out.println(color+"색 sportscar 생성");
	}
	
	@Override
	public void accelPedal() {
		System.out.println("속도가 더 빨리 올라갑니다.");
		super.setSpeed(super.getSpeed()+30);
	}
	
	@Override
	public void breakPedal() {
		super.setSpeed(super.getSpeed()-30);
		
		if(super.getSpeed()>0) {
			System.out.println("속도가 더 빨리 내려갑니다.");
		}
		else {
			System.out.println("정지하였습니다.");
			super.setSpeed(0);
		}
	}
	
	@Override
	public String toString() {
		return "sportscar의 현재 속도는 "+super.getSpeed()+"입니다.";
	}
}
