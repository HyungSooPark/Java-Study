package com.silsub.model;

import java.util.Scanner;

public class Sample {
	public void munjae() {
		int[][] iarr = new int[3][5];
		
		int i=0,j=0;
		
		int sum=0,sum2=0;
		
		for(i=0;i<iarr.length-1;i++) {
			sum=0;
			
			for(j=0;j<iarr.length-1;j++) {
				iarr[i][j] = (int)(Math.random()*10) + 1;
				sum += iarr[i][j];
				sum2 += iarr[j][i];
				
				iarr[i][iarr[i].length-1] += iarr[i][j];
				iarr[iarr.length-1][i] += iarr[j][i];
			}
			
			iarr[iarr.length-1][iarr[i].length-1] += iarr[i][j] + iarr[j][i];
			//iarr[i][j]=sum;
			
		}
		
		/*for(i=0;i<iarr.length-1;i++) {
			for(j=0;j<iarr[i].length-1;j++) {
				iarr[i][3] += iarr[i][j];
				iarr[3][i] += iarr[j][i];
			}
			iarr[3][3] += iarr[i][3] + iarr[3][i];
			
		}*/
		
		for(i=0;i<iarr.length;i++) {
			for(j=0;j<iarr[i].length;j++) {
				System.out.print(iarr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void munjae1() {
		int[][] iarr = new int[4][5];
		
		int i=0,j=0,k=0;
		int sum=0;
		int total=0;
		
		for(i=0;i<iarr.length;i++) {
									
			if(i != iarr.length-1) {
				
				sum=0;
				
				for(j=0;j<iarr[i].length;j++) {
					
					if(j != iarr[i].length-1) {
						iarr[i][j] = (int)(Math.random()*10)+1;
					
						sum+=iarr[i][j];
					}
					
					else {
						iarr[i][j]=sum;
						
						total+=sum;
					}
				}
				j=0;
				//System.out.println(total);
			}
			
			else if(j!=iarr[i].length-1){
				for(j=0;j<iarr[i].length;j++) {
					
					sum=0;
					
					for(k=0;k<iarr.length;k++) {
						sum+=iarr[k][j];
					}
					iarr[i][j]=sum;
					total+=sum;
				}
				
				//System.out.println(total);
			}
			
			else iarr[i][j] = total;
			
		}
		
		for(i=0;i<iarr.length;i++) {
			for(j=0;j<iarr[i].length;j++) {
				System.out.print(iarr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void munjae2() {
		int[][] iarr = new int[3][];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<iarr.length;i++) {
			System.out.print(i+"번째 1차원 배열 수: ");
			/*int size = sc.nextInt();
			
			iarr[i] = new int[size];*/
			
			iarr[i] = new int[sc.nextInt()];
		}
		
		System.out.println();
		
		for(int i=0;i<iarr.length;i++) {
			
			int sum=0;
			
			for(int j=0;j<iarr[i].length;j++) {
				iarr[i][j] = (int)(Math.random()*100) + 1;
				sum+=iarr[i][j];
				
			}
			if(sum%5==0) {
				for(int j=0;j<iarr[i].length;j++) {
					System.out.print(iarr[i][j]+"\t");
				}
				System.out.println("합계 : "+sum);
			}
			else {
				System.out.println(i+"행의 총합은 5의 배수가 아닙니다.");
			}
		}
		
		sc.close();
		
	}
	
	public void munjae3() {
		int[][] iarr = new int[5][5];
		
		int val=1;
		
		for(int i=0;i<iarr.length;i++) {
			if(i%2==0) {
				for(int j=0;j<iarr[i].length;j++) {
					iarr[i][j] = val++;
				}
			}
			else {
				for(int j=iarr[i].length-1;j>=0;j--) {
					iarr[i][j] = val++;
				}
			}
		}
		
		for(int i=0;i<iarr.length;i++) {
			for(int j=0;j<iarr[i].length;j++) {
				System.out.print(iarr[i][j]+"\t");
			}
			System.out.println();
		}

	}
	
	public void munjae4() {
		int[][] iarr = new int[5][5];
		
		int val=1;
		
		for(int i=0;i<iarr.length;i++) {
			for(int j=0;j<iarr[i].length;j++) {
				iarr[j][i] = val++;
			}
		}
		
		for(int i=0;i<iarr.length;i++) {
			for(int j=0;j<iarr[i].length;j++) {
				System.out.print(iarr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
