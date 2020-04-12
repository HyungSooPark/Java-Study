package com.test01;

public class DeArrayTest {
	public void testInit() {
		//2차원 배열의 선언
		//선언을 하게 되면 stack에 레퍼런스 변수가 생성
		int[][] iarr1;
		int iarr2[][];
		
		//heap 영역에 2차원 배열을 할당.
		iarr1 = new int[3][5];
		
		//데이터가 저장되는 배열의 레퍼런스를 보관하는 배열은 반드시 크기를 지정해줘야 한다.
		iarr2 = new int[3][];
		iarr2[0] = new int[5];
		iarr2[1] = new int[5];
		iarr2[2] = new int[5];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(iarr1[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void testInit2() {
		//선언, 할당
		int[][] iarr = new int[3][5];
		
		int val = 1;
		
		//배열 인덱스에 접근하여 값 기록
		for(int i=0;i<iarr.length;i++) {
			for(int j=0;j<iarr[i].length;j++) {
				iarr[i][j] = val++;
				
				System.out.print(iarr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void testInit3() {
		//가변배열
		int[][] iarr = new int[3][];
		
		iarr[0] = new int[5];
		iarr[1] = new int[3];
		iarr[2] = new int[10];
		
		int value=0;
		
		for(int i=0;i<iarr.length;i++) {
			for(int j=0;j<iarr[i].length;j++) {
				iarr[i][j] = ++value;
			}
		}
			
		printArray(iarr);
	}
	
	public void printArray(int[][] iarr) {
		for(int i=0;i<iarr.length;i++) {
			for(int j=0;j<iarr[i].length;j++) {
				System.out.print(iarr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void testInit4() {
		//다차원 배열의 할당과 초기화를 동시에 할 수 있다.
		//int[][] iarr = { {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15} };
		
		int[][] iarr = {{1,2,3},{4,5,6,7,8,9},{10,11,12,13}};
		
		printArray(iarr);
	}
}
