package com.test01.run;

import java.util.Scanner;

import com.test01.model.Book;

public class ObjectArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//book[] bk = new Book[3];
		
		//초기화
		/*bk[0] = new Book();
		bk[1] = new Book();
		bk[2] = new Book();*/
		
		//선언 및 할당과 동시에 초기화
		Book[] bk = {
				new Book("자바의 정석","홍길동","나무",27000),
				new Book("C언어의 정석","이창진","KH",13000),
				new Book("프로그래밍","이순신","케이에이치",5500)
		};
		
		/*System.out.println(bk);
		System.out.println(bk[0]);
		System.out.println(bk[0].getTitle());*/
		
		System.out.println("도서 갯수: "+bk.length);
		
		for(int i=0;i<3;i++) {
			System.out.println(bk[i].info());
		}
		
		//도서 검색
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 도서명: ");
		String sTitle = sc.nextLine();
		
		int tmp=0;
		
		for(int i=0;i<3;i++) {
			if(bk[i].getTitle().equals(sTitle)) {
				System.out.println(bk[i].info());
				tmp++;
			}
		}
		if(tmp==0) {
			System.out.println("일치하는 도서가 없습니다.");
		}
		
		sc.close();
	}

}
