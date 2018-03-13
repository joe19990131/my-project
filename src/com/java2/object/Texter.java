package com.java2.object;
import java.util.*;
public class Texter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boolean a = new Boolean(true);
		System.out.println("Please enter patient's name ");
		
		
		
		
		while(a){
			Scanner sc1 = new Scanner(System.in);
			String a1 = sc1.nextLine();
			switch(a1){
			case "john":
				ICUpatient p1 = new ICUpatient("john", "A123456789", "man", 55, 63.9f, 1.81f, 5);
				p1.showIdentity();
				p1.showHealthData();
				p1.countBMI();
				break;
			case "999":
				System.out.println("System out.");
				a = false;
			}
		}
			
			
		
	}

}
