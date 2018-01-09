package com.train;

import java.util.ArrayList;

public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ArrayList<Ticket> t = new ArrayList<>();
		t.add(new Ticket("2018/01/01", 2000, "Tpi", "TC", 200));
		t.add(new RTicket("2018/01/01", 2000, "Tpi", "TC", 200));
		t.add(new Ticket("2018/01/01", 2000, "Tpi", "TC", 200));
		t.add(new RTicket("2018/01/01", 2000, "Tpi", "TC", 200));
		for(int i = 0;i<=t.size();i++){
			System.out.println(t.get(i));
		}*/
		Ticket t1 = new Ticket("2018/05/21", 2200, "tpi", "hl", 1000);
		RTicket t2 = new RTicket("2018/05/21", 2200, "tpi", "hl", 1000);
		t1.price();
		t2.price();
		
	}

}
