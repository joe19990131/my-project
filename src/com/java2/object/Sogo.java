package com.java2.object;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.*;

import sogo.Customer;
import sogo.GoldCustomer;
import sogo.SliverCustomer;

public class Sogo {
	Scanner sc1 = new Scanner(System.in);

	public void Sogo() {

	}

	public void start() {
		int function = 0;
		while (function != 3) {
			showFunctions();
			function = sc1.nextInt();
			switch (function) {
			case 1:
				inputSaleData();
				break;
			case 2:
				List<Sales> list = new ArrayList<>();
				try {
					//file input
					FileInputStream fis = new FileInputStream("sales.txt");
					//file input>>input reader
					InputStreamReader isr = new InputStreamReader(fis);
					//input reader>>BufferedReader
					BufferedReader in = new BufferedReader(isr);
					//讀行
					String line = in.readLine();
					//當line讀完(沒東西讀時)時
					while (line != null) {
						//將line以\t分割  例:1(等級)[0] \t(分割) 1000(金額)[1]
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
						line = in.readLine();//讀下一行
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// report

				//for each迴圈
				for (Sales sales: list){
					Customer customer = null;//???
					switch(sales.type){
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
				
				
				break;
			case 3:
				return;
			}
		}
	}
	public void inputSaleData() {
		try {
			FileOutputStream fos = new FileOutputStream("sales.txt", true);
			PrintStream out = new PrintStream(fos);
			System.out.print("請輸入會員等級:");
			int type = sc1.nextInt();
			System.out.print("請輸入銷售金額:");
			int amount = sc1.nextInt();
			out.println(type + "\t" + amount);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void showFunctions() {
		System.out.println("");
		System.out.println("1)輸入銷售記錄");
		System.out.println("2)印出銷售報表");
		System.out.println("3)結束程序");
	}

	public static void main(String[] args) {
		Sogo sogo = new Sogo();
		sogo.start();
	}
}
