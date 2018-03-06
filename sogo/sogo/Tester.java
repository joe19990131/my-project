package sogo;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		ArrayList<Customer>cusdata = new ArrayList<>();
		cusdata.add(new Customer(10000));
		cusdata.add(new SliverCustomer(10000));
		cusdata.add(new SliverCustomer(10000));
		cusdata.add(new Customer(10000));
		cusdata.add(new GoldCustomer(10000));
		cusdata.add(new SliverCustomer(10000));
		for(int i = 0;i<=cusdata.size()-1;i++) {
			Customer c = cusdata.get(i);
			c.count();
			
			
		}
		
		
	}

}
