

package game;

import java.util.Scanner;

public class main 
{
	public static void main(String[] args) 
	{
	Scanner scanner1	 = new Scanner(System.in);
	String string = scanner1.nextLine();
		if(scanner1.equals("scissors"))
	      {
		    System.out.println("stone");		
	       }
		else if(scanner1.equals("stone"))
		   {	
			System.out.println("paper");
		   }
		else System.out.println("scissors");}
	
}
class Class2
{}