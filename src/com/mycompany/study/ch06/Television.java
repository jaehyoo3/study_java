package com.mycompany.study.ch06;

public class Television {
	public static String model = "OLED";
	public static String company = "엘지";
	public static String info;
	
	public String version = "1.0";
	
	static {
		info = company + " / " + model;
	}

}
