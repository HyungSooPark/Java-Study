package com.poly.test.test01;

public class MTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Animal dog = new Dog();
		
		cat.bark();
		dog.bark();
		
		cat.eat("고등어");
		dog.eat("뼈다귀");
	}

}
