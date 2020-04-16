package com.test01;

import java.util.StringTokenizer;

public class Test01 {
	/* 1. 다음의 문자열 값을 기호문자(/# ,) 단위로 분리하여 각각의 문자열로 출력 처리 방법을
	 * String 클래스와 String Tokenizer 클래스를 각각 사용하여 기술하시오.
	 * String colors = "red/yellow#green blue,orange"; */
		
	public static void main(String[] args) {
		String colors = "red/yellow#green blue,orange";
		
		//String 클래스 사용
		String[] colorValues = colors.split("[/# ,]");
		for(int i=0;i<colorValues.length;i++) {
			System.out.println(colorValues[i]);
		}
		
		System.out.println();
		
		//String Tokenizer 클래스 사용
		StringTokenizer colorTokens = new StringTokenizer(colors,"/# ,");
		while(colorTokens.hasMoreTokens()) {
			System.out.println(colorTokens.nextToken());
		}
	}

}
