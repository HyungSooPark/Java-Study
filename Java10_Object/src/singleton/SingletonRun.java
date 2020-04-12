package singleton;

public class SingletonRun {

	public static void main(String[] args) {
		//[1]외부에서 객체 생성 불가 (private 선언)
		//Singleton s = new Singleton();
		
		//[2]
		/*Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());*/
		
		//[3]
		Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s == s2);
	}

}
