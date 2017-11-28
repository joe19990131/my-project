//{51,23,6,65,15}由小到大排

package Exercise.com;

public class Dice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = {51,23,6,65,15};
		for(int i = 0;i<n.length;i++)
		{for(int j=0;j<n.length;j++)
			if(n[j]>n[j+1])
			{int tmp = j;
			j=i;
			i=tmp;
			}
			else{continue;}
			System.out.print(n[i]+" ");
		}
			
		
	}

}
