package com.mycompany.study.ch06;

public class Arithmetic {
	int num = 0;
	String plus;
	
	public int sum(int a, int b) {
		num = a + b;
		return num;
	}
	public int subtract(int a, int b) {
		num = a - b;
		return num;
	}
	public int multiply(int a, int b) {
		num = a * b;
		return num;
	}
	public int divide(int a, int b) {
		num = a / b;
		return num;
	}
	public int share(int a, int b) {
		num = a % b;
		return num;
	}
	public void say(int a) {
	    System.out.println("값은 : " + a);
	}
	public void plus(String c, String d) {
		System.out.println(c + d);
	}
}
