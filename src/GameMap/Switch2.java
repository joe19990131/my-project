package GameMap;

import java.util.*;

public class Switch2 {

	public static void main(String[] args) { // TODO Auto-generated method stub
		int pos = 0;
		int hp = 100;
		int row = 3;
		int col = 5;
		Random r1 = new Random();
		
		boolean a = true;
		while (a) {
			Scanner sc1 = new Scanner(System.in);
			int i = sc1.nextInt();
			switch (i) {
			case 8:
				if(pos/col>0)
				{pos = pos-5;}else{hp=hp-5;}
				System.out.println(pos + " " + hp);
				break;
			case 2:
				if(pos/col<2)
				{pos = pos+5;}else{hp = hp-5;}			
				System.out.println(pos + " " + hp);
				break;
			case 4:
				if(pos%col>0)
				{pos = pos - 1;}else{hp = hp-5;}
				System.out.println(pos + " " + hp);
				break;
			case 6:
				if(pos%col <4)
				{pos = pos+1;}else{hp = hp-5;}
				System.out.println(pos + " " + hp);
				break;
			case 5:
				System.out.println("attack!!");
				break;
			
			}
			
			if (i == 0 || hp <= 0) {
				System.out.println("~~GAME OVER~~");
				a = false;
			}
		}

	}

}
