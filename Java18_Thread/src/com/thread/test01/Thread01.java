package com.thread.test01;

class MyThread implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i="+i);
		}
	}
	
}

public class Thread01 {

	public static void main(String[] args) {
		System.out.println("--- main start ---");
		
		MyThread m1 = new MyThread();
		//m1.run(); -> thread가 아니다.
		
		Thread thread = new Thread(m1);
		thread.start();	//자동으로 run()호출
		
		System.out.println("--- main stop ---");
	}

}
