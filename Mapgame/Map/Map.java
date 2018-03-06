package Map;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Map extends JFrame {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		//建立視窗
		JFrame frame1 = new JFrame("game");
		TestButton b1 =  new TestButton();
		frame1.add(b1);
		//設定視窗大小
		frame1.setSize(500, 300);
		frame1.setLocation(0,0);
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
	}

}
