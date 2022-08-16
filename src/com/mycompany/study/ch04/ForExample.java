package com.mycompany.study.ch04;

public class ForExample {

	public static void main(String[] args) {		
		
		/*
	for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print("*");
			}
				System.out.println("");
		} */
		
/*		for(int i=1; i<=5; i++) {
			if(i == 1) {
				System.out.println("*******");
			}
			else if(i == 5) {
				System.out.println("*******");
			}
			else {
				System.out.println("*     *");
			}
		} */
		/*
		for(int i=1; i<=5; i++) {
			for(int j<=10; j++) {
				if(i==4)
			}
			
		} */
	
		for(int i=1; i<10; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
				System.out.println(" ");
				if(i%2 != 0) {
					System.out.print(i +" ");
				}
			}

		
		
	}
}


