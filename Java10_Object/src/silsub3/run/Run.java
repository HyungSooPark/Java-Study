package silsub3.run;

import java.util.Scanner;

import silsub3.model.vo.*;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 입력: ");
		c.setRadius(sc.nextInt());
		
		System.out.println("원의 둘레: "+c.getCir());
		System.out.println("원의 넓이: "+c.getArea());
		
		System.out.println();
		c.incrementRadius();
		System.out.println();
		
		System.out.println("반지름: "+c.getRadius());
		System.out.println("원의 둘레: "+c.getCir());
		System.out.println("원의 넓이: "+c.getArea());
		
		sc.close();
	}

}
