package com.mycompany.study.ch04;

public class ifExample2 {

	public static void main(String[] args) {
		int grade = 1;
		double price = 10000;
		
		if(grade == 1) {
			System.out.println("등급: 일반, " + price + " (" + price*0.05 + ")  = (" + (price- price*0.05) + ")할인");
		} else if(grade == 2) {
			System.out.println("등급: 브론즈, " + price + "(" + price*0.10 +") 할인");
		} else if(grade == 3) {
			price = price * 0.15;
			System.out.println("등급: 실버, " + price + "(" + price*0.15 + ") 할인");
		} else if(grade == 4) {
			price = price * 0.20;
			System.out.println("등급: 골드, " + price + "(" + price*0.20 + ") 할인");
		} else if(grade == 5) {
			price = price * 0.27;
			System.out.println("등급: 플레티넘, " + price + "(" + price*0.27 +") 할인");
		}
	}

}
