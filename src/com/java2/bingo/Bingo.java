package com.java2.bingo;

import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;

import ECHO.com.oo.Arraylist;

public class Bingo {

	List<Integer> numbers = new ArrayList<>();
	int count;
	int row = 5;
	public Bingo(int count) {
		super();
		this.count = count;
		
	}
	
}
