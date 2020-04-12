package com.poly.silsub1.shape.controller;

import com.poly.silsub1.shape.model.vo.*;

public class ShapeManager {
	public void calcShape() {
		IShape s;
		
		s = new Circle(15.5);
		System.out.println("원면적: "+s.area());
		System.out.println("원둘레: "+s.perimeter());
		
		s = new Rectangle(34.5, 42.7);
		System.out.println("사각형 면적: "+s.area());
		System.out.println("사각형 둘레: "+s.perimeter());
		
	}
	
	public void calcShapeArray() {
		IShape[] iarr = new IShape[5];
		
		for(int i=0;i<iarr.length;i++) {
			int j = (int) (Math.random()*3);
						
			switch(j){
			case 0:
				iarr[i] = new Circle();
				((Circle)iarr[i]).setRadius(Math.random()*50.0);
				System.out.println("원면적: "+iarr[i].area());
				System.out.println("원둘레: "+iarr[i].perimeter());
				break;
			case 1:
				iarr[i] = new Rectangle();
				((Rectangle)iarr[i]).setHeight(Math.random()*50.0);
				((Rectangle)iarr[i]).setWidth(Math.random()*50.0);
				System.out.println("사각형 면적: "+iarr[i].area());
				System.out.println("사각형 둘레: "+iarr[i].perimeter());
				break;
			case 2:
				iarr[i] = new Triangle();
				((Triangle)iarr[i]).setBase(Math.random()*50.0);
				((Triangle)iarr[i]).setHeight(Math.random()*50.0);
				System.out.println("삼각형 면적: "+iarr[i].area());
				System.out.println("빗변의 길이: "+((Triangle)iarr[i]).getHypotenuse());
				System.out.println("삼각형 둘레: "+iarr[i].perimeter());
				break;
			}
			System.out.println();
		}
	}
}
