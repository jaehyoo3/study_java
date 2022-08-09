package com.mycompany.study.ch04;

public class ifExample2 {

	public static void main(String[] args) {
		int grade = 5;
		int price = 1000;
		double percent, sale;
		
		if(grade == 1) {
			percent = 0.05;
			sale = price - price * percent;
			System.out.println("등급: 일반 || 원가: " + price + " || 할인가 " + (int)sale);
		} else if(grade == 2) {
			percent = 0.10;
			sale = price - price * percent;
			System.out.println("등급: 브론즈 || 원가: " + price + " || 할인가 " + (int)sale);
		} else if(grade == 3) {
			percent = 0.15;
			sale = price - price * percent;
			System.out.println("등급: 실버 || 원가: " + price + " || 할인가 " + (int)sale);
		} else if(grade == 4) {
			percent = 0.20;
			sale = price - price * percent;
			System.out.println("등급: 골드 || 원가: " + price + " || 할인가 " + (int)sale);
		} else if(grade == 5) {
			percent = 0.027;
			sale = price - price * percent;
			System.out.println("등급: 플레티넘 || 원가: " + price + " || 할인가 " + (int)sale);
		} else {
			System.out.println("등급이 존재하지 않습니다.");
		}
	}

}
