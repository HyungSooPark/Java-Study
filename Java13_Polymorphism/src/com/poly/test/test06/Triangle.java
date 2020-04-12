package com.poly.test.test06;

import java.util.Scanner;

public class Triangle extends AreaImpl{

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변 입력: ");
		int x = sc.nextInt();
		
		System.out.print("높이 입력: ");
		int y = sc.nextInt();
		
		double res = x*y*0.5;
		
		super.setRes(String.format("%f", res));
	}
	
	@Override
	public void print() {
		System.out.print("삼각형의 ");
		super.print();
	}

}
