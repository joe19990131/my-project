package ECHO.com.oo;

public class GraduateStudent extends Student {
	int thisis;
	public GraduateStudent() {
		// TODO Auto-generated constructor stub
	super();
	System.out.println("123");
	
	}
	@Override
	public void print() {
		System.out.println(pass);
		System.out.println(" " + math + " " + chinese+thisis);
	}
	
}
//執行順序:先父再子