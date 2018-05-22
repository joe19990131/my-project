package com.java2.snowing;
import java.util.*;
public class SnowTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Snow> snows = new ArrayList<>();
		for(int i = 1;i<=10;i++){
			Snow s1 = new Snow();
			s1.start();
			snows.add(s1);
		}
		
		
	
		
	}

}
