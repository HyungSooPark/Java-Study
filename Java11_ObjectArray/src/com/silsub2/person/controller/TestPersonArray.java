package com.silsub2.person.controller;

import java.util.Scanner;

import com.silsub2.person.model.vo.Person;

public class TestPersonArray {

	public static void main(String[] args) {
		Person[] p = new Person[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<p.length;i++) {
			System.out.print("이름: ");
			String name = sc.next();
			
			System.out.print("나이: ");
			int age = sc.nextInt();
			
			System.out.print("성별(M/F): ");
			char gender = sc.next().charAt(0);
			
			System.out.print("키: ");
			double height = sc.nextDouble();
			
			System.out.print("몸무게: ");
			double weight = sc.nextDouble();
			
			p[i] = new Person(name,age,gender,height,weight);
			
			System.out.println();
		}
		
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i].personInfo());
		}
		System.out.println();
		
		double avgAge = 0;
		double avgHeight = 0;
		double avgWeight = 0;
		
		for(int i=0;i<p.length;i++) {
			avgAge += p[i].getAge();
			avgHeight += p[i].getHeight();
			avgWeight += p[i].getWeight();
		}
		
		avgAge /= p.length;
		avgHeight /= p.length;
		avgWeight /= p.length;
		
		System.out.println("나이 평균: "+avgAge);
		System.out.println("키 평균: "+avgHeight);
		System.out.println("몸무게 평균: "+avgWeight);
		
		sc.close();
	}
}
