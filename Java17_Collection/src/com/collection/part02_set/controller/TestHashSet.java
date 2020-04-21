package com.collection.part02_set.controller;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.collection.part01_list.arrayListSort.model.Score;

public class TestHashSet {
	public void testHashSet() {
		//Hashset
		HashSet hset = new HashSet();
		//다형성 적용
		//Set hset2 = new HashSet();
		//Collection hset3 = new HashSet();
		
		hset.add(new String("java"));
		hset.add(new Integer(123));
		hset.add(new Double(45.67));
		hset.add(new Date());
		//저장 순서 유지 안된다.
		System.out.println("hset: "+hset);
		
		hset.add(new String("java"));
		hset.add(new Integer(123));
		//중복 객체 저장 안된다.
		System.out.println("hset: "+hset);
		System.out.println("저장된 객체수: "+hset.size());
		System.out.println("포함확인: "+hset.contains(new Integer(123)));
		
		System.out.println();
		HashSet hset2 = new HashSet();
		hset2.add(new Score("박형수",99));
		hset2.add(new Score("한예인",83));
		hset2.add(new Score("이순신",69));
		System.out.println("hset2: "+hset2);
		
		//hashcode와 equals가 오버라이드 되어있어야 객체 중복 제거 가능
		hset2.add(new Score("박형수",99));
		System.out.println("hset2: "+hset2);
		
		//저장된 객체를 하나씩 꺼내기
		//set에서는 하나씩 꺼내는 기능이 없다.
		//1.toArray() 배열로 바꾸고 반복문 사용
		Object[] arr = hset.toArray();
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+" : "+arr[i]);
		}
		
		//2.Iterator()로 목록 만들어 처리
		Iterator iter = hset.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
