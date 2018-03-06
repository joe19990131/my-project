package venderMechine;

import java.util.*;

public class VenderMechine1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		
		Boolean a = true;
		Boolean b = true;
		Drink[] drinks = new Drink[4];
		drinks[0] = new Drink(15, "a");
		drinks[1] = new Drink(15, "b");
		drinks[2] = new Drink(20, "c");
		drinks[3] = new Drink(20, "d");
		//Drink d1 = new Drink(i);
		int cash = Drink.RetCash();
		
		System.out.println("請投入金額後按0確認");
 		while (a) {
			
			Scanner sc1 = new Scanner(System.in);
			int ca = sc1.nextInt();
			switch (ca) {
			case 1:
				Drink.cash = Drink.cash + 1;
				System.out.println(Drink.cash);
				break;
			case 5:
				Drink.cash = Drink.cash + 5;
				System.out.println(Drink.cash);
				break;
			case 10:
				Drink.cash = Drink.cash + 10;
				System.out.println(Drink.cash);
				break;
			case 50:
				Drink.cash = Drink.cash + 50;
				System.out.println(Drink.cash);
				break;
			case 0:
				a = false;
			}
		}
		
			Scanner sc2 = new Scanner(System.in);
			String name = sc2.nextLine();
			switch(name) {
			case "a":
				drinks[0].countMoney();
				break;
			case "b":
				drinks[1].countMoney();
				break;
			case "c":
				drinks[2].countMoney();
				break;
			case "d":
				drinks[3].countMoney();
				break;
			
			default:
				b = false;
			}
			
	}

}
