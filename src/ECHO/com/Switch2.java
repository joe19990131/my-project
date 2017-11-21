package ECHO.com;
import java.util.*;
public class Switch2 {

	public static void main(String[] args) 
	{	// TODO Auto-generated method stub
		
		boolean a = true;
		while(a)
		{Scanner sc1 = new Scanner(System.in);
			int i = sc1.nextInt();
		
		switch(i)
		{case 8 : System.out.println("up");
			break;
		case 2 : System.out.println("down");
			break;
		case 4 : System.out.println("left");
			break;
		case 6 : System.out.println("right");
			break;
		case 5 : System.out.println("attack!!");
			break;
		}
		if(i == 0){a=false;}
		}	
			
		
	}

}
