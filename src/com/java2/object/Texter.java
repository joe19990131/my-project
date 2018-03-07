package com.java2.object;
import java.util.*;
public class Texter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		String a1 = sc1.nextLine();
		
			switch(a1){
			case "john":
				ICUpatient p1 = new ICUpatient("John", "A123456789", "man", 55, 65, 182, 4);
				p1.ShowIdentity();
				p1.ShowHealthData();
				break;
			
			
		}

	}

}
