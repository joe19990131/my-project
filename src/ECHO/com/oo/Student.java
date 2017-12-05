package ECHO.com.oo;

public class Student {
int english;
int math;
int chinese;
String name;
public Student(String n , int e , int m , int c)
{english = e;
math = e;
chinese = c;
name = n;
	
	
}
public void print(){System.out.println(english +" " + math +" "+ chinese);}
public int getAverange(){return((english + math + chinese)/3);}}
