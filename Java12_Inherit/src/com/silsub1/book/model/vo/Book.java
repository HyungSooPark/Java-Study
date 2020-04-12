package com.silsub1.book.model.vo;

public class Book {
	//필드
	private String title;
	private String author;
	private int price;
	
	//생성자
	public Book() {}
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//getter & setter
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	//1. toString 오버라이딩
	//클래스의 풀 패키지 명과 객체의해쉬코드를 16진수로 변환하여 리턴하는 메소드
	@Override
	public String toString() {
		return title+", "+author+", "+price;
	}
	
	//2. equals() 오버라이딩
	//두 객체의 주소값을 비교하여 같으면 true, 다르면 false를 리턴
	//객체가 가진 값까지 비교하기 위한 목적으로 오버라이딩, 동등성 확보
	@Override
	public boolean equals(Object obj) {
		//동일한 주소의 객체인지 비교
		if(this==obj) {
			System.out.println("동일한 주소의 객체입니다.");
			return true;
		}	
		//전달받은 객체가 null인지 확인
		if(obj==null) {
			System.out.println("비교할 대상이 없습니다.");
			return false;
		}
		//전달받은 객체를 형변환하여 각 필드별로 비교
		Book other = (Book) obj;
		
		//모든 필드값이 일치하는지 비교  --> 동등성 확보
		/*if(this.title.equals(other.getTitle()) && this.author.contentEquals(other.getAuthor()) && this.price==other.getPrice()) {
			System.out.println("필드값이 동일한 객체입니다.");
			return true;
		}
		else {
			System.out.println("동일하지 않은 객체입니다.");
			return false;
		}*/
		
		if(title==null) {
			if(other.title != null) {
				return false;
			}
		}
		else if(!title.equals(other.title)) {
			return false;
		}
		
		if(author==null) {
			if(other.author!=null) {
				return false;
			}
		}
		else if(!author.equals(other.author)) {
			return false;
		}
		
		//기본 자료형의 경우 값만 일치하는지 비교
		if(price != other.price) {
			return false;
		}
		
		//모든 조건을 통과하면 두 객체는 같은 객체.
		System.out.println("필드값이 동일한 객체입니다.");
		return true;
	}
	
	@Override
	public int hashCode() {
		return (author+price+title).hashCode();
	}
}
