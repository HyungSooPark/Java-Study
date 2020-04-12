package com.test01;

import java.util.Scanner;

public class Variable03 {
	public static void main(String[] args) {
		Variable03 test = new Variable03();
		
		test.changeValue();
	}
	
	public void changeValue() {
		//변수선언
		String name;
		char gender;
		int age;
		double height;
		
		//변수 초기화
		name = "박형수";
		gender = 'M';
		age = 27;
		height = 178.5;
			
		//키보드로 입력받아 변수에 저장된 값 변경
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		name = sc.nextLine();
		
		System.out.print("성별: ");
		gender = sc.next().charAt(0);
		//문자를 읽어오는 메소드는 제공하지 X, 그래서 charAt() 사용		
		
		System.out.print("나이: ");
		age = sc.nextInt();
				
		System.out.print("키: ");
		height = sc.nextDouble();
			
		System.out.println(name+"님의 정보 ");
		System.out.println("gender: "+gender);
		System.out.println("age: "+age);
		System.out.println("height: "+height);
		
		sc.close();
	}
}
