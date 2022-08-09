package com.mycompany.study.ch04;

public class ifExample5 {

	public static void main(String[] args) {
		int a = -1;
		int b = 1;
		
		if(a>0 && b>0 ) {
			System.out.println("1");
		} else if( a<0 && b>0) {
			System.out.println("2");
		} else if(a<0 && b<0) {
			System.out.println("3");
		} else if(a>0 && b<0){
			System.out.println("4");
		} else {
			System.out.println("0");
		
		}

	}

}


