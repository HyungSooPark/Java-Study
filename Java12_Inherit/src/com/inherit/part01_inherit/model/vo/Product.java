package com.inherit.part01_inherit.model.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
	private String brand;	//제조사
	private String productNum;	//상품번호
	private String productCode;	//상품코드
	private String productName;	//상품이름
	private int price;	//가격
	private Date date;	//제조일자(java.util)
	
	//기본생성자
	public Product() {}
	//매개변수 생성자
	public Product(String brand, String productNum, String productCode, String productName, int price, Date date) {
		this.brand = brand;
		this.productNum = productNum;
		this.productCode = productCode;
		this.productName = productName;
		this.price = price;
		this.date = date;
	}
	
	//getter&setter
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}
	public String getProductNum() {
		return productNum;
	}
	
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode() {
		return productCode;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductName() {
		return productName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getDate() {
		return date;
	}
	
	public String prnInfo() {
		SimpleDateFormat f1 = new SimpleDateFormat("yyyy/MM/dd");
		
		return brand+", "+productNum+", "+productCode+", "+productName+", "+price+", "+f1.format(date);
	}
}
