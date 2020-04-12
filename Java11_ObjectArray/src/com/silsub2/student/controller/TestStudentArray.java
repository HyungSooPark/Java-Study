package com.silsub2.student.controller;

import java.util.Scanner;

import com.silsub2.student.model.vo.Student;

public class TestStudentArray {

	public static void main(String[] args) {
		Student s[] = new Student[5];
		
		int i = 0;
		int count = 0;
		char choice = 'y';
		
		Scanner sc = new Scanner(System.in);
		
		while(choice == 'y') {
			System.out.print("학년: ");
			int year = sc.nextInt();
			
			System.out.print("반: ");
			int classno = sc.nextInt();
			
			System.out.print("이름: ");
			String name = sc.next();
			
			System.out.print("국어점수: ");
			int kor = sc.nextInt();
			
			System.out.print("영어점수: ");
			int eng = sc.nextInt();
			
			System.out.print("수학점수: ");
			int math = sc.nextInt();
			
			s[i] = new Student(year,classno,name,kor,eng,math);
			i++;
			count++;
			
			if(count==10) {
				System.out.println();
				break;
			}
			System.out.println();
			System.out.print("계속 추가하겠습니까?(y/n): ");
			choice = sc.next().charAt(0);
			System.out.println();
		}
		
		for(i=0;i<count;i++) {
			System.out.println(s[i]);
		}
		
		double avgKor=0;
		double avgEng=0;
		double avgMath=0;
		
		for(i=0;i<count;i++) {
			avgKor += s[i].getKor();
			avgEng += s[i].getEng();
			avgMath += s[i].getMath();
		}
		
		avgKor /= count;
		avgEng /= count;
		avgMath /= count;
		
		System.out.println();
		System.out.println("<국어평균: "+avgKor+", 영어평균: "+avgEng+", 수학평균: "+avgMath);
		
		sc.close();
	}

}
