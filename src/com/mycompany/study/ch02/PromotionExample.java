package com.mycompany.study.ch02;

public class PromotionExample {
	public static void main(String[] args) {
		//작은 형이 큰 형으로 변환은 문제가 발생하지 않는다. 큰 형이 작은형으로 변환이 되려면 문제가 생기거나 변환이 이루어져도 데이터 손실이
		//발생한다.
		//byte < short < int < long < float < double
		
		byte byteValue= 10;
		System.out.println("byteValue : " + byteValue);
		
		int intVal = byteValue;
		System.out.println("intVal : " + intVal);

		int intValue2= 1234567890;
		System.out.println("intValue : " + intValue2);
		
		byte byteValue2 = (byte) intValue2;
		System.out.println("bytetVal : " + byteValue2);

		int intValue3= 300;
		System.out.println("intValue : " + intValue3);
		
		double doubleValue = intValue3;
		System.out.println("doubleValue : " + doubleValue);
	}
}
