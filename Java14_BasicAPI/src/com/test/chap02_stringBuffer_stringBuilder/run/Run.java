package com.test.chap02_stringBuffer_stringBuilder.run;


public class Run {
	/*
	 * StringBuffer, StringBuilder의 특징
	 * - mutable 클래스, 변경과 저장을 위한 메모리공간(버퍼)을 내부에 지닌다.
	 * - 버퍼의 초기값 16개의 문자를 저장 가능하다. 자동으로 증가
	 */
	public static void main(String[] args) {
		Run.method3();
	}
	
	public static void method1() {
		StringBuilder sb = new StringBuilder("내일 휴일임");
		System.out.println(sb.length());	//6
		System.out.println(sb.capacity());	//16+6
		
		StringBuilder sb1 = new StringBuilder(21);
		System.out.println(sb1.capacity());
		
		System.out.println(sb);
	}
	
	public static void method2() {
		String str = "반가워! ";
		System.out.println("str 기존: "+str+", 주소: "+str.hashCode());
		str += "나는 String이라고 해";
		System.out.println("str 추가 후: "+str+", 주소: "+str.hashCode());
		System.out.println();
		
		StringBuffer sbf = new StringBuffer("안녕! ");
		System.out.println("sbf 기존: "+sbf+", 주소: "+sbf.hashCode());
		sbf.append("난 StringBuffer얌!");
		System.out.println("sbf 추가 후: "+sbf+", 주소: "+sbf.hashCode());
		System.out.println();
		
		StringBuilder sbd = new StringBuilder("하이~ ");
		System.out.println("sbd 기존: "+sbd+", 주소: "+sbd.hashCode());
		sbd.append("난 StringBuilder지");
		System.out.println("sbd 추가 후: "+sbd+", 주소: "+sbd.hashCode());
	}
	
	public static void method3() {
		//StringBuffer sb = new StringBuffer("저는 ");
		StringBuilder sb = new StringBuilder("난 ");
		
		//append
		//sb.append("배가 불러요~");
		//sb.append("~~!");
		sb.append("배가 불러요").append("~~!");
		System.out.println(sb);
		
		//insert
		sb.insert(2, "점심을 먹어서 ");
		System.out.println(sb);
		
		//delete
		sb.delete(2, 10);
		System.out.println(sb);
		
		//reverse
		sb.reverse();
		System.out.println(sb);
	}
}
