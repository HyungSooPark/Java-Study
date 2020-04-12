package com.poly.test.test05;

public class TvMain {

	public static void main(String[] args) {
		LgTv lg = new LgTv();
		
		System.out.println("현재 볼륨 : "+lg.volumnUp());
		System.out.println("현재 볼륨 : "+lg.volumnUp());
		System.out.println("현재 볼륨 : "+lg.volumnDown());
		System.out.println("현재 볼륨 : "+lg.volumnDown());
		System.out.println("현재 볼륨 : "+lg.volumnDown());
		
		lg.tvClosed();
		System.out.println();
		
		SamsungTv s = new SamsungTv();
		
		System.out.println("현재 볼륨: "+s.volumnUp());
		System.out.println("현재 볼륨: "+s.volumnDown());
		System.out.println("현재 볼륨: "+s.volumnDown());
		s.tvClosed();
	}

}
