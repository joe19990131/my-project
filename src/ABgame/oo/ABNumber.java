package ABgame.oo;

import java.security.PublicKey;

public class ABNumber {
	String num;
	int a = 0;
	int b = 0;
	String s;
	int l = s.length();

	public ABNumber(String num) {
		this.num = num;
	}

	public String validate(String s) {
		a=0;
		b=0;
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				char c2 = num.charAt(i);
				char c1 = s.charAt(j);
				if (i == j && c1 == c2) {
					a+=10;
				}
				if (i != j && c1 == c2) {
					b+=1;

				}
			}
		}return s;
			
	}
}
