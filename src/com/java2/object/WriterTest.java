package com.java2.object;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class WriterTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintStream out = new PrintStream("data.txt");
		out.print("joe\t1\t1000");
		out.flush();
		out.close();
	}

}

