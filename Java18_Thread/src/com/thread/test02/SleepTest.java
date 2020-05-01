package com.thread.test02;

public class SleepTest {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("★");
		}
	}

}
