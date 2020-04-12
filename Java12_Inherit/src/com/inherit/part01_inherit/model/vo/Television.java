package com.inherit.part01_inherit.model.vo;

import java.util.Date;

public class Television extends Product{
	//product 클래스 상속 받아 구현
	
	private int inchType;
	
	public Television() {
		//super();	-> 생략되어 있음
	}
	public Television(String brand, String productNum, String productCode, String productName, int price, Date date, int inchType) {
		super(brand,productNum,productCode,productName,price,date);
		this.inchType = inchType;
		System.out.println("product를 상속받은 tv 클래스의 생성자 호출");
	}
	
	public void setInchType(int inchType) {
		this.inchType = inchType;
	}
	public int getInchType() {
		return inchType;
	}
	
	@Override
	public String prnInfo() {
		return super.prnInfo()+", "+inchType;
	}
}
