package com.inherit.part01_inherit.model.vo;

import java.util.Date;

public class SmartPhone extends Product{
	private String mobileAgency;
	
	public SmartPhone() {}
	
	public SmartPhone(String brand, String productNum, String productCode, String productName, int price, Date date, String mobileAgency) {
		super(brand,productNum,productCode,productName,price,date);
		this.mobileAgency = mobileAgency;
		System.out.println("product를 상속받은 smartphone 클래스의 생성자 호출");
	}
	
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	@Override
	public String prnInfo() {
		return super.prnInfo()+", "+mobileAgency;
	}
}
