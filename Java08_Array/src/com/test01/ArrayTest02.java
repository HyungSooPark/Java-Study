package com.test01;

public class ArrayTest02 {
	public static void main(String[] args) {
		//1. a~z 일차원 배열 출력
		
		char[] ch = new char[26];
		
		for(int i=0;i<ch.length;i++) {
			ch[i] = (char)((int)'a'+i);
		}
		
		prn(ch);
		System.out.println();
		
		//2. 1번에서 만든 배열을 거꾸로 출력
		reverse(ch);
		System.out.println();
		
		//3. 1번에서 만든 배열을 대문자로 바꾸어 출력
		upper(ch);
	}
	
	public static void prn(char[] ch) {
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+" ");
			
			if(i%5==4) System.out.println();
		}
		System.out.println();
	}
	
	public static void reverse(char[] ch) {
		/*for(int i=ch.length-1;i>=0;i--) {
			System.out.println("ch["+i+"] = "+ch[i]);
		}
		System.out.println();*/
		
		char re[] = new char[ch.length];
		
		int temp=0;
		
		for(int i= ch.length-1;i>=0;i--) {
			re[temp] = ch[i];
			temp++;
		}
		
		prn(re);
	}
	
	public static void upper(char[] ch) {
		char up[] = new char[ch.length];
					
		for(int i=0;i<ch.length;i++) {
			//up[i] = (char)((int)ch[i]-32);
			
			up[i] = Character.toUpperCase(ch[i]);
		}
		
		prn(up);
	}
}
