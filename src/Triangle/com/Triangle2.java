package Triangle.com;
import java.util.*;
public class Triangle2 
{

	public static void main(String[] args) 
	{
		// TODO ?‡ª??•ç”¢??Ÿç?„æ–¹æ³? Stub
		System.out.println("è«‹è¼¸?…¥??‚ç«¯å¤§å??");
		System.out.println("è«‹è¼¸?…¥åº•ç«¯å¤§å??");
		System.out.println("æ³¨æ?ï?å?•ç«¯?•¸å­—é?å¤§æ–¼ç«¯æ•¸å­?");
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		int j = sc2.nextInt();
		int i = sc1.nextInt();
		for(int z = j;z<=i;z++)
			{for(int a1=1;a1<=z;a1++)
				{for(int b = i-1;b>=a1;b--)
					System.out.print(" ");
					for(int c = 1;c<=2*a1-1;c++)
						System.out.print("*");
					System.out.println();
				}
			}
		
		//æ¨¹å¹¹
		for(int t = 1;t<=3;t++)
		{for(int m = 1;m<=i-2;m++)
			System.out.print(" ");
		System.out.println("***");}
	}

}
