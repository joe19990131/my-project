package student;

public class GraduateStudent extends Student{

	public GraduateStudent(int math,int chinese,int english) { 
		// TODO 自動產生的建構子 Stub
		
		super(math, chinese, english);
		super.math = math;
		super.english = english;
		super.chinese = chinese;}
		@Override
		public void printScore() {
			System.out.println("good");
		}
		
		//super的意思和this相近？
		//super繼承父類別的屬性並可改寫
	
	}


