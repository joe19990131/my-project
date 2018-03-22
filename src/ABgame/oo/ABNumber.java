package ABgame.oo;

import java.security.PublicKey;

public class ABNumber {
	String num;

	public ABNumber(String num) {
		this.num = num;
	}

	public int validate(String s) {
		int result = 0;
		int l = s.length();
		
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				char c = num.charAt(i);
				if (c == s.charAt(j)) {
					
				
				if (i != j) {
					result+=10;

				}else{
					result+=1;
				}}
			}
		}return result;
		}
			
	}

