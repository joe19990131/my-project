package ECHO.com;

import java.util.*;

public class A1b2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean x = new Boolean(true);
		String s = "9873";
		int a = 0;
		int b = 0;

		int l = s.length();
		while (x) {
			Scanner sc1 = new Scanner(System.in);
			String n = sc1.nextLine();
			for (int i = 0; i < l; i++) {
				for (int j = 0; j < l; j++) {
					char c2 = n.charAt(i);
					char c1 = s.charAt(j);
					if (i == j && c1 == c2) {
						a++;
					}
					if (i != j && c1 == c2) {
						b++;

					}
				}
			}
			System.out.println(a + "a" + b + "b");

			if (a == 4 && b == 0) {
				x = false;
			}

			a = 0;
			b = 0;
		}

	}

}
