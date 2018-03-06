package com.java2.object;

public class Patient {
	String name;
	String sex;
	String idCardNumber;
	int age;
	int weight;
	int height;
public Patient(){}
public Patient(String name,String idCardNumber,String sex,int age){
	this.name = name;
	this.idCardNumber = idCardNumber;
	this.age = age;
	this.sex = sex;
}
public Patient(int weight,int height){
	this.weight = weight;
	this.height = height;
}
public void ShowIdentity(){
	System.out.println(name + " " +idCardNumber + " " + sex + " " +age);
}
public void ShowHealthData(){
	System.out.println(weight + " kg " + height+" cm ");
} 
}
