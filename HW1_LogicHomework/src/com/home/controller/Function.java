package com.home.controller;

import java.util.Scanner;
import java.util.Random;

public class Function {
	public void calculator() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산문자 : ");
		char cal = sc.next().charAt(0);
		
		switch(cal) {
		case '+':
			System.out.println(num1+" + "+num2+" = "+(num1+num2));
			break;
		case '-':
			System.out.println(num1+" - "+num2+" = "+(num1-num2));
			break;
		case '*':
			System.out.println(num1+" * "+num2+" = "+(num1*num2));
			break;
		case '/':
			if(num2!=0) {
				System.out.println(num1+" / "+num2+" = "+(num1/num2));
			}
			else {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
	}
	
	public void totalCalculator() {
		Scanner sc = new Scanner(System.in);
		
		int max,min;
		int sum=0;
		
		System.out.println();
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		if(num1>=num2) {
			max = num1;
			min = num2;
		}
		else {
			max = num2;
			min = num1;
		}
		
		for(int i=min;i<=max;i++) {
			sum +=i;
		}
		
		System.out.println(min+"부터 "+max+"까지 정수들의 합계 : "+sum);
		System.out.println();
	}
	
	public void profile() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("이름 : ");
		String name = sc.next();
			
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("성격 : ");
		String pers = sc.next();
		
		System.out.println();
		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age+"세");
		if(gender=='M'||gender=='m') {
			System.out.println("성별 : 남자");
		}
		else if(gender=='F'||gender=='f') {
			System.out.println("성별 : 여자");
		}
		else {
			System.out.println("성별 : 입력이 잘못되었습니다.");
		}
		System.out.println("성격 : "+pers);
	}
	
	public void sungjuk() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("이름 : ");
		String name = sc.next();
			
		System.out.print("학년 : ");
		int year = sc.nextInt();
		System.out.print("반 : ");
		int classno = sc.nextInt();
		System.out.print("번호 : ");
		int stuno = sc.nextInt();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		
		String gend = gender=='M' || gender=='m' ? "남학생" : (gender=='F'||gender=='f' ? "여학생" : "성별 인식 불가");
		
		System.out.print("성적 : ");
		double score = sc.nextDouble();
		
		char grade;
		
		if(score>=90) {
			grade='A';
		}
		else if(score>=80) {
			grade='B';
		}
		else if(score>=70) {
			grade='C';
		}
		else if(score>=60) {
			grade='D';
		}
		else {
			grade='F';
		}
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 점수는 %.2f이고, %c 학점입니다.\n",year,classno,stuno,gend,name,score,grade);
	}
	
	public void printStarNumber() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		if(num>0) {
			for(int i=1;i<=num;i++)
			{
				for(int j=1;j<=i;j++)
				{
					if(j==i) System.out.print(j);
					else System.out.print("*");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("양수가 아닙니다.");
		}
	}
	
	public void sumRandomNumber() {
		int randnum = (int)(Math.random()*100)+1;
		
		int sum=0;
		
		System.out.println();
		
		for(int i=1;i<=randnum;i++) {
			sum+=i;
		}
		
		System.out.println("1부터 생성된 난수 "+randnum+"까지의 합계 = "+sum);
	}
	
	public void continueGuguda() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		if(num>0) {
			for(int i=1;i<=9;i++) {
				if(i%num==0) continue;
				else {
					System.out.println(num+" * "+i+" = "+num*i);
				}
			}
		}
		else {
			System.out.println("양수가 아닙니다.");
		}
	}
	
	public void shutNumber() {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int dice1=1;
		int dice2=1;
		
		char choice;
				
		do {
			dice1 = rand.nextInt(6)+1;
			dice2 = rand.nextInt(6)+1;
			
			System.out.println();
			
			System.out.println("주사위 1의 눈 : "+dice1+"\n주사위 2의 눈 : "+dice2);
			
			if(dice1==dice2) System.out.println("맞췄습니다.");
			else System.out.println("틀렸습니다.");
			
			System.out.print("계속 하시겠습니까?(y/n) : ");
			choice = sc.next().charAt(0);
									
		}while(choice!='n' && choice!='N');
	}
}
