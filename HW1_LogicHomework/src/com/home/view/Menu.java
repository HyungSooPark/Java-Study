package com.home.view;

import java.util.Scanner;

import com.home.controller.*;

//import com.home.controller.Function;

public class Menu {
	public static void displayMenu() {
		Scanner sc = new Scanner(System.in);
		Function func = new Function(); 
	
		int menu=0;
		
		do {
			System.out.println("*** 지역변수/연산자/제어문 연습 프로그램 ***");
			System.out.println();
			System.out.println("1. 간단 계산기");
			System.out.println("2. 작은수에서 큰수까지 합계구하기");
			System.out.println("3. 신상정보 확인하기");
			System.out.println("4. 학생정보 확인하기");
			System.out.println("5. 별과 숫자 출력하기");
			System.out.println("6. 난수까지의 합게 구하기");
			System.out.println("7. 구구단");
			System.out.println("8. 주사위 숫자 알아맞추기 게임");
			System.out.println("9. 프로그램 종료");
			System.out.println();			
			System.out.print("메뉴 번호 입력 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				func.calculator();
				break;
			case 2:
				func.totalCalculator();
				break;
			case 3:
				func.profile();
				break;
			case 4:
				func.sungjuk();
				break;
			case 5:
				func.printStarNumber();
				break;
			case 6:
				func.sumRandomNumber();
				break;
			case 7:
				func.continueGuguda();
				break;
			case 8:
				func.shutNumber();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
			
			System.out.println();
			
		}while(menu!=9);
		
		sc.close();
	}
}
