package com.train;

public class RTicket extends Ticket {

	public RTicket(String date, int time, String start, String end, int price) {
		super(date, time, start, end, price);
		super.price = (int)(price*2*0.85);
		// TODO Auto-generated constructor stub
	}

}
