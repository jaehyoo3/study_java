package com.mycompany.study.ch03;

public class StringEqualsExample {

	public static void main(String[] args) {
		String str1 = "강아지";
		String str2 = "강아지";
		String str3 = new String("강아지");
		
		boolean result = (str1 == str2);
		boolean result2 = (str1 == str3);
		
		System.out.println("result: " + result + ", result2: " + result2);
		System.out.println("strl.equals(str2): "+ str1.equals(str2));
		System.out.println("strl.equals(str3): "+ str1.equals(str3));
		
	
	}

}
