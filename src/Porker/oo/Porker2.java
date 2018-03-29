package Porker.oo;

import java.util.Random;
import java.util.*;

public class Porker2 {
	Random r1 = new Random();
	String flower = "SHDC";
	List<Integer> card = new ArrayList<>();

	// card check
	public void porker() {
		for (int i = 0; i < 52; i++) {
			card.add(i);
			/*
			 * System.out.print((i % 13) + 1 + "" + (flower.charAt(i / 13))+"\t");
			 * if((i+1)%13==0) { System.out.println(); }
			 */
		}
	}

	public void shuffle() {
		for (int i = 0; i < card.size(); i++) {
			int r = r1.nextInt(51);
			int tmp = card.get(i);
			card.set(i, card.get(r));
			card.set(r, tmp);
		}
	}

	public void show() {
		for (int i = 0; i < card.size(); i++) {
			int c = card.get(i);
			if ((c + 13 + 1) % 13 == 1) {
				System.out.print("A" + "" + (flower.charAt(c / 13)) + "\t");
			}
			if ((c + 13 + 1) % 13 > 1 && (c + 13 + 1) % 13 < 11) {
				System.out.print((c % 13) + 1 + "" + (flower.charAt(c / 13)) + "\t");
			}
			if ((c + 13 + 1) % 13 == 11) {
				System.out.print("J" + "" + (flower.charAt(c / 13)) + "\t");
			}
			if ((c + 13 + 1) % 13 == 12) {
				System.out.print("Q" + "" + (flower.charAt(c / 13)) + "\t");
			}
			if ((c + 13 + 1) % 13 == 0) {
				System.out.print("K" + "" + (flower.charAt(c / 13)) + "\t");
			}
			if ((i + 1) % 13 == 0) {
				System.out.println();
			}
		}
	}

	public void deal() {
		for (int i = 0; i < 13; i++) {
			int c = card.get(i);
			if ((c + 13 + 1) % 13 == 1) {
				System.out.print("A" + "" + (flower.charAt(c / 13)) + "\t");
			}
			if ((c + 13 + 1) % 13 > 1 && (c + 13 + 1) % 13 < 11) {
				System.out.print((c % 13) + 1 + "" + (flower.charAt(c / 13)) + "\t");
			}
			if ((c + 13 + 1) % 13 == 11) {
				System.out.print("J" + "" + (flower.charAt(c / 13)) + "\t");
			}
			if ((c + 13 + 1) % 13 == 12) {
				System.out.print("Q" + "" + (flower.charAt(c / 13)) + "\t");
			}
			if ((c + 13 + 1) % 13 == 0) {
				System.out.print("K" + "" + (flower.charAt(c / 13)) + "\t");
			}
			if ((i + 1) % 13 == 0) {
				System.out.println();
			}
		}
	}

	public void sort() {
		for (int i = 0; i < card.size(); i++) {
			for (int j = i + 1; j < card.size(); j++) {
				if (card.get(i) > card.get(j)) {
					int tmp = card.get(i);
					card.set(i, card.get(j));
					card.set(j, tmp);
				}
			}
		}
	}
}
