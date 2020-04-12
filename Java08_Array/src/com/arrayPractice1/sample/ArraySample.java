package com.arrayPractice1.sample;

import java.util.Random;
import java.util.Scanner;

public class ArraySample {
	public void test1() {
		/*
		 * 1. 10개의 int 배열 선언하고 할당함
		 * 2. 각 방에 1~100 사이의 임의의 난수를 기록함
		 * 3. 합계를 구하여 출력
		 */
		int[] array = new int[10];
		
		int sum=0;
		
		Random rand = new Random();
		
		for(int i=0;i<array.length;i++) {
			array[i] = rand.nextInt(100)+1;
			
			System.out.println((i+1)+"번째 난수 : "+array[i]);
			
			sum += array[i];
		}
		
		System.out.println();
		System.out.println("합계 : "+sum);
	}
	
	public void test2() {
		int[] array = new int[10];
		
		int max=0,min=101;
		
		for(int i=0;i<array.length;i++) {
			array[i] = (int)(Math.random()*100)+1;
			
			if(array[i]>=max) max = array[i];
			if(array[i]<=min) min = array[i];
			
			System.out.print(array[i]+" ");
		}
		
		System.out.println("\n최대값: "+max+", 최소값: "+min);
	}
	
	public void test3() {
		byte array[] = new byte[10];
		
		Random rand = new Random();
		
		int sum=0;
		
		rand.nextBytes(array);
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
			
			if(array[i]%2==0) sum+=array[i];
		}
		
		System.out.println("\n짝수들의 합 : "+sum);
	}
	
	public void test4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		
		int sum=0;
				
		for(int i=0;i<str.length();i++) {
			//int temp = (int) str.substring(i,i+1).charAt(0) - 48;
			int temp = Integer.parseInt(str.substring(i,i+1));
			
			sum +=temp;
		}
		
		System.out.println("합계 : "+sum);
		
		sc.close();
	}
	
	public void test5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		
		int sum=0;
			
		for(int i=0;i<str.length();i++) {
			int temp = (int)str.charAt(i)-48;
						
			sum += temp;
		}
		
		System.out.println("합계 : "+sum);
				
		System.out.println("합계 : "+sum);
				
		sc.close();
	}
	
}
