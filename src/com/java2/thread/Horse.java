package com.java2.thread;

import java.util.List;

public class Horse extends Thread {
	List<Horse> list;
	public Horse(){}
	public Horse(List<Horse> list){
		this.list = list;
	}
	
	@Override
	public void run(){
		for(int i = 0;i<=100;i++){
			System.out.println(getName()+":"+i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list.add(this);
		}
	}
}
