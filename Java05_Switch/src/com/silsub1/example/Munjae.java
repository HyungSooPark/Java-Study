package com.silsub1.example;

import java.util.Scanner;

public class Munjae {
	public void test1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 :");
		int kor = sc.nextInt();
		
		System.out.print("영어 :");
		int eng = sc.nextInt();
		
		System.out.print("수학 :");
		int mat = sc.nextInt();
		
		int sum = kor+eng+mat;
		
		double avg = sum/3.0;
		
		if(kor>=40&&eng>=40&&mat>=40&&avg>=60) {
			System.out.printf("합계:%d, 평균:%.2f로 합격입니다.\n",sum,avg);
		}
		else {
			System.out.println("불합격입니다.");
		}
		
		sc.close();
	}
	
	public void test2() {
		System.out.println("*** 초기 메뉴 ***");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴번호 입력 : ");
		int i = sc.nextInt();
		
		switch(i) {
		case 1:
			System.out.println("입력메뉴가 선택되었습니다.");
			break;
		case 2:
			System.out.println("수정메뉴가 선택되었습니다.");
			break;
		case 3:
			System.out.println("조회메뉴가 선택되었습니다.");
			break;
		case 4:
			System.out.println("삭제메뉴가 선택되었습니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
		default:
			System.out.println("번호가 잘못 입력되었습니다.");
			System.out.println("다시 입력하십시오.");
		}
		
		sc.close();
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력:");
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("양수다.");
		}
		else {
			System.out.println("양수가 아닙니다.");
		}
		
		sc.close();
	}
	
	public void test4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력:");
		int num = sc.nextInt();
		
		String res="";
		
		if(num>0) {
			if(num%2==0) {
				res = "짝수다.";
				System.out.println("입력된 정수는 "+res);
			}
			else {
				res = "홀수다.";
				System.out.println("입력된 정수는 "+res);
			}
		}
		else {
			System.out.println("양수가 아닙니다.");
		}
		
		sc.close();
	}
	
	public void inputTest() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		if(name!=null&&name.length()>0&&age>0&&height>0) {
			System.out.printf("%s의 나이는 %d세이고, 키는 %.1fcm이다.\n",name,age,height);
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
		
		sc.close();
	}
	
	public void test6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		if(num1>0&&num2>0) {
			System.out.println(num1+" + "+num2+" = "+(num1+num2));
			System.out.println(num1+" - "+num2+" = "+(num1-num2));
			System.out.println(num1+" * "+num2+" = "+(num1*num2));
			System.out.println(num1+" / "+num2+" = "+(num1/num2));
			System.out.println(num1+" % "+num2+" = "+(num1%num2));
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
		
		sc.close();
	}
}
