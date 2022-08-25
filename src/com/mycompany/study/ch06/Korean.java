package com.mycompany.study.ch06;

public class Korean {
	String name = "장덕팔";
	String ssn = "0120101-1231234";
	int age = 56;

	Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
		
	Korean(String name, int age) {
		this.name = name;
		this.age = age;
	}
	Korean(){
		
	}
	static String national = "대한민국";
	
	static int staticTest(int a) {
		return a + 10;
	}
	
	int ttest() {
		Arithmetic arithmetic = new Arithmetic();
		arithmetic.aaa(12);
		
		return 1;
	}
	public void test2 () {
		Arithmetic.testtt();
	}
}
