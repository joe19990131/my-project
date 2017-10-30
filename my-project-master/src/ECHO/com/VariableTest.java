package ECHO.com;

import java.util.*;

public class VariableTest 
{

	public static void main(String[] args) 
	{
	
	
    Random r = new Random();
    int r1 = r.nextInt(6)+1;
    int r2 = r.nextInt(6)+1; 
    int r3 = r.nextInt(6)+1;
    int r4 = r.nextInt(6)+1;

    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);
    System.out.println(r4);
	

	String s1 = new String("jdam");
	int len = s1.length();
    System.out.println("len:" + len);
	System.out.println(s1.charAt(1));
	
	{System.out.println("please input your name:");
	Scanner a1 = new Scanner(System.in);
	String line= a1.nextLine();
	System.out.println("hello " + line);
	System.out.println("how old are you?" + line);
	Scanner a2 = new Scanner(System.in);
	int line1 = a2.nextInt();
	int a3 = 18;
	if(line1 >= a3)
	{System.out.println("18years old Allowed to enter");	}
	else
	{System.out.println("get out!kid!");	}
	
	
	
	
	int x = 20;
	int y = 13;
	int z = x/y;
	
	System.out.println(z);
	System.out.println(z <= 0 || z>=3);
	System.out.println(z>=0 & z<=3);
	x +=2;
	
	System.out.println(x);
	
	
	}	 
}}
	