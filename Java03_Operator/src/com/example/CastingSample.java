package com.example;

import java.util.Scanner;

public class CastingSample {
	public void printUniCode() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력: ");
		char ch = sc.next().charAt(0);
		
		System.out.print(ch+"is unicoe : "+(int)ch);
		
		sc.close();
	}
	
	public void calculatorScore() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		
		System.out.println("총점 : "+(int)(kor+eng+math));
		
		System.out.println("평균 : "+(int)((kor+eng+math)/3)); 
		
		sc.close();
	}
}
