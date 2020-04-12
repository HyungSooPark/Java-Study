package com.test01;

public class MethodTest02 {
	public static void main(String[] args) {
		//method 호출 방법
		//1. static : class.method();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		//MethodTest01.privatMethod();
		
		//2. non static : class 변수명 = new class();
		//				   변수명.method();
		MethodTest01 test = new MethodTest01();
		test.NonstaticMethod();
	}
}
