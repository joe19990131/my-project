package ECHO.com.oo;

import java.util.ArrayList;
import java.util.*;
import com.sogo.customer;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		int price = sc1.nextInt();
		
		ArrayList<customer> list = new ArrayList<>();
		list.add(new customer(price));
		list.add(new customer(price));
		list.add(new customer(price));
		list.add(new customer(price));
		list.add(new customer(price));
		
		for(int i = 0;i<=4;i++){
			System.out.println(list.get(i));
		}
		
		
	}

}
