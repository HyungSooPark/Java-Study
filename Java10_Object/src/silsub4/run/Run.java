package silsub4.run;

import silsub4.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Student s = new Student(3,12,"박형수",178.5,'M');
		
		System.out.println(s.information());
	}
}
