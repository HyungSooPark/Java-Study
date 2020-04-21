package com.collection.part01_list.arrayListSort.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.collection.part01_list.arrayListSort.model.Score;
import com.collection.part01_list.arrayListSort.model.ScoreSorting;

public class ScoreManager {
	public void scoreSort() {
		List list = new ArrayList();
		
		list.add(new Score("박형수",98));
		list.add(new Score("한예인",66));
		list.add(new Score("홍길동",73));
		
		list.add(new Score("이순신",85));
		list.add(new Score("김유신",33));
		list.add(new Score("강철수",59));
		
		System.out.println("list: "+list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		//Comparable
		//Collections.sort(list);
		list.sort(null);
		System.out.println("list: "+list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		//Comparator
		//Collections.sort(list, new ScoreSorting());
		list.sort(new ScoreSorting());
		System.out.println("list: "+list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
