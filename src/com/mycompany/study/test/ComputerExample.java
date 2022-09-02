package com.mycompany.study.test;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 7;
		System.out.println("원의 반지름: " + r);
		System.out.println();
		
		Calculator calculator = new Calculator();
		System.out.println("원면적: " + calculator.param(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원면적: "+ computer.param(r));
		
	}

}
