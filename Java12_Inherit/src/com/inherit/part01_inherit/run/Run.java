package com.inherit.part01_inherit.run;

import java.util.Date;

import com.inherit.part01_inherit.model.vo.*;

public class Run {

	public static void main(String[] args) {	
		@SuppressWarnings("deprecation")
		Television tv1 = new Television("삼성","0001","TV01","벽걸이형 티비",1000000,new Date(101,11,13),40);
		
		System.out.println(tv1.prnInfo());
		System.out.println();
		
		Computer c1 = new Computer("애플","0002","PC01","맥북 프로",2200000,new Date(),"i7",512,16,"macOS");
		System.out.println(c1.prnInfo());
		System.out.println();
		
		Desktop d1 = new Desktop("LG","0003","PC11","엘지 컴퓨터",800000,new Date(),"i5",1024,8,"Windows10",false);
		System.out.println(d1.prnInfo());
		System.out.println();
		
		/*SmartPhone s1 = new SmartPhone("삼성","0004","SP01","S10 5G",660000,new Date(),"KT");
		System.out.println(s1.prnInfo());*/
		SmartPhone[] s = {
			new SmartPhone("삼성","0004","SP01","S10 5G",660000,new Date(),"KT"),
			new SmartPhone("애플","0005","SP02","아이폰10",920000,new Date(),"SKT")
		};
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i].prnInfo());
		}
		System.out.println();
		
		System.out.println(s[1].getProductName());
	}
}
