package com.gui.part02_Layout;

import java.awt.GridLayout;
import java.util.HashSet;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_GridLayout extends JFrame{
	public C_GridLayout() {
		super("GridLayout");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300,200,600,400);
		
		//GridLayout
		//가로, 세로, 가로갭, 세로갭 순으로 값을 넣는다. 5*5
		this.setLayout(new GridLayout(5,5/*,10,20*/));
		
//		for(int i=0; i<26; i++) {
//			String str = new Integer(i).toString();
//			this.add(new JButton(str));
//		}
		
		//set을 이용해 중복 제거하여 빙고판 만들기
		HashSet hset = new HashSet();
//		LinkedHashSet hset = new LinkedHashSet();
		while(hset.size()<25) {
			hset.add(new Random().nextInt(25)+1);
		}
		
//		int r=0;
//		
//		for(int i=0; i<26;i++){
//			r=(int)(Math.random()*20)+1;
//			hset.add(r);
//		}
		
		Object[] arr = hset.toArray();
		
		for(int i=0; i<arr.length; i++) {
			String str= new Integer((int)arr[i]).toString();
			this.add(new JButton(str));
		}
		
	}

}
