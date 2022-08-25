package com.mycompany.study.ch06;

public class CarSecond {
	String color = "red";
	int cc = 1500;
	String name = "아반떼";
	
	CarSecond(String name){
		this.name = name;
	}
	
	CarSecond(String name, int cc){
		this.name = name;
		this.cc = cc;
	}
	CarSecond(String name, int cc, String color){
		this.name = name;
		this.cc = cc;
		this.color = color;
	}
	CarSecond(int cc){
		this.cc = cc;
		
	}
	//기본생성자
	CarSecond(){
		
	}
	
	//오버로드: 함수의 이름은똑같으나 매게변수의 위치나개수에따라 다른기능을 수행할수있따.
	}
