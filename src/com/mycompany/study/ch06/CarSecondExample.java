package com.mycompany.study.ch06;

public class CarSecondExample {
	public static void main(String[] args) {
		CarSecond carsecond = new CarSecond("그랜져");
		System.out.println(carsecond.name);
		CarSecond carsecond2 = new CarSecond("소나타",2000);
		System.out.println(carsecond2.name+" / "+ carsecond2.cc);
		CarSecond carsecond3 = new CarSecond("아이오닉", 5000);
		System.out.println(carsecond3.name+"/ " + carsecond3.cc + " / " + carsecond3.color);
		CarSecond carsecond4 = new CarSecond(5000);
		System.out.println(carsecond4.cc);
	}
}
