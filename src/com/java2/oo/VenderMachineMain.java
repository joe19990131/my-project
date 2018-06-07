package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class VenderMachineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vendingmachine vm = new Vendingmachine();
		try {
			FileInputStream fis = new FileInputStream("drinks.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader in = new BufferedReader(isr);
			String line = in.readLine();
			while(line!= null){
				String[] tokens = line.split(",");
				int count = Integer.parseInt(tokens[0]);//飲料種類數量
				for (int i = 0; i < count; i++){
					String name = tokens[i*2+1];
					int price = Integer.parseInt(tokens[i*2+2]);
					vm.drinks.add(new Drink(i+1, name, price));
				}
				vm.on();
		//System.out.println(123);
		line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
