package com.mycompany.study.test;

public class Computer extends Calculator{

	@Override
	public double param(int num) {
		System.out.println("Calculator 객체의 원 면적 구하는 프로그램 실행");
		
		return num * num * Constants.PAI_2;
	}



}
