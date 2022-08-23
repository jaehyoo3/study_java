package com.mycompany.study.ch06;

public class HyundaiExample {

	public static void main(String[] args) {
		Hyundai hyundai = new Hyundai();
		
		for(int i=0; i<hyundai.model.length; i++) {
			System.out.println(hyundai.model[i]);
		}
		
		System.out.println(hyundai.sum(1,2));
		
	}

}
