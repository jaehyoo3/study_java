package com.mycompany.study.ch04;

public class ifExample2 {

	public static void main(String[] args) {
		int grade = 5;
		int price = 10000;
		
		if(grade == 1) {
			System.out.println("등급: 일반, " + price + " (" + price*0.05 + ")  = (" + (price- price*0.05) + ")할인");
		} else if(grade == 2) {
			System.out.println("등급: 일반, " + price + " (" + price*0.10 + ")  = (" + (price- price*0.10) + ")할인");
		} else if(grade == 3) {
			System.out.println("등급: 일반, " + price + " (" + price*0.15 + ")  = (" + (price- price*0.15) + ")할인");
		} else if(grade == 4) {
			System.out.println("등급: 일반, " + price + " (" + price*0.20 + ")  = (" + (price- price*0.20) + ")할인");
		} else if(grade == 5) {
			System.out.println("등급: 일반, " + price + " (" + price*0.27 + ")  = (" + (price- price*0.27) + ")할인");
		}
	}

}
