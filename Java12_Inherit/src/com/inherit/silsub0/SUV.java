package com.inherit.silsub0;

public class SUV extends Car{
	public SUV() {
		super();
		System.out.println("SUV 생성");
	}
	
	public SUV(String color) {
		super(color);
		System.out.println(color+"색 SUV 생성");
	}
	
	@Override
	public void accelPedal() {
		super.setSpeed(super.getSpeed()+15);
		System.out.println("속도가 적당히 올라갑니다.");
	}
	
	@Override
	public void breakPedal() {
		super.setSpeed(super.getSpeed()-15);
		
		if(super.getSpeed()>0) {
			System.out.println("속도가 적당히 내려갑니다.");
		}
		else {
			System.out.println("정지하였습니다.");
			super.setSpeed(0);
		}
	}
	
	@Override
	public String toString() {
		return "SUV의 현재 속도는 "+getSpeed()+"입니다.";
	}
}
