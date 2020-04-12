package com.silsub1.objArr.run;

import com.silsub1.objArr.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] s = {
				new Student(3,1,1,"홍길동"),
				new Student(4,3,2,"유관순"),
				new Student(2,7,5,"윤봉길")
		};
		
		for(int i=0;i<3;i++) {
			System.out.println(s[i].information());
		}
		
	}

}
