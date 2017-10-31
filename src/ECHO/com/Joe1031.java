package ECHO.com;
import java.util.*;
public class Joe1031 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     
		System.out.println("Please imput a numper");
      Scanner scanner1  = new Scanner(System.in);
		String line = scanner1.nextLine();
		int n =Integer.parseInt(line);
      if (n % 2 ==1)
      {
    	 System.out.println("是奇數");
      }
      else
      {
    	  System.out.println("是偶數");
      }
	}

}
