package com.mycompany.study.ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		int[][] score = {{99,88,55}, {55,77,66}, {55,55,44}, {55,55,44}, {55,55,77}};
		
		for(int i=0; i<score.length; i++) {
			int sum = 0;
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
			}	
			//개인의 평균
			System.out.println((double)sum/3);
		}
		
		System.out.println("---------------------------");
		int[] sum2 = new int[3];
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				sum2[j] += score[i][j];
			}
		}
		for(int i=0; i<sum2.length; i++) {
			System.out.println((double)sum2[i]/score.length);
		}
	
		
		System.out.println("---------------------------");
		
		for(int i=0; i<3; i++) {
			int sum = 0;
			for(int j=0; j<5; j++) {
				sum += score[j][i];
			}
			//과목별 평균
			System.out.println((double)sum/5);
		}
		
	}
}

