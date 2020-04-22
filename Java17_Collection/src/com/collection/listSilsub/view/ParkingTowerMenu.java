package com.collection.listSilsub.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.collection.listSilsub.controller.ParkingTowerManager;
import com.collection.listSilsub.model.Car;

public class ParkingTowerMenu {
	Scanner sc = new Scanner(System.in);
	private ParkingTowerManager ptm = new ParkingTowerManager();
	
	public ParkingTowerMenu() {}
	
	public void mainMenu() {
		loop:
		while(true) {
			
			System.out.println("=== *주차 타워 관리* ===");
			System.out.println("1. 차량 주차");
			System.out.println("2. 전체 출력");
			System.out.println("0. 끝내기");
			System.out.println();
			System.out.print("메뉴 선택: ");
			int no = sc.nextInt();
		
			switch(no) {
			case 1:
				insertCar();
				break;
			case 2:
				selectList();
				break;
			case 0:
				System.out.print("프로그램 종료");
				break loop;
			default:
				System.out.println("잘못된 메뉴 선택입니다.");
				break;
			}
		System.out.println();
		
		}
		
	}
	
	public void insertCar() {
		System.out.println();
		System.out.print("차량 번호 : ");
		int carNum = sc.nextInt();
		System.out.print("차량 타입 (1:경차 / 2:세단 / 3:SUV / 4:트럭) : ");
		int carType = sc.nextInt();
		System.out.print("차주 : ");
		String owner = sc.next();
		
		Car car = new Car(carNum,carType,owner);
		ptm.insertCar(car);
	}
	
	public void selectList() {
		ArrayList<Car> carList = ptm.selectList();
		System.out.println();
		if(carList.isEmpty()) System.out.println("주차된 차량이 없습니다.");
		else {
			for(int i=0;i<carList.size();i++) {
				System.out.println(carList.get(i));
			}
		}
	}
}
