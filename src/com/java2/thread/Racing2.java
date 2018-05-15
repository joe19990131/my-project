package com.java2.thread;
import java.util.*;
public class Racing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Horse> list = new ArrayList<>();
		Horse h1 = new Horse(list);
		h1.start();
		Horse h2 = new Horse(list);
		h2.start();
		Horse h3 = new Horse(list);
		h3.start();
		
		try {
			h1.join();
			h2.join();
			h3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main ended");
		System.out.println(list);
	}

}
