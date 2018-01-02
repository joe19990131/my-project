package com.vendermachine;
import java.util.*;
public class VenderMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drink d1 = new Drink();
		Boolean a = true;
		while(a){
		Scanner sc1 = new Scanner(System.in);
		int coin = sc1.nextInt();
		Drink[] drinks = new Drink[5];
		drinks[0] = new Drink(15, "a",coin);
		drinks[1] = new Drink(15, "b",coin);
		drinks[2] = new Drink(15, "c",coin);
		drinks[3] = new Drink(20, "d",coin);
		drinks[4] = new Drink(25, "e",coin);
	
		for(int i = 0;i<=4;i++){
			drinks[i].getCoin();
		}
		drinks[1].showMoney();
		if(coin!=1||coin!=5||coin!=10||coin!=50){}
		}
		
		Scanner sc2 = new Scanner(System.in);
		String name = sc2.nextLine();
		Drink name1 = new Drink(name);
		name1.getName();
		name1.showName();
	
		
		
	}
}
