package venderMechine;

import java.util.*;

public class VenderMechine {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		Boolean a = true;
		Boolean b = true;
		Drink[] drinks = new Drink[4];
		drinks[0] = new Drink(15, "a");
		drinks[1] = new Drink(15, "b");
		drinks[2] = new Drink(20, "c");
		drinks[3] = new Drink(20, "d");
		System.out.println("請投入金額");
		while (a) {

			Scanner sc1 = new Scanner(System.in);
			String ca = sc1.nextLine();
			switch (ca) {
			case "1":
				Drink.cash = Drink.cash + 1;
				System.out.println(Drink.cash);
				break;
			case "5":
				Drink.cash = Drink.cash + 5;
				System.out.println(Drink.cash);
				break;
			case "10":
				Drink.cash = Drink.cash + 10;
				System.out.println(Drink.cash);
				break;
			case "50":
				Drink.cash = Drink.cash + 50;
				System.out.println(Drink.cash);
				break;
			case "0":
				a = false;
				break;
			case "a":
				drinks[0].countMoney();
				System.out.println(Drink.cash);
				break;
			case "b":
				drinks[1].countMoney();
				System.out.println(Drink.cash);
				break;
			case "c":
				drinks[2].countMoney();
				System.out.println(Drink.cash);
				break;
			case "d":
				drinks[3].countMoney();
				System.out.println(Drink.cash);
				break;
			default:
				break;

			}
		}

	}

}
