package com.test.chap01_encapsulation;

public class Score {
	//필드
	private String name = "박형수";
	private int kor = 94;
	private int eng = 60;
	private int mat = 87;
	
	//생성자
	public Score() {}
	
	//총합을 구하여 출력하는 메소드
	public void prnSum() {
		int sum=0;
		
		sum = kor + eng + mat;
		
		System.out.println(name+"님의 점수 총합은 "+sum+"입니다.");
	}
	//평균을 구하여 출력하는 메소드
	public void prnAvg() {
		double avg=0;
		
		avg = (kor+eng+mat)/3.0;
		
		System.out.printf("%s님의 점수 평균은 %.2f입니다.\n",name,avg);
	}
	//제일 높은 점수를 받은 과목을 찾는 메소드
	public void prnMax() {
		int max=0;
		
		if(kor>eng) {
			if(kor>mat) {
				max = kor;
				System.out.println(name+"님의 최고 점수는 국어 "+max+"점 입니다.");
			}
			else {
				max = mat;
				System.out.println(name+"님의 최고 점수는 수학 "+max+"점 입니다.");
			}
		}
		else {
			if(eng>mat) {
				max = eng;
				System.out.println(name+"님의 최고 점수는 영어 "+max+"점 입니다.");
			}
			else {
				max = eng;
				System.out.println(name+"님의 최고 점수는 수학 "+max+"점 입니다.");
			}
		}
	}
	//제일 낮은 점수를 받은 과목을 찾는 메소드
	public void prnMin() {
		int min=0;
		
		if(kor<eng) {
			if(kor<mat) {
				min = kor;
				System.out.println(name+"님의 최저 점수는 국어 "+min+"점 입니다.");
			}
			else {
				min = mat;
				System.out.println(name+"님의 최저 점수는 수학 "+min+"점 입니다.");
			}
		}
		else {
			if(eng<mat) {
				min = eng;
				System.out.println(name+"님의 최저 점수는 영어 "+min+"점 입니다.");
			}
			else {
				min = mat;
				System.out.println(name+"님의 최저 점수는 수학 "+min+"점 입니다.");
			}
		}
	}
	//필드값을 확인 할 수 있는 information() 메소드
	public void information() {
		System.out.println("이름: "+name);
		System.out.println("국어: "+kor);
		System.out.println("영어: "+eng);
		System.out.println("수학: "+mat);
		prnSum();
		prnAvg();
		prnMax();
		prnMin();
	}
}
