package com.test01;

import java.util.Scanner;

public class Operator06 {
	//(조건식) ? 참일때 : 거짓일때;
	
	public static void main(String[] args) {
		Operator06 op = new Operator06();
		
		op.opTest();
	}
	
	public void opTest() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		String res = (num>0) ? "양수다." : (num==0) ? "0이다" : "양수가 아니다." ;
		
		System.out.println("입력된 정수는 "+res);
		
		sc.close();
	}
}
