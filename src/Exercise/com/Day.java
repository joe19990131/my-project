package Exercise.com;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		int i = sc1.nextInt();
		int n[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int a = 0;a<n.length;a++)
		{if(i <=n[a] )
			{System.out.println(a+1 + "/"+i);
				break;}
				else{i=i-n[a];}
		}
		
	}
	

}

