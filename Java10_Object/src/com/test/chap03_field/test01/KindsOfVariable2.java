package com.test.chap03_field.test01;

public class KindsOfVariable2 {
	//전역변수
	public static int staticNum;
	
	//상수필드 : static과 final 키워드를 함께 사용하는 것
	//반드시 초기화, 변하지 않는 값을 공유할 목적으로 사용(특별한 목적 없이는 사용 지양)
	public final static int STATIC_NUM = 1;
	public static final int STATIC_NUM2 = 1;
	
	public void methodTest() {
		//non static 메소드 안에서 static 사용 불가
		//static int localStaticNum;
	}
}
