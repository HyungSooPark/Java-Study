package com.silsub2.student.model.vo;

public class Student {
	private int year;
	private int classno;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {}

	public Student(int year, int classno, String name, int kor, int eng, int math) {
		super();
		this.year = year;
		this.classno = classno;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getClassno() {
		return classno;
	}

	public void setClassno(int classno) {
		this.classno = classno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return year+"학년 "+classno+"반 "+name+" <국어:"+kor+", 영어:"+eng+", 수학"+math+">";
	}
}
