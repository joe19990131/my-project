package ECHO.com;
import java.util.*;
public class Number23 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		int i = sc1.nextInt();
		for(int a=1;a<=i;a++)
			{if(a%3 == 0){continue;}
				System.out.print(a + " ");
			}
		
	//while
		while(true)
		{if(i%3==0){i++;
		continue;}
		System.out.print(i + " ");
		i++;
			
			
		}
		
		
		
	}

}
