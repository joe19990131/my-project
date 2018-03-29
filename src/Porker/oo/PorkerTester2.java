package Porker.oo;
import java.util.*;
public class PorkerTester2 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Porker2 p2 = new Porker2();
		p2.porker();
		p2.shuffle();
		p2.show();
		//p2.deal();
		Scanner sc1 = new Scanner(System.in);
		String q = sc1.nextLine();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p2.sort();
		p2.show();
	}

}
