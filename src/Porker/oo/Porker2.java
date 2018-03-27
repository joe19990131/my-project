package Porker.oo;

import java.util.Random;
import java.util.*;
public class Porker2 {
	Random r1 = new Random();
	String flower = "SHDC";
	List<Integer> card = new ArrayList<>();
	//card check
	public void porker() {
		for(int i = 0;i<52;i++){
			card.add(i);
			/*System.out.print((i % 13) + 1 + "" + (flower.charAt(i / 13))+"\t");
			if((i+1)%13==0) {
				System.out.println();
			}*/
		}
	}
	public void shuffle() {
		for(int i = 0;i<card.size();i++) {
			int r = r1.nextInt(51);
			int tmp = card.get(i);
			card.set(i, card.get(r));
			card.set(r, tmp);
		}
	}
	public void show() {
		for(int i = 0;i<card.size();i++) {
			int c = card.get(i);
			System.out.print((c%13)+1+""+(flower.charAt(c/13))+"\t");
			if((i+1)%13==0) {
				System.out.println();
			}
		}
	}
}
