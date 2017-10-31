package ECHO.com;
import java.util.*;
public class Age 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(int i = 1;i<=999;i ++)
		{
			System.out.println("Please import your age");
	      Scanner scanner1  = new Scanner(System.in);
			String line = scanner1.nextLine();
			int n =Integer.parseInt(line);
			if( n <=12)
			{System.out.println("蘿莉與正太");}
			else if(n > 12 && n <=15)
			{System.out.println("國中生");}
			else if(n > 15 && n <=18)
			{System.out.println("高中生");}
			else if(n > 18 && n<=22)
			{System.out.println("大學生");}
			else if(n>22)
			{System.out.println("....");}
}}}
