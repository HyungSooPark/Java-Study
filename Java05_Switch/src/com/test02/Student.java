package com.test02;

public class Student {
	public static void main(String[] args) {
				
		int kor=100,eng=100,mat=84;
		
		Score sc = new Score();
		
		double avg = sc.getAvg(kor, eng, mat);
		
		System.out.printf("국어: %d\n영어: %d\n수학: %d\n평균: %.2f\n",kor,eng,mat,avg);
		
		String res = sc.getGrade(avg);
		
		System.out.printf("평균 학점은 %s입니다.\n",res);
	}
}
