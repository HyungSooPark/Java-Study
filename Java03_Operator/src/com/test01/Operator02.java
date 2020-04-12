package com.test01;

public class Operator02 {
	//++ : 1증가의 의미, ++값, 값++
	//-- : 1감소의 의미, --값, 값--
	public static void main(String[] args) {
		Operator02 op = new Operator02();
		
		op.test2();
	}
	
	public void test1() {
		int age = 19;
		
		System.out.println("현재 나이는? " + age);
		
		++age;
		
		System.out.println("++age의 결과는? " + age);
		
		age++;
		
		System.out.println("age++의 결과는? " + age);
		
		--age;
		
		System.out.println("--age의 결과는? " + age);
		
		age--;
		
		System.out.println("age--의 결과는? " + age);
		
		//2씩 증가 혹은 3씩 증가는
		//age += 2, age += 3
	}
	
	public void test2() {
		int num1 = 20;
		
		//후위연산자
		//계사을 먼저 처리하고 난 뒤 증감처리 된다.
		
		int res = num1++ * 3;
		
		System.out.println("res : "+ res);
		System.out.println("num1 : "+ num1);
		
		int num2 = 20;
		
		//전위연산자
		//증가를 먼저 하고 난 뒤 계산을 함.
		
		int res2 = ++num2 * 3;
		
		System.out.println("res2 : "+ res2);
		System.out.println("num2 : "+ num2);
	}
}
