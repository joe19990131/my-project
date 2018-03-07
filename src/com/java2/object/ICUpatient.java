package com.java2.object;

public class ICUpatient extends Patient {
	private int comaIndex;

	public ICUpatient(String name, String idCardNumber, String sex, int age, int weight, int height, int comaIndex) {
		this.name = name;
		this.idCardNumber = idCardNumber;
		this.age = age;
		this.sex = sex;
		this.weight = weight;
		this.height = height;
		this.comaIndex = comaIndex;
	}

	@Override
	public void ShowHealthData() {
		System.out.println(weight + " kg " + "   " + height + " cm " + "   " + comaIndex);
	}
}
