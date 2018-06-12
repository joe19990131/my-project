package com.java2.maze;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MazeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr;
		try {
			fr = new FileReader("maze.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String[] token = line.split(",");
			int col = Integer.parseInt(token[0]);
			int row = Integer.parseInt(token[1]);
			line = in.readLine();
			int trapCount = Integer.parseInt(line);
			Map mz = new Map(row,col, trapCount);
			mz.putTrap();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
