package com.test01.bbb;

import com.test01.aaa.AAA;

public class BBB extends AAA{
	private int b;
	
	public BBB() {
		//super();	//부모의 생성자 ---> AAA();	//기본생성자에서 생략 가능
		System.out.println("BBB 생성");
	}
	
	public BBB(int b) {
		super(b);	//부모클래스의 생성자는 맨 위에 있어야함.
		this.b = b;
		System.out.println("BBB 생성(b받아서 생성)");
	}
	
	public BBB(int abc, int b) {
		super(abc);
		this.b = b;
		System.out.println("BBB생성(abc, b 받아서 생성)");
	}
	
	//getter & setter
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int getSum() {
		return super.getAbc() + this.getB();
	}
	
	@Override
	public void prn() {
		System.out.println("BBB class의 prn()");
	}
}