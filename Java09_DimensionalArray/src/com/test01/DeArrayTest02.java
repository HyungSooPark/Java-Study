package com.test01;

public class DeArrayTest02 {
	public void test01() {
		//구구단을 2차원 배열에 넣어보자
		int[][] dArr = new int[8][9];
		
		for(int i=0;i<dArr.length;i++) {
			for(int j=0;j<dArr[i].length;j++)
			{
				dArr[i][j] = (i+2)*(j+1);
				
				System.out.print((i+2)+" * "+(j+1)+" = "+dArr[i][j]+"\t");
			}
			System.out.println();
		}
				
		/*for(int k=0;k<dArr.length;k++) {
		for(int i=0;i<dArr[k].length;i++) {
			for(int j=0;j<dArr.length;j++)
			{		
				System.out.print((j+2)+" * "+(i+1)+" = "+dArr[j][i]+"\t");
			}
			System.out.println();
		}
		}*/
	}
}
