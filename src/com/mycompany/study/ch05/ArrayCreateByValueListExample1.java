package com.mycompany.study.ch05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		
		//int[] scoreEng;
		//int scoreMath[];
		int[] score = {88,99,45,86,34};
		int sum = 0; 
		double avg = 0;
		
		//String[] name = {"장원영", "장동건", "고소영"};
		//System.out.println(score[0]);
		//System.out.println(name[2]);
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		
		avg = (double)sum/score.length;
		System.out.println("총 합:" + sum + "점, 평균: " + avg);
	}

}
