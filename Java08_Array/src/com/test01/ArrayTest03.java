package com.test01;

public class ArrayTest03 {
	public static void main(String[] args) {
		ArrayTest03 at03 = new ArrayTest03();
		
		at03.deepCopy3();
	}
	
	public void shallowCopy() {
		//얕은 복사
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = originArr;
		
		String str ="";
		
		for(int i=0;i<originArr.length;i++) {
			str += originArr[i] + " ";
		}
		
		System.out.println("1.originArr의 주소값: "+originArr);
		System.out.println("1.originArr: "+str);
		System.out.println();
		
		str="";
		
		for(int i=0;i<copyArr.length;i++) {
			str += copyArr[i] + " ";
		}
				
		System.out.println("2.copyArr의 주소값: "+copyArr);
		System.out.println("2.copyArr: "+str);
		System.out.println();
		
		//원본배열 변경
		originArr[0]=99;
		
		str ="";
		
		for(int i=0;i<originArr.length;i++) {
			str += originArr[i] + " ";
		}
		
		System.out.println("1.originArr: "+str);
		System.out.println();
		
		str="";
		
		for(int i=0;i<copyArr.length;i++) {
			str += copyArr[i] + " ";
		}
				
		System.out.println("2.copyArr: "+str);
		System.out.println();
		
		System.out.println("1.originArr의 hashcode: "+originArr.hashCode());
		System.out.println("2.copyArr의 hashcode: "+copyArr.hashCode());
	}
	
	public void deepCopy() {
		//1. 깊은 복사는 동일한 새로운 배열을 하나 생성하고 값을 복사
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[originArr.length];
		
		//for문을 이용하여 1:1 복사
		for(int i=0;i<originArr.length;i++) {
			copyArr[i] = originArr[i];
		}
		
		String str ="";
		
		for(int i=0;i<originArr.length;i++) {
			str += originArr[i] + " ";
		}
		
		System.out.println("1.originArr의 주소값: "+originArr);
		System.out.println("1.originArr: "+str);
		System.out.println();
		
		str="";
		
		for(int i=0;i<copyArr.length;i++) {
			str += copyArr[i] + " ";
		}
				
		System.out.println("2.copyArr의 주소값: "+copyArr);
		System.out.println("2.copyArr: "+str);
		System.out.println();
		
		//원본 배열의 0번 인덱스의 값을 99로 변경
		originArr[0]=99;
		
		str ="";
		
		for(int i=0;i<originArr.length;i++) {
			str += originArr[i] + " ";
		}
		
		System.out.println("1.originArr: "+str);
		System.out.println();
		
		str="";
		
		for(int i=0;i<copyArr.length;i++) {
			str += copyArr[i] + " ";
		}
				
		System.out.println("2.copyArr: "+str);
		System.out.println();
		
		System.out.println("1.originArr의 hashcode: "+originArr.hashCode());
		System.out.println("2.copyArr의 hashcode: "+copyArr.hashCode());
	}
	
	public void deepCopy2() {
		//2.arraycopy()를 이용한 복사
		//java.lang.System
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		//arraycopy(src, srcPos, dest, destPos, length)
		//src : 원본배열, srcPos : 복사 시작위치
		//dest : 카피배열, destPos : 붙여넣기 시작위치
		//length : 복사될 길이
		System.arraycopy(originArr,0,copyArr,3,originArr.length);
		
		String str ="";
		
		for(int i=0;i<originArr.length;i++) {
			str += originArr[i] + " ";
		}
		
		System.out.println("1.originArr의 주소값: "+originArr);
		System.out.println("1.originArr: "+str);
		System.out.println();
		
		str="";
		
		for(int i=0;i<copyArr.length;i++) {
			str += copyArr[i] + " ";
		}
				
		System.out.println("2.copyArr의 주소값: "+copyArr);
		System.out.println("2.copyArr: "+str);
		System.out.println();
	}
	
	public void deepCopy3() {
		//clone()을 이용한 복사
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		System.out.println("준비된 복사본 배열의 주소: "+copyArr.hashCode());
		copyArr = originArr.clone();
		System.out.println("준비된 복사본 배열의 주소: "+copyArr.hashCode());
		System.out.println();
		
		String str ="";
		
		for(int i=0;i<originArr.length;i++) {
			str += originArr[i] + " ";
		}
		
		System.out.println("1.originArr의 주소값: "+originArr);
		System.out.println("1.originArr: "+str);
		System.out.println();
		
		str="";
		
		for(int i=0;i<copyArr.length;i++) {
			str += copyArr[i] + " ";
		}
				
		System.out.println("2.copyArr의 주소값: "+copyArr);
		System.out.println("2.copyArr: "+str);
		System.out.println();
	}
}
