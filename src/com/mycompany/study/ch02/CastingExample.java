package com.mycompany.study.ch02;

public class CastingExample {

	public static void main(String[] args) {
		double doubleValue = 1234567;
		System.out.println("doubleValue : " + doubleValue);
		
		double doubleValue2 = 1234567891; // 7자리 이상인 경우에는 e로 표현됨
		System.out.println("doubleValue2 : " + doubleValue2);
		
		float floatValue = (float) doubleValue;
		System.out.println("floatValue : " + floatValue);
		
		long longValue = (long) floatValue;
		System.out.println("longValue : " + longValue);
		
		int intValue = (int) longValue;
		System.out.println("intValue : " + intValue);

		short shortValue = (short) intValue;
		System.out.println("shortValue : " + shortValue);
		
		byte byteValue = (byte) shortValue;
		System.out.println("byteValue : " + byteValue);
		
		String from = "30";
		int to = Integer.parseInt(from);
		System.out.println(to);
		
		int from1 = 123;
		String to1 = Integer.toString(from1);
		System.out.println(to1);
		
// ***************************************************************
		// int -> string
		String stringValue = String.valueOf(intValue);
		System.out.println(stringValue);
		
		// string -> int
		int intValue2 = Integer.parseInt(stringValue);
		System.out.println(intValue2);
// ***************************************************************
		// int - 원시 dt / integer - 참조 dt
		
	}

}
