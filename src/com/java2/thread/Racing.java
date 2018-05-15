package com.java2.thread;


import java.util.*;
public class Racing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse h1 = new Horse();
		h1.start();
		//Horse h2 = new Horse();
		//h2.start();
		
		
		//List<Horse> horses = new ArrayList<>();
		//for(int i = 0;i<=8;i++){
			//Horse h = new Horse();
			//horses.add(h);
			//h.start();
		//}
		
		
		HorseRunable h2 = new HorseRunable();
		Thread thr = new Thread(h2);
		thr.start();
		try {
			h1.join();
			thr.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("main ended");
	}

}
