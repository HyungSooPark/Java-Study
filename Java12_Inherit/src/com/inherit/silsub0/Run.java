package com.inherit.silsub0;

public class Run {

	public static void main(String[] args) {
		SportsCar c1 = new SportsCar("빨강");
		
		c1.accelPedal();
		System.out.println(c1.toString());
		c1.accelPedal();
		c1.accelPedal();
		System.out.println(c1.toString());
		c1.breakPedal();
		System.out.println(c1);
		System.out.println();
		
		//////////////////////////////////
		Car c2 = new SUV("검정");
		c2.accelPedal();
		c2.accelPedal();
		System.out.println(c2);
		c2.breakPedal();
		c2.breakPedal();
		c2.breakPedal();
		System.out.println(c2);
	}

}