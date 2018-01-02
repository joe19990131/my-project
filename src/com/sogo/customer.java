package com.sogo;

public class customer {
int amount;
float discount;
public customer(int amount,float discount){
	this.amount = amount;
	this.discount = discount;
}

public void print(){
	int total = (int)(amount*(1-discount));
	System.out.println(amount + "\t" + total);
}
}
