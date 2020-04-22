package com.collection.part04_Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestGenerics {
	public void testGenerics1() {
		List list = new ArrayList();
		list.add(new String("Object saved"));
		list.add(new Score());
		list.add(new Student());
		list.add(new Car());
		list.add(new Book());
		System.out.println("저장된 객체수: "+list.size());
		System.out.println("llist: "+list);
		
		for(int i=0;i<list.size();i++) {
			Object obj = list.get(i);
			System.out.println(obj.toString());
			
			if(obj instanceof Book) {
				((Book)obj).printBook();
			}
			if(obj instanceof Student) {
				((Student)obj).score();
			}
			if(obj instanceof Car) {
				((Car)obj).printCar();
			}
		}
	}
	
	public void testGenerics2() {
		//제너릭스: 컬렉션에 저장되는 객체의 자료형에 제한을 거는 기능
		//컬렉션에 한가지 종류의 객체만 저장되기 때문에 꺼내서 사용할 때 객체 레퍼런스 형변환 X
		ArrayList<Book> list = new ArrayList<Book>();
		ArrayList list2 = new ArrayList();
		
		//list.add("test genenrics");
		list.add(new Book());
		list.add(new Book());
		list2.add(new Book());
		list2.add(new Book());
		
		for(Object ob : list2) {
			((Book)ob).printBook();
		}
		System.out.println();
		for(Book b : list) {
			b.printBook();
		}
	}
	
	public void testGenerics3() {
		//Map에 제네릭스 적용
		HashMap<String,Book> hmap = new HashMap<String, Book>();
		hmap.put("one", new Book("java"));
		hmap.put("two", new Book("oracle"));
		
		System.out.println(hmap);
	}
	
	public void testGenerics4() {
		HashMap<String, Book> hmap = new HashMap<>();
		hmap.put("one", new Book("java"));
		hmap.put("two", new Book("oracle"));
		hmap.put("three", new Book("JDBC"));
		
		//entrySet()
		Set<Map.Entry<String, Book>> entry = hmap.entrySet();
		Iterator<Map.Entry<String, Book>> it = entry.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Book> ent = it.next();
			String key = ent.getKey();
			Book val = ent.getValue();
			System.out.println(key+":"+val);
		}
		
		//set에 key만 추출하여 Iterator로 출력
		//1. key를 set으로
		//2. set을 Iterator로
		//3. 반복문을 통해 Iterator의 키를 가져온 후 value값 확인
		Set<String> keys = hmap.keySet();
		Iterator<String> it2 = keys.iterator();
		while(it2.hasNext()) {
			String key = it2.next();
			Book val = hmap.get(key);
			System.out.println(key+":"+val);
		}
	}
}

//한 클래스 파일 안에 여러개의 클래스 정의 가능
class Score{
	
}
class Student{
	public Student() {}
	public void score() {
		System.out.println("score() call");
	}
	@Override
	public String toString() {
		return "Student";
	}
}
class Car{
	public Car() {}
	public void printCar() {
		System.out.println("printCar() call");
	}
	@Override
	public String toString() {
		return "Car";
	}
}
class Book{
	private String title;
	public Book() {}
	public Book(String title) {
		this.title = title;
	}
	public void printBook() {
		System.out.println("printBook() call");
	}
	@Override
	public String toString() {
		return title;
	}
}