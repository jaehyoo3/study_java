package com.mycompany.study.ch06;

public class ArithmeticExample {

	public static void main(String[] args) {
		
		Arithmetic arithmetic = new Arithmetic();

		
		int sum = arithmetic.sum(1,2);
		int subtract = arithmetic.subtract(3,2);
		int multiply = arithmetic.multiply(2323,2);
		int divide = arithmetic.divide(10,2);
		int share = arithmetic.share(10,3);
		
		arithmetic.say(sum);
		arithmetic.say(subtract);
		arithmetic.say(multiply);
		arithmetic.say(divide);
		arithmetic.say(share);

	}
}
