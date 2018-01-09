package com.sogo;

public class customer {
int amount;
float discount;
public customer(int amount){
	this.amount = amount;
	
}



public void print(){
	int total = (int)(amount*(1-discount));
	System.out.println(amount + "\t" + total);
}
}
