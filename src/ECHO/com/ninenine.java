package ECHO.com;

public class ninenine 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       
        
		for(int i=1;i<=9;i ++)
        {
			for (int n=2;n<=9;n++)
			if(i*n<10)
        	{System.out.print(n+" x "+ i +" =  " + (i*n) + "\t");}
        else {System.out.print(n+" x "+ i +" = " + (i*n) + "\t");}
			System.out.println();
        }
		
	}

}
