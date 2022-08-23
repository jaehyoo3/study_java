package com.mycompany.study.ch06;

public class koreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("이순신", "011225-54644323");
		System.out.println("k1.name: " + k1.name);
		System.out.println("k1.ssn: " + k1.ssn);
		
		Korean k2 = new Korean("이순신", 45);
		System.out.println("k2.name: " + k2.name);
		System.out.println("k2.age: " + k2.age);

	}

}
