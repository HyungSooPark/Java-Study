package com.test02;

public class Score {
	//double, void ... : 리턴 타입
	public double getAvg(int kor, int eng, int mat) {
		double avg = (kor+eng+mat)/3.0;
		return avg;
	}
	
	public String getGrade(double avg) {
		String grade="";
		
		switch((int)avg/10) {
		case 10:
		case 9:
			grade="A";
			break;
		case 8:
			grade="B";
			break;
		case 7:
			grade="C";
			break;
		case 6:
			grade="D";
			break;
		default:
			grade="F";
		}
		
		return grade;
	}
}
