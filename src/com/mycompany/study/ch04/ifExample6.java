package com.mycompany.study.ch04;

public class ifExample6 {

	public static void main(String[] args) {
		int a = 7;
		int b = 7;
		int c = 7;
		
		if(a>b) {
			if(b>c) {
				System.out.println(a +"/"+ c);
			} else {
				System.out.println(a+"/"+b);
			}
		} else if(b>c) {
			if(c>a) {
				System.out.println(b+"/"+a);
			} else {
				System.out.println(b+"/"+c);
			}
		} else if(c>a) {
			if(b>a) {
				System.out.println(c+"/"+a);
			} else {
				System.out.println(c+"/"+b);
			}
		} else {
			System.out.println("최대값 혹은 최소값이 같습니다");
		}
	}
}