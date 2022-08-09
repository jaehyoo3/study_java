package com.mycompany.study.ch04;

public class ifExample4 {

	public static void main(String[] args) {
		int a = 0;
		a = a % 2;
		
		if(a != 0) {
			if(a == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		} else {
			// a == 0
			System.out.println("0입니다");
		}
	}

}
