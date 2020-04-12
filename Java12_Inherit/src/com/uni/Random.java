package com.uni;

public class Random {
	
	public static void main(String[] args) {
		int[] arr = {1,2,17,13,44,22,30,27,23,28,26};
		int r = (int) (Math.random()*11);
		
		System.out.println(arr[r]);
	}
	
}
