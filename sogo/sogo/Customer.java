package sogo;

public class Customer implements Destroyable {
	int amount;
	double discount = 0.1;

	public Customer() {
		// TODO 自動產生的建構子 Stub
	}
	public Customer(int amount) {
		this.amount = amount;
	}
	public void count() {
		int total = (int)(amount*(1-discount));
		System.out.println(total);
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	
}
