package ECHO.com;
import java.util.*;
public class Triangle2 
{

	public static void main(String[] args) 
	{
		// TODO 自動產生的方法 Stub
		System.out.println("請輸入頂端大小");
		System.out.println("請輸入底端大小");
		System.out.println("注意！底端數字需大於端數字");
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
		
		//樹幹
		for(int t = 1;t<=3;t++)
		{for(int m = 1;m<=i-2;m++)
			System.out.print(" ");
		System.out.println("***");}
	}

}
