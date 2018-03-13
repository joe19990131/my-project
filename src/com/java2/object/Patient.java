package com.java2.object;

public class Patient {
	String name;
	String sex;
	String idCardNumber;
	int age;
	float weight;
	float height;
public Patient(){}
public Patient(String name,String idCardNumber,String sex,int age,float weight,float height){
	this.name = name;
	this.idCardNumber = idCardNumber;
	this.age = age;
	this.sex = sex;
	this.weight = weight;
	this.height = height;
	
}


public void showIdentity(){
	System.out.println("name:" + name + "   " +idCardNumber + "   " + sex + "   " +age+"y");
}
public void showHealthData(){
	System.out.println(weight + " kg " +"   " + height+" m ");
} 
public void countBMI(){
	System.out.println(weight/(height*height));
}
}
