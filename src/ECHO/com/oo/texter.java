package ECHO.com.oo;

public class texter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student("joe",99,67,89);
		//stu.chinese = 23;
		//stu.english = 12;
		//stu.math = 45;
		
		System.out.println(stu.chinese);
		stu.print();
		int avg = stu.getAverange();
		System.out.println(stu.name + ":" + avg);
		System.out.println(avg);
	}

}
