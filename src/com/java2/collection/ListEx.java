package com.java2.collection;

import java.util.*;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
		String[] namelist = nameSet.toArray(new String[0]);
		System.out.println(namelist[0]);
		System.out.println(namelist[1]);
		System.out.println(namelist[2]);
		

	    
	}

}
