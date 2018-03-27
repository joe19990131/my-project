package com.java2.object;
import java.util.*;
import java.util.List;
public class Texter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boolean a = new Boolean(true);
		System.out.println("Please enter patient's name ");
		
		List<String> name = new ArrayList<>();
		name.add("john");
		name.add("amy");
		name.add("alice");
		System.out.println("removing name:"+name.remove(0));
		System.out.println(name.size());
		System.out.println(name.get(1));
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
