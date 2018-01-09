package com.train;

public class Ticket {
	String date;
	int time;
	String start;
	String end;
	int price;

	public Ticket(String date, int time, String start, String end, int price) {
		this.date = date;
		this.time = time;
		this.start = start;
		this.end = end;
		this.price = price;
	}
	public void price(){
		System.out.println(date + time);
		System.out.println(start + "~" + end);
		System.out.println(price);
	}
	
}
