package com.kao;

public class NumberTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
			if(i%5==0 & i%3==0){System.out.println();}
		}
	}

}
