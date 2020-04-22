package com.collection.listSilsub.controller;

import java.util.ArrayList;
import java.util.List;

import com.collection.listSilsub.model.Car;

public class ParkingTowerManager {
	private ArrayList<Car> carList = new ArrayList<>();
	
	public ParkingTowerManager() {}
	
	public void insertCar(Car car) {
		// 전달 받은 car는 현재 주차번호가 null인 채로 들어오는데
		// 새로운 차량이 추가될 때마다 추가되는 차량의 주차번호는
		// 리스트 마지막 주차 번호의 다음번호로 부여 해야 됨
		int lastNo = 0;
	
		
		try {
			lastNo = carList.get(carList.size()-1).getParkingNum()+1;
		} catch(ArrayIndexOutOfBoundsException e) {
			lastNo = 1;
		} finally {
			car.setParkingNum(lastNo);
			carList.add(car);
		}
	}
	
	public ArrayList<Car> selectList(){
		return carList;
	}
	
	public int deleteCar(int carNum) {
		Car del = null;
		for(int i=0;i<carList.size();i++) {
			if(carList.get(i).getCarNum()==carNum) {
				del = carList.remove(i);
			}
		}
		
		if(del!=null) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public List<Car> searchCar(String owner) {
		List<Car> searchList = new ArrayList<>();
		
		for(int i=0;i<carList.size();i++) {
			if(carList.get(i).getOwner().equals(owner)) {
				searchList.add(carList.get(i));
			}
		}
		
		return searchList;
	}
}
