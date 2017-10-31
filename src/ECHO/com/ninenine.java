package ECHO.com;

public class ninenine 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       
        
		for(int i=1;i<=9;i ++)
        {
			for (int n=2;n<=9;n++)
			if(i*2<10)
        	{
        		System.out.println(n+" x "+ i +" =  " + (i*2));
        	}
        else {System.out.println(n+" x "+ i +" = " + (i*2));}
        }
		System.out.println(" ");
	}

}
