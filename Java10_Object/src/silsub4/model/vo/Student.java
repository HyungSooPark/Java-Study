package silsub4.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	public Student() {}
	
	public Student(int grade, int classroom, String name, double height, char gender) {
		setGrade(grade);
		setClassroom(classroom);
		setName(name);
		setHeight(height);
		setGender(gender);
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getGrade() {
		return grade;
	}
	
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public int getClassroom() {
		return classroom;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}
	
	//출력용 메소드
	public String information() {
		return grade+"학년 "+classroom+"반 "+name+", 키: "+height+", 성별: "+gender;
	}
}
