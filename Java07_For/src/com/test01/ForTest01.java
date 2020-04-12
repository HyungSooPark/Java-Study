package com.test01;

import java.util.Scanner;

public class ForTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ForTest01.testFor3();
		ForTest01 test = new ForTest01();
		
		test.testFor5();
	}
	
	public static void testFor() {
		//0~10 출력
		for(int i=0;i<=10;i++) {
			System.out.println("i= "+i);
		}
	}
	
	public static void testFor2() {
		//1~100 역순으로 출력
		for(int i=100;i>0;i--) {
			System.out.printf("%3d ",i);
			if(i%10==1) System.out.println();
		}
	}
	
	public static void testFor2_2() {
		//증감식 2씩 증가
		for(int i=1;i<10;i+=3) {
			System.out.println(i+"번째 출력");
		}
		
		System.out.println();
		
		//초기식과 증감식은 1개 이상 기입 가능
		for(int i=0,j=10 ; i<10&&j>0 ; i++,j--) {
			System.out.println(i+"번째 i출력");
			System.out.println(j+"번째 j출력");
		}
		
		System.out.println();
		
		//int가 아닌 char 초기값 설정
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch);
		}
	}
	
	public static void testFor2_3() {
		/*int i=1;
		
		while(i<10) {
			System.out.println(i+"번째 반복문 수행!");
			i++;
		}*/
		
		int i=1;
		
		for(;;) {
			System.out.println(i+"번째 반복문 수행!");
			i++;
			if(i==10) break;
		}
	}
	
	public static void testFor3() {
		//정수를 하나 입력받아 그 수가 양수일때만 그 수의 구구단을 출력
		//양수가 아니면 "반드시 1~9 사이의 양수를 입력!!"이라고 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~9 사이의 양수를 하나 입력하세요: ");
		int num = sc.nextInt();
		
		if(num>=1&&num<=9) {
			for(int i=1;i<10;i++) {
				System.out.println(num+" * "+i+" = "+(num*i));
			}
		}
		else System.out.println("반드시 1~9 사이의 양수를 입력!!");
		
		sc.close();
	}
	
	public void testFor4() {
		//1~100사이 임의의 난수까지 정수들의 합계를 구하여 출력
		
		int rand = (int)(Math.random()*100+1);
		int sum=0;
		
		for(int i=1;i<=rand;i++) {
			sum+=i;
		}
		
		System.out.println("1부터 "+rand+"까지의 정수들의 합계 = "+sum);
	}
	
	public void testFor5() {
		//정수 두개 입력 후
		//작은수 ~ 큰수까지의 합
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력: ");
		int num1=sc.nextInt();
		
		System.out.print("두 번째 정수 입력: ");
		int num2=sc.nextInt();
		
		int sum=0;
		int max,min;
		
		if(num1>=num2) {
			max=num1;
			min=num2;
		}
		else {
			max=num2;
			min=num1;
		}
		
		for(int i=min;i<=max;i++) {
			sum+=i;
		}
		
		System.out.println(min+"부터 "+max+"까지의 정수들의 합 = "+sum);
		
		
		sc.close();
	}
}
