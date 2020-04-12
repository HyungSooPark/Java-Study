package com.test01;

public class Variable01 {
	// 타입 변수명 = 값
	// 타입 : 생성할 변수에 어떠한 종류의 값이 들어갈지 타입을 지정
	// 변수명 : 변수의 이름
	// 값 : 리터럴, 변수에 들어갈 데이터
	public static void main(String[] args) {
		
		Variable01 test = new Variable01();
		//클래스명 변수명 = new 클래스명();
		
		test.initVariable();
	}
	
	public void decVariable() {
		
	}
	
	public void initVariable() {
		//변수 선언과 동시에 초기화
		byte bnum = 1;
		short snum = 2;
		int inum = 4;
		long lnum = 8L;
		
		float fnum = 8.0F;
		double dnum = 16.0;
		
		boolean isTrue = false;
		
		char ch = 's';
		String str = "string";
	
		System.out.println("bnum의 값: "+bnum);
		System.out.println("snum의 값: "+snum);
		System.out.println("inum의 값: "+inum);
		System.out.println("lnum의 값: "+lnum);
		
		System.out.println("fnum의 값: "+fnum);
		System.out.println("dnum의 값: "+dnum);
		
		System.out.println("isTrue의 값: "+isTrue);

		System.out.println("ch의 값: "+ch);
		System.out.println("str의 값: "+str);
	}
}
