package ECHO.com;

import java.util.Random;

public class VariableTest 
{

	public static void main(String[] args) 
	{
	 int age = 0;
	System.out.println(age);
	float weight = 69.5f;
	System.out.println(weight);
	double asd = 789.5;
	System.out.println(asd);
    char c2 = 'Z';
    System.out.println((int)c2);
    boolean aa = false;
    System.out.println(!aa);
    String s = new String("adsd");
    System.out.println(s);
    Random r = new Random();
    int r1 = r.nextInt(6)+1;
    int r2 = r.nextInt(6)+1; 
    int r3 = r.nextInt(6)+1;
    int r4 = r.nextInt(6)+1;
	}

}
