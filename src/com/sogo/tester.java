package com.sogo;
import java.util.*;
public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		int price = sc1.nextInt();
		customer cus = new customer(price);
		
		
		System.out.println("請選擇會員種類或按零退出");
		Boolean a = true;
		while(a){
		Scanner sc2 = new Scanner(System.in);
		String sct = sc2.nextLine();
		
		
		
			switch(sct){
			case "1" :
				System.out.println("選擇普通會員");
				cus.print();
			case "2" : 
				System.out.println("選擇銀色會員");
			}
			
		}
	}

}
