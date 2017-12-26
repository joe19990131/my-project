package com.vendermachine;
import java.util.*;
public class VenderMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Drink[] drinks = new Drink[5];
		drinks[0] = new Drink(15+i, "a",i);
		drinks[1] = new Drink(15+i, "b",i);
		drinks[2] = new Drink(15+i, "c",i);
		drinks[3] = new Drink(20+i, "d",i);
		drinks[4] = new Drink(20+i, "e",i);
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int coin = sc1.nextInt();
		String name = sc2.nextLine();
		i = i+coin;
	}
}
