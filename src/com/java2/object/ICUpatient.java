package com.java2.object;

public class ICUpatient extends PatientData {
	public int comaIndex;
public ICUpatient(String name,String idCardNumber,String sex,int age,float weight,float height,int comaIndex){
	this.name = name;
	this.idCardNumber = idCardNumber;
	this.age = age;
	this.sex = sex;
	this.weight = weight;
	this.height = height;
	this.comaIndex = comaIndex;
	
}
	

	@Override
	public void showHealthData() {
		System.out.println(weight + " kg " + "   " + height + " m " + "   " +"comaindex: "+ comaIndex);
	}
}
