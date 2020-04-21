package com.collection.part01_list.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ArrayListTest {
	public void testArrayList() {
		//ArrayList는 객체 생성시 내부적으로 10칸짜리 배열을 생성
		ArrayList alist = new ArrayList();
		
		//다형성
		List list = new ArrayList();
		Collection clist = new ArrayList();
		//저장순서가 유지, index 적용
		//객체만 저장
		alist.add("apple");
		alist.add(123);		//autoBoxing (data -> object)
		alist.add(45.67);
		alist.add(new Date());
		
		//toString이 Overriding
		//저장순서 유지
		System.out.println("alist: "+alist);
		
		for(int i=0;i<alist.size();i++) {
			System.out.println(i+" : "+alist.get(i));
		}
		
		alist.add("apple");
		System.out.println("alist: "+alist);
		
		alist.add(1,"banana");
		System.out.println("alist: "+alist);
		
		alist.remove(2);
		System.out.println("alist: "+alist);
	}
	
	public void testArrayListSort() {
		//ArrayList는 오름차순 정렬 가능한 sort() 메소드
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("banana");
		list.add("orange");
		list.add("mango");
		
		System.out.println("list: "+list);
		
		Collections.sort(list);
		System.out.println("listSort: "+list);
	}
}
