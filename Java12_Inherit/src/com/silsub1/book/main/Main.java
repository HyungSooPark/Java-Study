package com.silsub1.book.main;

import com.silsub1.book.model.vo.Book;

public class Main {

	public static void main(String[] args) {
		//초기값을 부여한 두 개의 객체 생성
		Book b1 = new Book("해리포터","조앤K롤링",10000);
		Book b2 = new Book("셜록홈즈","아서코난도일",15000);
				
		//두 객체의 정보 출력 --> toString()은 객체 호출시 자동으로 뒤에 JVM에 의해 생성
		System.out.println(b1);
		System.out.println(b2.toString());
		b1.equals(b2);
		System.out.println();
				
		
		//얕은 복사
		Book b3 = b1;
		b1.equals(b3);
		System.out.println();
		
		//깊은 복사
		Book b4 = new Book("해리포터","조앤K롤링",10000);
		b1.equals(b4);
		System.out.println();
		
		//두 객체의 값이 일치하는지 비교하여 결과 출력
		/*if(b1.equals(b4)) {
			System.out.println("서로 일치하는 책입니다.");
		}
		else {
			System.out.println("서로 일치하지 않습니다.");
		}*/
				
		System.out.println(b1.hashCode());
		System.out.println(b3.hashCode());
		System.out.println(b4.hashCode());
	}

}
