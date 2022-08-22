package com.mycompany.study.ch06;

public class IPhoneExample {

	public static void main(String[] args) {
		IPhone iphone = new IPhone();
		Car car = new Car();
		
		iphone.pr();
		car.name = "소나타";
		System.out.println("Car:" + car.name);
		System.out.println("나의 아이폰 모델은 : " + iphone.Model);
		Handbag handbag = new Handbag();
		
		Icis icis = new Icis();
		
		System.out.println("내가 가지고 싶은 핸드백의 브랜드는 "+handbag.brand+ " 이다.");
		System.out.println(icis.varsion);

	}
}
