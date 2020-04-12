package com.inherit.part01_inherit.model.vo;

import java.util.Date;

public class Computer extends Product{
	private String cpu;
	private int hdd;
	private int ram;
	private String os;
	
	public Computer() {}
	
	public Computer(String brand, String productNum, String productCode, String productName, int price, Date date, String cpu, int hdd, int ram, String os) {
		super(brand,productNum,productCode,productName,price,date);
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.os = os;
		System.out.println("product를 상속받은 Computer 클래스의 생성자 호출");
	}
	
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getCpu() {
		return cpu;
	}
	
	public void setHdd(int hdd) {
		this.hdd = hdd;
	}
	public int getHdd() {
		return hdd;
	}
	
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRam() {
		return ram;
	}
	
	public void setOs(String os) {
		this.os = os;
	}
	public String getOs() {
		return os;
	}
	
	@Override
	public String prnInfo() {
		return super.prnInfo()+", "+cpu+", "+hdd+", "+ram+", "+os;
	}
}
