package com.test01;

public class Operator03 {
	public static void main(String[] args) {
		Operator03 op = new Operator03();
		
		op.opTest();
	}
	
	public void opTest() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = "+ (num1+num2));
		System.out.println("num1 - num2 = "+ (num1-num2));
		System.out.println("num1 * num2 = "+ (num1*num2));
		System.out.println("num1 / num2 = "+ (num1/num2));
		System.out.println("num1 % num2 = "+ (num1%num2));
	}
}
