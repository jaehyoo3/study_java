package com.mycompany.study.ch04;

public class MultiplicationTable {

	public static void main(String[] args) {
		// 2단 출력 프로그램
		
//		for(int i=1; i<=9; i++) {
//			System.out.println("2 * " + i +" = " + 2*i);
//		}
		
		//2단부터 9단까지 출력하는 프로그램: 6줄이상 되지않게
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " :" + i*j);
				if(j == 9) System.out.println("------------------");
			}
		}

	}

}
