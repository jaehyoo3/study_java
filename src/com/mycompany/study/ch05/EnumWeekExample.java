package com.mycompany.study.ch05;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week abc;
		Week xyz;
		
		abc = Week.SUNDAY;
		System.out.println(abc);
		
		String name = abc.name();
		System.out.println(name);
		
		int ordinal = abc.ordinal();
		System.out.println(ordinal);
		
		xyz = Week.THURSDAY;
		
		int result1 = abc.compareTo(xyz);
		int result2 = xyz.compareTo(abc);
		
		System.out.println(result1);
		System.out.println(result2);
		
		Week[] days = Week.values();
		
		for(Week day: days) {
			System.out.println(day);
		}
		}
	

}
