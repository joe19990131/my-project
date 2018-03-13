package com.java2.object;

public class Docter {
	String name;
	protected String division;
	protected String id;
	protected int patientAmount;

	public Docter(String name, String division, String id, int patientAmount) {
		this.name = name;
		this.division = division;
		this.id = id;
		this.patientAmount = patientAmount;
	}

	public void ShowName() {
		System.out.println(name);
	}

	private void ShowDrData() {
		System.out.println("姓名:" + name);
		System.out.println("醫師證代碼" + id);
		System.out.println("病患數量:" + patientAmount);
	}
}
