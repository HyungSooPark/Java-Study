package silsub1.model.vo;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	//생성자
	public Member() {}
	
	//ID setter / getter
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberId() {
		return memberId;
	}
	
	//Pwd setter / getter
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	
	//Name setter / getter
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberName() {
		return memberName;
	}
	
	//Age setter / getter
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	//Gender setter / getter
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}
	
	//Phone setter / getter
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	
	//Email setter / getter
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
}
