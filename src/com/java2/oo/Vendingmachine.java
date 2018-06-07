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
	
	public void on(){
		Scanner sc1 = new Scanner(System.in);
		for(int i = 0;i<drinks.size();i++){
			drinks.get(i);
			
			
		}
		System.out.println("請選擇飲料");
	}
}