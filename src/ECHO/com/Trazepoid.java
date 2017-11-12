package ECHO.com;
import java.util.*;
public class Trazepoid {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc1 = new Scanner(System.in);
		int i = sc1.nextInt();
		for(int a = 1;a<=i;a++)
		{for(int c = 1;c<=a;c++)
		{System.out.print("*");}
			for(int b = i-1;b>=a;b--)
			{System.out.print("#");}
			System.out.println();
		}
	}

}
