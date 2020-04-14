package com.test.chap01_runtimeException;

import java.util.Scanner;

public class RunExcepPrac {
	Scanner sc = new Scanner(System.in);
	
	//RuntimeException -> ArithmeticException
	public void ArithEx() {
		int ran = 0;
		double res = 0.0;
		
		while(true) {
			ran = (int)(Math.random()*10)+1;
			System.out.print("나눌 수를 입력: ");
			int no = sc.nextInt();
			
			if(no==0) {
				System.out.println("0이 아닌 값을 입력하세요!\n");
			}
			else {
				res = ran / (double)no;
				System.out.println(ran+"/"+no+"="+res+"\n");
			}
		}
	}
	
	public void ClassNArrayEx() {
		//ClassCastException
		/*Object obj = 'a';
		System.out.println(obj);
		String str = (String)obj;
		System.out.println(str);*/
		
		//ArrayIndexOutOfBoundsException
		/*int[] arr = new int[2];
		arr[0] = 1;
		arr[1] = 2;
		
		arr[2] = 3;
		System.out.println("출력문이 실행될까요??");*/
		
		//NullPointerException
		/*try {
			String str = null;
			int len = str.length();
			System.out.println(len);
		} catch(NullPointerException e) {
			System.out.println("널포인터 익셉션");
			//e.printStackTrace();
		} finally {
			System.out.println("프로그램 종료");
		}*/
		
		try {
			//ArrayIndexOutOfBoundsException
			int[] arr = new int[2];
			arr[0] = 1;
			arr[1] = 2;
			
			arr[2] = 3;
			System.out.println("출력문이 실행될까요??");
			
			//NullPointerException
			String str = null;
			int len = str.length();
			System.out.println(len);
		} /*catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("어레이인덱스아웃 익셉션");
			//e.printStackTrace();
		} catch(NullPointerException e) {
			System.out.println("널포인터 익셉션");
			//e.printStackTrace();
		}*/
		  catch(ArrayIndexOutOfBoundsException | NullPointerException e){
			  System.out.println("어레이 인덱스 or 널포인터 익셉션");
			  e.printStackTrace();
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}
