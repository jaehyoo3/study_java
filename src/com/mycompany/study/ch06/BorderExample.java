package com.mycompany.study.ch06;

public class BorderExample {

	public static void main(String[] args) {
		Border border0 = new Border();
		Border border1 = new Border("김덕철");
		Border border2 = new Border("고용만", 12748);	
		Border border3 = new Border("김덕만", false);	
		Border border4 = new Border("박덕순", 9876986, true);
		
		border0.say();
		border1.say();
		border2.say();
		border3.say();
		border4.say();
	}

}
