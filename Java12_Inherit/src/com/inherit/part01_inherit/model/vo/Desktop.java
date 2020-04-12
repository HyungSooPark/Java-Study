package com.inherit.part01_inherit.model.vo;

import java.util.Date;

public class Desktop extends Computer{
	private boolean allInOne;
	
	public Desktop() {}
	
	public Desktop(String brand, String productNum, String productCode, String productName, int price, Date date, String cpu, int hdd, int ram, String os, boolean allInOne) {
		super(brand,productNum,productCode,productName,price,date,cpu,hdd,ram,os);
		this.allInOne = allInOne;
		System.out.println("computer를 상속받은 Desktop 클래스의 생성자 호출");
	}
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	public boolean get() {
		return allInOne;
	}
	
	@Override
	public String prnInfo() {
		if(allInOne)
			return super.prnInfo()+", 일체형";
		else
			return super.prnInfo()+", 분리형";
	}
}
