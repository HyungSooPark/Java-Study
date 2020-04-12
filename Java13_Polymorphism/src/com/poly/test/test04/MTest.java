package com.poly.test.test04;

public class MTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.bark();
		cat.eat("참치");
		System.out.println();
		
		Dog dog = new Dog();
		dog.bark();
		dog.bite();
		dog.eat("개껌");
		System.out.println();
		
		Eagle eagle = new Eagle();
		eagle.bark();
		eagle.fly();
		eagle.eat("개구리");
	}

}
