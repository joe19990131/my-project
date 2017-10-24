package ECHO.com;

import java.util.Scanner;

public class rwey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("請輸入您的姓名:");
		Scanner a1 = new Scanner(System.in);
		String line= a1.nextLine();
		System.out.println("hello " + line);
		System.out.println("幾歲?");
		Scanner a2 = new Scanner(System.in);
		int line1 = a2.nextInt();
		int a3 = 18;
		if(line1 >= a3)
		{System.out.println("老");	}
		else
		{System.out.println("年輕!");	}
	

}}
