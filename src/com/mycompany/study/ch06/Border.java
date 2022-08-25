package com.mycompany.study.ch06;

public class Border {
	String name = "강덕팔";
	int views = 0;
	boolean YN = true;
	
	Border() {
		
	}
	Border(String name) {
		this.name = name;
	}
	Border(String name, int views) {
		this.name= name;
		this.views = views;
	}
	Border(String name, boolean YN){
		this.name = name;
		this.YN = YN;
	}
	Border(String name, int views, boolean YN) {
		this.name = name;
		this.views = views;
		this.YN = YN;
	}
	public void say() {
		System.out.println("이름: "+name+", 조회수: "+views+", 사용여부: " + YN);
	}
}
