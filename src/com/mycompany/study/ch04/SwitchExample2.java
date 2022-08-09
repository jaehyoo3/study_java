package com.mycompany.study.ch04;

public class SwitchExample2 {

	public static void main(String[] args) {
		int grade = 4;
		int price = 10000;
		double percent, sale;
		
		switch(grade) {
			case 1:
				percent = 0.05;
				sale = price - price * percent;
				System.out.println("등급: 일반 원가: " + price + "원, 할인가 " + (int)sale);
				break;
			case 2:
				percent = 0.1;
				sale = price - price * percent;
				System.out.println("등급: 브론즈 원가: " + price + "원, 할인가 " + (int)sale);
				break;
			case 3:
				percent = 0.15;
				sale = price - price * percent;
				System.out.println("등급: 실버 원가: " + price + "원, 할인가 " + (int)sale);
				break;
			case 4:
				percent = 0.2;
				sale = price - price * percent;
				System.out.println("등급: 골드 원가: " + price + "원, 할인가 " + (int)sale);
				break;
			case 5:
				percent = 0.027;
				sale = price - price * percent;
				System.out.println("등급: 플레티넘 원가: " + price + "원, 할인가 " + (int)sale);
				break;
			default:
				System.out.println("등급이 존재하지 않습니다.");
				break;
		}
	}

}
