package com.practice;

import java.util.Scanner;

public class Example {
	public void sample1() {
		int kor, eng, math, tot;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수: ");
		kor = sc.nextInt();
		
		System.out.print("영어 점수: ");
		eng = sc.nextInt();
		
		System.out.print("수학 점수: ");
		math = sc.nextInt();
		
		tot = kor + eng + math;
		avg = tot/3.0;
		
		System.out.println("합계 점수: "+tot);
		System.out.println("평균 점수: "+avg);
		
		String res = (kor>=40 && eng>=40 && math>=40 && avg>=60) ? "합격 ":"불합격" ;
		
		System.out.println(res+"입니다.");
		
		sc.close();
	}
	
	public void sample2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("학년: ");
		int grade = sc.nextInt();
		
		System.out.print("반: ");
		int classno = sc.nextInt();
		
		System.out.print("번호: ");
		int stuno = sc.nextInt();
		
		System.out.print("성별(M/F): ");
		char gender = sc.next().charAt(0);
		
		System.out.print("성적: ");
		double score = Double.parseDouble(String.format("%.2f",sc.nextDouble()));
				
		String gend = (gender=='M' || gender=='m') ? "남학생" : "여학생";
		
		System.out.println(grade+"학년 "+classno+"반 "+stuno+"번 "+gend+" "+name+"은 성적이 "+score+"이다.");
		
		sc.close();
	}
	
	public void sample3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
			
		System.out.println((num>0)?"양수다":"양수가 아니다.");
		
		sc.close();
	}
	
	public void sample4() {
		int num;
		String res;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		num = sc.nextInt();
		
		res = (num%2==0)?"짝수다.":"홀수다.";
		
		System.out.println(res);
		
		sc.close();
	}
}
