package com.finalexam;

import java.util.*;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("請投幣或選擇飲料(A OR B OR C)或輸入0退出");
		
		int money = 0;
		Boolean a = true;
		while (a) {
			Scanner sc1 = new Scanner(System.in);
			String coin = sc1.nextLine();
			switch (coin) {
			case "1":
				money = money + 1;
				System.out.println("目前餘額:" + money);
				break;
			case "5":
				money = money + 5;
				System.out.println("目前餘額:" + money);
				break;
			case "10":
				money = money + 10;
				System.out.println("目前餘額:" + money);
				break;
			case "a":
				money = money - 15;
				if(money>=0)
				{System.out.println("DON!");
				System.out.println("目前餘額:" + money);}
				else{System.out.println("BEEP!");}
				break;
			case "b":
				money = money - 20;
				if(money>=0)
				{System.out.println("DON!");
				System.out.println("目前餘額:" + money);}
				else{System.out.println("BEEP!");}
				break;
			case "c":
				money = money - 30;
				if(money>=0)
				{System.out.println("DON!");
				System.out.println("目前餘額:" + money);}
				else{System.out.println("BEEP!");}
				break;
			case "0" :
				System.out.println("BYE~");
				a = false;
			default : break;			
			}
		
		}

	}

}
