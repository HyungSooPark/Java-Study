package com.test.chap04_wrapperClass.run;

public class Run {

	public static void main(String[] args) {
		//Boxing: 기본자료형 --> Wrapper 클래스 객체
		//UnBoxing: Wrapper 클래스 객체 --> 기본자료형
		
		//Boxing
		Integer i = new Integer(10);
		Integer i2 = new Integer(15);
		Double d = new Double(10.0);
		
		System.out.println(i.equals(i2));
		System.out.println(i.compareTo(i2));
		//0 --> 같을때, 양수면 i가 큰 수일때, 음수면 i2가 큰 수일때
		
		//AutoBoxing
		Short i3 = 10;
		Integer i4 = 5;	//Integer i4 = new Integer(5);
		
		//UnBoxing
		//Wrapper 클래스 --> 기본자료형
		int pi = i.intValue();
		double pd = d.doubleValue();
		
		//AutoUnBoxing
		int a = i;
		int b = i2;	//int b = i2.intValue();
		
		System.out.println(a+b);
		
		abox(a+b);
		//int >> (authoboxing) >> Integer >> (다형성) >> object
	}
	
	public static void abox(Object obj) {
		//System.out.println((int)obj);
		System.out.println((Integer)obj);
	}
}
