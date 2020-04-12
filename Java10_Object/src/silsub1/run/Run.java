package silsub1.run;

import java.util.Scanner;

import silsub1.model.vo.Member;

public class Run {
	public static void main(String[] args) {
		Member m = new Member();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID: ");
		m.setMemberId(sc.next());
		
		System.out.print("Pwd: ");
		m.setMemberPwd(sc.next());
		
		System.out.print("이름: ");
		m.setMemberName(sc.next());
		
		System.out.print("나이: ");
		m.setAge(sc.nextInt());
		
		System.out.print("성별(M/F): ");
		m.setGender(sc.next().charAt(0));
		
		System.out.print("전화번호: ");
		m.setPhone(sc.next());
		
		System.out.print("이메일: ");
		m.setEmail(sc.next());
		
		System.out.println();
		
		System.out.println("ID: "+m.getMemberId());
		System.out.println("Pwd: "+m.getMemberPwd());
		System.out.println("이름: "+m.getMemberName());
		System.out.println("나이: "+m.getAge());
		System.out.println("성별: "+m.getGender());
		System.out.println("전화번호: "+m.getPhone());
		System.out.println("이메일: "+m.getEmail());
		
		sc.close();
	}
}
