package com.silsub1.example;

import java.util.Scanner;

public class ForWhile {
	public void printStar1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int row = sc.nextInt();
		
		if(row>0) {
			for(int i=1;i<=row;i++) {
				for(int j=1;j<=i;j++) {
					if(j==i) System.out.print(i);
					else System.out.print("*");
				}
				System.out.println();
			}
		}
		else System.out.println("양수가 아닙니다.");
		
		sc.close();
	}
	
	public void printStar2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int row = sc.nextInt();
		
		if(row>0) {
			for(int i=1;i<=row;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else if(row==0) System.out.println("출력 기능이 없습니다.");
		else {
			for(int i=0;i>row;i--) {
				for(int j=row;j<i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		sc.close();
	}
	
	public void selectMenu() {
		Scanner sc = new Scanner(System.in);
		
		String[] menu = {"불고기버거","치킨버거","감자튀김","치즈스틱","샐러드","콜라","에이드","커피"};
		int[] cost = {3500,3200,1000,400,2000,700,1200,1000};
		
		int menuno[] = new int[10];
		int count[] = new int[10];
		
		int i=0;
		char choice;
		
		int total=0;
		
		do {
			System.out.println("**** 메뉴를 선택하세요 ****");
			System.out.println();
			System.out.println("햄버거 *****************");
			System.out.println("1. 불고기버거	3500원");
			System.out.println("2. 치킨버거	3200원");
			System.out.println("추가 ******************");
			System.out.println("3. 감자튀김	1000원");
			System.out.println("4. 치즈스틱	400원");
			System.out.println("5. 샐러드		2000원");
			System.out.println("음료수 *****************");
			System.out.println("6. 콜라		700원");
			System.out.println("7. 에이드		1200원");
			System.out.println("8. 커피		1000원");
			System.out.println("**********************");
		
			System.out.println();
			System.out.print("메뉴 선택(번호로 입력) : ");
			menuno[i] = sc.nextInt();
									
			System.out.print("수량은 ? ");
			count[i] = sc.nextInt();
			
			System.out.println(count[i]+"개 주문하셨습니다.");
			System.out.println();
			
			i++;
			
			System.out.print("추가 주문하시겠습니까?(y/n) : ");
			choice = sc.next().charAt(0);
		}while(choice=='y'||choice=='Y');
		
		System.out.println();
		System.out.println("* 주문하신 정보는 다음과 같습니다. *");
		System.out.println("-----------------------------------------------");
		for(int j=0;j<i;j++) {
			System.out.println(menu[menuno[j]-1]+" : "+count[j]+"개 - "+(cost[menuno[j]-1]*count[j])+"원");
			
			total+=(cost[menuno[j]-1]*count[j]);
		}
		System.out.println("-----------------------------------------------");
		System.out.println("총 가격 : "+total+"원");
		
		sc.close();
	}
	
	public void selectMenu2() {
		Scanner sc = new Scanner(System.in);
		
		String answer="";
		String menu="";
		String str="";
		int sum=0;
		int total=0;
		int count=0;
		int price=0;
		
		do {
			System.out.println("**** 메뉴를 선택하세요 ****");
			System.out.println();
			System.out.println("햄버거 *****************");
			System.out.println("1. 불고기버거	3500원");
			System.out.println("2. 치킨버거	3200원");
			System.out.println("추가 ******************");
			System.out.println("3. 감자튀김	1000원");
			System.out.println("4. 치즈스틱	400원");
			System.out.println("5. 샐러드		2000원");
			System.out.println("음료수 *****************");
			System.out.println("6. 콜라		700원");
			System.out.println("7. 에이드		1200원");
			System.out.println("8. 커피		1000원");
			System.out.println("**********************");
			
			System.out.println();
			System.out.print("메뉴 선택(번호로 입력) : ");
			int num1 = sc.nextInt();
			
			switch(num1) {
			case 1:
				menu = "불고기버거";
				str += "불고기버거";
				price = 3500;
				break;
			case 2:
				menu = "치킨버거";
				str += "치킨버거";
				price = 3200;
				break;
			case 3:
				menu = "감자튀김";
				str += "감자튀김";
				price = 1000;
				break;
			case 4:
				menu = "치즈스틱";
				str += "치즈스틱";
				price = 400;
				break;
			case 5:
				menu = "샐러드";
				str += "샐러드";
				price = 2000;
				break;
			case 6:
				menu = "콜라";
				str += "콜라";
				price = 700;
				break;
			case 7:
				menu = "에이드";
				str += "에이드";
				price = 1200;
				break;
			case 8:
				menu = "커피";
				str += "커피";
				price = 1000;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				System.exit(0);
			}
			
			System.out.println(menu+"를(을) 선택하셨습니다.");
			System.out.print("수량은 ? ");
			count=sc.nextInt();
			System.out.println(count+"개 주문하셨습니다.");
			sum = price * count;
			
			str += " : "+count+"개 - "+sum+"원"+"\n";
			total+=sum;				
			
			System.out.println();
			System.out.print("추가 주문하시겠습니까?(y/n) : ");
			answer = sc.next();
		}while(answer.equals("Y")||answer.equals("y"));
		
		System.out.println();
		System.out.println("* 주문하신 정보는 다음과 같습니다. *");
		System.out.println("-----------------------------------------------");
		System.out.println(str);
		System.out.println("-----------------------------------------------");
		System.out.println("총 가격 : "+total+"원");
		
		sc.close();
	}
	
	public void countInputCharacter() {
		Scanner sc = new Scanner(System.in);
		
		int count=0;
		
		System.out.print("문자열 입력 : ");
		String str = sc.next();
			
		Boolean res = str.matches("^[A-Za-z]*$");
		
		if(res==true) {
			System.out.print("문자 입력 : ");
			char ch = sc.next().charAt(0);
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)==ch) count++;
			}
			
			System.out.println("포함된 갯수 : "+count+"개");
		}
		else System.out.println("영문자가 아닙니다.");
				
		sc.close();
	}
}
