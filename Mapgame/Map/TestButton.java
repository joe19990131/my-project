package Map;

import javax.swing.JFrame;
import javax.swing.JButton;

public class TestButton extends JFrame {
	public JButton jb1, jb2;

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		new TestButton();
	}

	public TestButton() {
		this.setTitle("");
		this.setSize(300, 100);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jb1 = new JButton("進入遊戲");
		this.add(jb1);
		this.setVisible(true);
	}
}
