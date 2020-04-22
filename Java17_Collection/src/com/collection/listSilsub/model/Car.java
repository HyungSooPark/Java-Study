package com.collection.listSilsub.model;

public class Car {
	private int parkingNum;
	private int carNum;
	private int carType;
	private String owner;
	
	public Car() {}

	public Car(int carNum, int carType, String owner) {
		this.carNum = carNum;
		this.carType = carType;
		this.owner = owner;
	}

	public int getParkingNum() {
		return parkingNum;
	}

	public void setParkingNum(int parkingNum) {
		this.parkingNum = parkingNum;
	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}

	public int getCarType() {
		return carType;
	}

	public void setCarType(int carType) {
		this.carType = carType;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		switch(carType) {
		case 1:
			return "["+parkingNum+", "+carNum+", 경차, "+owner+"]";
		case 2:
			return "["+parkingNum+", "+carNum+", 세단, "+owner+"]";
		case 3:
			return "["+parkingNum+", "+carNum+", SUV, "+owner+"]";
		case 4:
			return "["+parkingNum+", "+carNum+", 트럭, "+owner+"]";
		default :
			return "["+parkingNum+", "+carNum+", 인식불가, "+owner+"]";
				
		}
	}
	
}
