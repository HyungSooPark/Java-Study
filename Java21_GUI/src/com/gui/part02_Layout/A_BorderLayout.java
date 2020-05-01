 package com.gui.part02_Layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class A_BorderLayout extends JFrame{
	public A_BorderLayout() {
		super("BorderLayout");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setBounds(300,200,600,400);
		
		//생락가능 - 기본값
//		this.setLayout(new BorderLayout());
		//레이아웃을 설정하지 않아도 기본값이 BorderLayout이다.
		System.out.println(this.getLayout());
		
		/*JButton north = new JButton("북");
		JButton north = new JButton("북");
		JButton south = new JButton("남");
		JButton east = new JButton("동");
		JButton west = new JButton("서");
		JButton center = new JButton("가운데");
		
		//레이아웃의 위치별로 컴포넌트 배치
		this.add(north, "North");
		this.add(south, "South");
		this.add(east, "East");
		this.add(west, "West");
		this.add(center, "Center");*/
		
		this.add(new JButton("북"), "North");
		this.add(new JButton("남"), "South");
		
	}

}
