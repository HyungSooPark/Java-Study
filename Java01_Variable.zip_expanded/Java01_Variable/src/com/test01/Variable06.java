package com.test01;

public class Variable06 {
	public static void main(String[] args) {
		Variable06 test = new Variable06();
		
		test.rule3();
	}
	
	public void rule1() {
		//자료형이 다르더라도 작은 크기의 변수 타입은 큰 변수 타입으로 저장 가능
		//==>>자동형변환, 묵시적형변환, upcasting
		int num = 'a';
		System.out.println("num: "+num);
		
		//큰변수 타입은 작은 변수 타입으로 자동 변환 되지 않기 때문에 명시해야한다.
		//==>강제형변환, 명시적형변환, downcasting
		
		//char ch = -97; //에러
		
		//int 자료형 변수의 값은 강제형변환 해야 한다.
		char ch2 = (char)num;
		
		System.out.println("ch2: "+ch2);
		
		int num2 = -97;
		char ch3 = (char)num2;
		System.out.println("ch3: "+ch3);
	}
	
	public void rule2() {
		//다른 자료형끼리의 연산은 큰 자료형으로 자동형변환 후 연산처리된다
		int inum=10;
		long lnum=100;
		
		//int isum = inum + lnum;
		
		//방법1. 수행결과를 int로 강제형변환한다.
		int isum = (int)(inum+lnum);
				
		System.out.println("isum: "+isum);
		
		//방법2. long형값을 int로 강제형변환한다.
		int isum2 = inum + (int)lnum;
		
		System.out.println("isum2: "+isum2);
		
		//방법3. long형 변수로 받는다.
		long lsum = inum+lnum;
		
		System.out.println("lsum: "+lsum);
	}
	
	public void rule3() {
		long lnum = 100;
		
		float fnum = lnum;
		
		System.out.println("fnum: "+fnum);
		
		//실수는 정수로 변경할때 강제형변환 해줘야 한다.
		double dnum = 10.5;
		int inum = (int)dnum;
		
		System.out.println("inum: "+inum);
		System.out.println("(double)inum: "+(double)inum);
	}
}
