package com.hw2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {
	public SpaceUpper() {}
	
	public void spaceToUpper() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영어를 입력하시오(띄어쓰기 포함):");
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str," ");
		StringBuilder stb = new StringBuilder();
		
		while(st.hasMoreTokens()) {
			String temp = st.nextToken();
			//stb.append(temp.substring(0, 1).toUpperCase());
			//stb.append(temp.substring(1)).append(" ");
			for(int i=0;i<temp.length();i++) {
				if(i==0) stb.append(temp.toUpperCase().charAt(i));
				else stb.append(temp.charAt(i));
			}
			stb.append(" ");
		}
		
		System.out.println(stb);
		
		sc.close();
	}
}
