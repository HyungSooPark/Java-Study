package com.test01;

import java.util.Scanner;

public class WhileTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WhileTest01.testWhile();
		WhileTest01.testWhile4_2();
	}
	
	public static void testWhile() {
		int i=1;
		
		while(i<10) {
			System.out.println(i+"번째 반복문 수행!");
			i++;
		}
		
		System.out.println("while이 종료된 후 i의 값: "+i);
	}
	
	public static void testWhile2() {
		//문자열을 입력받아 인덱스별로 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String str = sc.next();
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		System.out.println();
	
		int i=0;
		
		while(i<str.length()) {
			char ch = str.charAt(i);
			System.out.println(ch);
			i++;
		}
		
		sc.close();
	}
	
	public static void testWhile3() {
		//1부터 입력받은 수까지 정수들의 합
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		int i=1,sum=0;
		
		while(i<=num) {
			sum+=i;
			i++;
		}
		System.out.printf("1부터 %d까지의 합계는 %d입니다.\n",num,sum);
		
		sc.close();
	}
	
	public static void testWhile4() {
		int i=1;
		
		while(true) {
			System.out.println(i);
			i++;
			
			if(i==10) break;
		}
	}
	
	public static void testWhile4_2() {
		//키보드로 4를 입력 받을때까지 반복
		//4가 입력되면 while문 종료
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 입력: ");
			int i = sc.nextInt();
			
			if(i==4) break;
		}
		
		System.out.println("4 입력 후 종료!");
		
		sc.close();
	}
}
