package ABgame.oo;

import java.util.*;

public class ABTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "9873";
		
		int r = 0;
		int result = 0;
		while (r != 40) {
			System.out.print("Please enter your guess:");
			Scanner sc1 = new Scanner(System.in);
			ABNumber n = new ABNumber(sc1.nextLine());
			result = n.validate(s);
			System.out.println((result / 10) + "A" + (result % 10) + "B");
		}

	}
}
