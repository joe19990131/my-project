package com.java2.object;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.*;

import sogo.Customer;
import sogo.GoldCustomer;
import sogo.SliverCustomer;

public class ReSogo {
	Scanner sc1 = new Scanner(System.in);

	public void go() {
	boolean oc = true;
	while(oc) {
		showFunction();
		int function = sc1.nextInt();
		switch(function) {
		case 1:
			enterData();;
			break;
		case 2:
			printData();
			break;
		case 3:
			oc = false;
			break;
		}
	}
	}

	public void showFunction() {
		System.out.println("Please choose function");
		System.out.println("");
		System.out.println("1)Enter sales data");
		System.out.println("2)Print data");
		System.out.println("3)EXIT");
	}

	public void enterData() {
		try {
			FileOutputStream fos = new FileOutputStream("sales.txt", true);
			PrintStream out = new PrintStream(fos);
			System.out.println("Please enter customer's type");
			int type = sc1.nextInt();
			System.out.println("Please enter amount");
			int amount = sc1.nextInt();
			out.println(type + "\t" + amount);
			out.flush();
			out.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Err:File not found");
		}
	}

	public void printData() {
		List<Sales> list = new ArrayList<>();
		try {
			FileInputStream fis = new FileInputStream("sales.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader in = new BufferedReader(isr);
			String line = in.readLine();
			while (line != null) {
				String[] token = line.split("\t");
				try {
					int type = Integer.parseInt(token[0]);
					int amount = Integer.parseInt(token[1]);
					Sales sales = new Sales(type, amount);
					list.add(sales);
				} catch (NumberFormatException e) {
					System.out.println("資料格式錯誤");
					return;
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
		for(Sales sales : list) {
			Customer customer = null;	//劃分空間給customer
			switch(sales.type){			//sale.type is a int
			case 1: 
				customer = new Customer(sales.getAmount());
				break;
			case 2:
				customer = new SliverCustomer(sales.getAmount());
				break;
			case 3:
				customer = new GoldCustomer(sales.getAmount());
				break;
			}
			customer.count();
		}
	}

	
	//大事throw  小事try catch
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReSogo sogo = new ReSogo();
		sogo.go();
	}

}
