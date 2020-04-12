package com.example;

import java.util.Scanner;

public class Example {
	public void example1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수: ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수: ");
		int num2 = sc.nextInt();
		
		int add;
		int sub;
		int mul;
		int div;
		int rem;
		
		add = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = num1 / num2;
		rem = num1 % num2;
		
		System.out.println("더하기 결과: "+add);
		System.out.println("빼기 결과: "+sub);
		System.out.println("곱하기 결과: "+mul);
		System.out.println("나누기한 몫: "+div);
		System.out.println("나누기한 나머지: "+rem);
		
		sc.close();
	}
	
	public void example2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로: ");
		double length = sc.nextDouble();
		
		System.out.print("세로: ");
		double height = sc.nextDouble();
		
		double sur;
		double cir;
		
		sur = length * height;
		cir = (length + height) * 2;
		
		System.out.println("면적: "+sur);
		System.out.println("둘레: "+cir);
		
		sc.close();
	}
	
	public void example3() {
		Scanner sc = new Scanner(System.in);
		
		String input;
		
		System.out.print("문자열을 입력하시오: ");
		input = sc.nextLine();
		
		System.out.println("입력된 문자열:"+input);
		
		char fir;
		char sec;
		char thir;
		
		fir = input.charAt(0);
		sec = input.charAt(1);
		thir = input.charAt(2);
		
		System.out.println("첫번째 문자: "+fir);
		System.out.println("두번째 문자: "+sec);
		System.out.println("세번째 문자: "+thir);
		
		sc.close();
	}
}
