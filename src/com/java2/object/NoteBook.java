package com.java2.object;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class NoteBook {
	Scanner sc1 = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoteBook n = new NoteBook();
		n.enterData();
	}

	public void enterData() {
		while (true) {
			try {
				FileOutputStream fos = new FileOutputStream("note.txt", true);
				PrintStream out = new PrintStream(fos);
				String text = sc1.nextLine();
				out.println(text);
				out.flush();
				out.close();

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Err:File not found");
			}
		}

	}
}
