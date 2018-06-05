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
	public Vendingmachine(){
		
	}
	
	public void addDrink(int id,String name,int price){
		drinks.add(new Drink(id, name, price));
	}
	public void reader(){
		try {
			FileInputStream fis = new FileInputStream("drinks.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader in = new BufferedReader(isr);
			String line = in.readLine();
			while(line!=null){
				String[] token = line.split(",");
				try {
					int id = Integer.parseInt(token[0]);
					String name = token[1];
					int price = Integer.parseInt(token[2]);
					Drink dr = new Drink(id, name, price);
					drinks.add(dr);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("wrong data structure!!");
				}
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
	public void on(){
		for(int i = 0;i<drinks.size();i++){
			drinks.get(i);
		}
		
	}
}