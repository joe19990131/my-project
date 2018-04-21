package Porker.oo;

import java.util.*;

public class Card {

	Random r1 = new Random();
	String flower = "SHDC";
	int[] number = new int[52];

	public void porker() {
		for (int i = 0; i < number.length; i++) {
			number[i] = i;
			//System.out.println((i % 13) + 1 + "" + (flower.charAt(i / 13)));
		}

	}

	public void shuffle() {
		for (int i = 0; i < number.length; i++) {
			int r = r1.nextInt(51);
			int tmp = number[i];
			number[i] = number[r];
			number[r] = tmp;
		}
	}

	public void show() {
		for (int i = 0; i < number.length; i++) {
			int c = number[i];
			System.out.print((c % 13) + 1 + "" + (flower.charAt(c / 13)) + "\t");
			if ((i+1) % 13 == 0) {
				System.out.println();
			}
		}
	}
}
