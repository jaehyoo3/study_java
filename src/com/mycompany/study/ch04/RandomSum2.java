package com.mycompany.study.ch04;

public class RandomSum2 {

	public static void main(String[] args) {
		
		double min = 1;
		double max = 100;
		
		int random1 = (int)((Math.random() * (max-min)) + min);
		int random2 = (int) ((Math.random() * (max-min)) + min);
		
		int sum = 0, num1 = 0, num2 = 0;

		if(random1 > random2) {
			num1 = random1;
			num2 = random2;
		} else if(random2 > random1) {
			num1 = random2;
			num2 = random1;
		} else {
			System.out.println("두 수는 같습니다.");
		}
		
		System.out.println("최소값: " + num2 + ", 최대값: "+ num1);
		
		for(int i=num2; i<=num1; i++) {
			sum += i;
			System.out.println(i + " -> " + sum);
		}
		System.out.println("합: " + sum);
	}

}
