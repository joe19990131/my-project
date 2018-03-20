package ABgame.oo;

import java.util.*;

public class ABTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "9873";
		Scanner sc1 = new Scanner(System.in);
		String num = sc1.nextLine();
		 int r = 0;
	
		while (r != 40) {
			System.out.println("Please enter your guess:");
			ABNumber n = new ABNumber(num);
			r = n.validate(s);
		}

	}
}
