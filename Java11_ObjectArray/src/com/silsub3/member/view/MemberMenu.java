package com.silsub3.member.view;

import java.util.Scanner;

import com.silsub3.member.controller.MemberManager;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberManager mManager = new MemberManager();
	
	public MemberMenu() {}
	
	public void mainMenu() {
		int choiceMenu=0;
		
		while(choiceMenu!=9) {
			System.out.println("최대 등록 가능한 회원 수는 "+MemberManager.SIZE+"명 입니다.");
			System.out.println("현재 등록된 회원 수는 "+mManager.getMemberCount()+"명 입니다.");
			
			System.out.println("***** 회원 관리 프로그램 *****");
			System.out.println();
			System.out.println("1. 새 회원 등록");
			System.out.println("2. 회원 조회");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 정렬");
			System.out.println("5. 회원 삭제");
			System.out.println("6. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 선택: ");
			choiceMenu = sc.nextInt();
			System.out.println();
			
			switch(choiceMenu) {
			case 1:
				mManager.memberInput();
				break;
			case 2:
				searchMenu();
				break;
			case 3:
				modifyMenu();
				break;
			case 4:
				sortMenu();
				break;
			case 5:
				mManager.deleteMember();
				break;
			case 6:
				mManager.printAllMember();
				break;
			case 9:
				System.out.print("정말로 끝내시겠습니까?(y/n): ");
				
			}
		}
	}
	
	public void searchMenu() {
		
	}
	
	public void sortMenu() {
		
	}
	
	public void modifyMenu() {
		
	}
}
