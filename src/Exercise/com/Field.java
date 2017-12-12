package Exercise.com;

public class Field {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int m[][] = new int[5][3];
		 m[0][0] = 0;
		 m[0][1] = 1;  
		 m[0][2] = 2;
		 m[1][0] = 3;
		 m[1][1] = 4;
		 m[1][2] = 5;
		 m[2][0] = 6;
		 m[2][1] = 7;
		 m[2][2] = 8;
		 m[3][0] = 9;
		 m[3][1] = 10;
		 m[3][2] = 11;
		 m[4][0] = 12;
		 m[4][1] = 13;
		 m[4][2] = 14;
		for(int j =0;j<=4;j++)
		{for(int i = 0;i<=2;i++)
			{int a = (m[j][0] + m[j][1] + m[j][2])/3;
			if(i<2)
				{System.out.print(m[j][i]+" ");}
			else{System.out.println(m[j][i]+" " + a );
			
			}
			
			
			}
		}
		
		
		
		
		
		
		
		
	}

}
