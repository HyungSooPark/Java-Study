package com.test01;

import java.util.Scanner;

public class ForTest02 {
	public static void main(String[] args) {
		ForTest02.testFor5();
	}
	
	public static void testFor1() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.println("i= "+i+", j= "+j);
			}
			System.out.println();
		}
	}
	
	public static void testFor2() {
		//구구단 2단부터 9단까지 출력
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println();
		}
	}
	
	public static void testFor3() {
		for(int hour=0;hour<24;hour++) {
			for(int min=0;min<60;min++) {
				System.out.println(hour+"시 "+min+"분");
			}
			System.out.println();
		}
	}
	
	public static void testFor4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 줄 수 : ");
		int row = sc.nextInt();
		/*
		 	*****
		 	*****
		 	*****
		 */
		for(int i=0;i<row;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
	
	public static void testFor5() {
		/* 한 줄에 별표문자를 입력된 줄수와 칸수만큼 출력
		   
		   1*****
		   *2****
		   **3***
		   ***4**
		   ****5*
		   *****6
		   
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 줄 수: ");
		int row = sc.nextInt();
		
		System.out.print("출력할 칸 수: ");
		int col = sc.nextInt();
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if(j==i) System.out.print(i);
				else System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
