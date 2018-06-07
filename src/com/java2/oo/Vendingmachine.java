package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vendingmachine {
	List<Drink> drinks = new ArrayList<>();

	public Vendingmachine() {

	}

	public void addDrink(int id, String name, int price) {
		drinks.add(new Drink(id, name, price));
	}

	public void on() {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int sw = -1;
		int sw1 = -1;
		int coin = 0;
		for (int i = 0; i < drinks.size(); i++) {
			Drink drink = drinks.get(i);
			System.out.println(drink.getId() + "\t" + drink.getName() + "\t" + drink.getPrice());

		}
		System.out.println("請投幣或按0結束投幣");
		
			while (sw1 != 0) {
				switch (sc1.nextInt()) {
				case 1:
					coin++;
					break;
				case 5:
					coin = coin + 5;
					break;
				case 10:
					coin = coin + 10;
					break;
				case 50:
					coin = coin + 50;
					break;
				case 0:
					sw1 = 0;
					break;
				}
			}
			
			while (sw != 0) {
			switch(sc2.nextInt()) {
			case 1:
				coin = coin-25;
				break;
			case 2:
				coin = coin-30;
				break;
			case 3:
				coin = coin-20;
				break;
			case 0:
				sw = 0;
				break;
			}
		}
	}
}