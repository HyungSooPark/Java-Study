package com.test.chap05_method.test02;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticMethodTest test = new NonStaticMethodTest();
		
		//매개변수와 반환값이 없는 메소드
		test.method1();
		
		//매개변수가 없고 반환값이 있는 메소드
		/*String res = test.method2();
		System.out.println(res);*/
		System.out.println(test.method2());
		
		//매개변수가 있고 반환값이 없는 메소드
		test.method3(10, 20);
		
		//매개변수가 있고 반환값이 있는 메소드
		/*int sum = test.method4(3, 9);
		System.out.println("sum: "+sum);*/
		System.out.println("sum: "+test.method4(3, 12));
		
		System.out.println();
		
		//static 메소드 호출시에는 객체 생성하지 않고 호출
		StaticMethodTest.staticMethod1();
		
		System.out.println("10과 25의 합은 "+StaticMethodTest.staticMethod2()+"입니다.");
		
		StaticMethodTest.staticMethod3("홍길동");
		
		System.out.println(StaticMethodTest.staticMethod4("이순신"));
		
	}

}
