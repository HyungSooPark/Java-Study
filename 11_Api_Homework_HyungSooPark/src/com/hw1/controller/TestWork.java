package com.hw1.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TestWork {
	public TestWork() {}
	
	public StringBuilder afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str," ");
		char[] strArr = new char[st.countTokens()];
		int i=0;
		
		System.out.println("토큰 처리 전 글자 : "+str);
		System.out.println("토큰 처리 전 갯수 : "+str.length());
		
		System.out.print("토큰 처리 후 글자 : ");
		while(st.hasMoreTokens()) {
			strArr[i] = st.nextToken().charAt(0);
			System.out.print(strArr[i]);
			i++;
		}
		System.out.println();
		System.out.println("토큰 처리 후 갯수 : "+strArr.length);
				
		System.out.println("모두 대문자로 변환 : "+String.copyValueOf(strArr).toUpperCase());
		
		return null;
	}
	
	public void findChar() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.next();
		
		System.out.println("첫 글자 대문자 : "+str.substring(0,1).toUpperCase()+str.substring(1));
		
		System.out.print("찾을 문자 하나를 입력하세요 : ");
		char c = sc.next().charAt(0);
		
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			if (str.charAt(i) == c) count++;
		}
		System.out.println(c+" 문자가 들어간 갯수 : "+count);
		
		sc.close();
	}
}
