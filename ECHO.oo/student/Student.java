package student;

public class Student {
	public int math;
	public int english;
	public int chinese;
	 public String name = "joe";
	public Student() {
		
	}
	public Student(int math,int english,int chinese) {
		this.math = math;
		this.english = english;
		this.chinese = chinese;
	}
	public Student(String name) {
		this.name = name;
	}
	public void printScore() {
		System.out.println(chinese + english + math);
	}
}
