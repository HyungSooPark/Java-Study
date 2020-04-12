package com.silsub2.point.main;

import com.silsub2.point.model.vo.*;

public class Main {

	public static void main(String[] args) {
		Circle[] c = {
			new Circle(0,0,1),
			new Circle(1,2,3),
			new Circle(-4,-3,-2)
		};
		
		Rectangle[] r = {
				new Rectangle(0,0,4,3),
				new Rectangle(3,-5,-10,4),
				new Rectangle(-10,7,-9,-9)
		};
		
		for(int i=0;i<c.length;i++) {
			c[i].draw();
			System.out.println();
		}
		
		for(int i=0;i<r.length;i++) {
			r[i].draw();
			System.out.println();
		}
	}

}
