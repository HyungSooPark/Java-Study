package com.test.chap01_string.run;

public class Run {
	//String
	//immutable(불변), 변경은 적고, 읽기가 많은 경우
	
	public static void main(String[] args) {
		Run.method2();
	}
	
	public static void method1() {
		//1.문자열을 리터럴로 생성
		String str = "abc";
		String str1 = "abc";
		
		System.out.println(str);
		System.out.println(str1);
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		//JVM이 String pool에 등록 시키고 리터럴로 문자열 생성할때
		//동일한 값이 다시 호출될 떄에는 String pool에 등록된 값을 리턴
		System.out.println();
		
		//2.생성자를 통한 문자열 생성
		String str2 = new String("abc");
		String str3 = new String("abc");
		
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		//실제로 다른 주소값을 가지지만 같은 값을 가지는 경우 오버라이딩된 hashcode() 메소드로인해 같은 해쉬코드값으로 출력된다.
	}
	
	public static void method2() {
		String str = "abc";
		
		//charAt(index)
		System.out.println(str.charAt(1));
		
		//concat() 합치기
		System.out.println(str.concat("def"));
		
		//contains() 포함여부
		System.out.println(str.contains("ac"));
		
		//eqauls() 비교
		System.out.println(str.equals("abc"));
		
		//length() 길이
		System.out.println(str.length());
		
		//split()
		String str1 = "ab,c,def";
		System.out.println(str1);
		String[] strArr = str1.split(",");
		for(int i=0;i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}
		
		//향상된 for문
		for(String arr : strArr) {
			System.out.println(arr);
		}
		
		//toUpperCase() 대문자로
		System.out.println(str.toUpperCase());
		
		//substring() 잘라내기
		System.out.println(str1.substring(2,7));
		
		//trim() 공백제거
		String str2 = "       ab   c   	";
		System.out.println(str2);
		System.out.println(str2.trim());
		System.out.println(str2.replaceAll(" ", ""));
	}

}
