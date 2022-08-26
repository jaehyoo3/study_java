package com.mycompany.study.ch07.third;

public class Computer extends Calculator {

//	@Override
//	public double areaCircle(double r) {
//		// TODO Auto-generated method stub
//		return super.areaCircle(r);
//	}

// 오른쪽마우스 소스 -> 오버라이드 기능.
	public double areaCircle(double r) {
		System.out.println("calculator 객체의 area circle 실행");
		return Math.PI * r * r;
	}
}
