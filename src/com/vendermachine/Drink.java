package com.vendermachine;

public class Drink {
	int price;
	String name;
	int coin;

	public Drink(int price, String name, int coin) {
		this.price = price;
		this.name = name;
		this.coin = coin;
	}

	public int getCoin() {
		return (coin);
	}

	public void showMoney() {
		System.out.println(coin);
	}

}
