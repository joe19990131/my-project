package com.ibm;
import java.util.*;
public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		 for(int i = 1;i<=10;i++)
		 { 	int r1 = r.nextInt(6)+1;
		 	int r2 = r.nextInt(6)+1; 
		 	int r3 = r.nextInt(6)+1;
		 	int r4 = r.nextInt(6)+1;
			
			
			 if(r1!=r2 & r1!=r3 & r1!=r4 & r2!=r3 & r2!=r4 & r3!=r4)
			 {System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + "*");}
			 else{ System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);}
		 }
	}

}
