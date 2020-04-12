package silsub2.run;

import java.util.Scanner;

import silsub2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품 이름:" );
		p.setPName(sc.next());
		
		System.out.print("가격:" );
		p.setPrice(sc.nextInt());
		
		System.out.print("브랜드:" );
		p.setBrand(sc.next());
		
		System.out.println();
		
		System.out.println(p.information());
		
		sc.close();
	}

}
