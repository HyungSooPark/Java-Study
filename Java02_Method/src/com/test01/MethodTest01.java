package com.test01;

public class MethodTest01 {
	public static void main(String[] args) {
		//static method 사용
		//1. 클래스명.메소드명();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		//2. 메소드명();
		defaultMethod();
		privateMethod();
		
		//non static method 사용
		MethodTest01 mt01 = new MethodTest01();
		mt01.NonstaticMethod();
	}
	
	//어디서나 접근, 문서상 ( + )
	public static void publicMethod() {
		System.out.println("public method()");
	}
	
	//상속일 경우 상속된 곳에서,
	//상속이 아닌 경우 같은 패키지 내에서 ( # )
	protected static void protectedMethod() {
		System.out.println("protected method()");
	}
	
	//같은 패키지 내에서 (default)
	static void defaultMethod() {
		System.out.println("default method()");
	}
	
	//현재 클래스 내에서만 ( - )
	private static void privateMethod() {
		System.out.println("private method()");
	}
	
	//static메소드는 오직 스태틱메소드만 접근 가능
	public void NonstaticMethod() {
		System.out.println("non static method()");
	}
	
	
}
