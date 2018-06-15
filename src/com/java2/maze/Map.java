package com.java2.maze;

import java.awt.Transparency;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Map {
	int row;
	int col;
	int trapCount;

	int hp = 100;
	int pos = 0;

	// Player player;
	boolean a = true;
	Random r1 = new Random();
	HashSet<Integer> trap = new HashSet<>();
	List<Integer> token = new ArrayList<>();

	public Map() {
		super();
	}

	public Map(int row, int col, int trapCount) {
		super();
		this.row = row;
		this.col = col;
		this.trapCount = trapCount;
	}

	public Map(int row, int col) {
		super();
		this.row = row;
		this.col = col;
	}

	public void putTrap() {

		for (int i = 0; i < trapCount; i++) {
			trap.add(r1.nextInt(16));
		}
		while (trap.size() != trapCount) {
			trap.add(r1.nextInt(16));
		}

		Iterator<Integer> it = trap.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			token.add(i);
		}

	}
//縱向算法需調整
	public void start() {
		while (a) {
			Scanner sc1 = new Scanner(System.in);
			int i = sc1.nextInt();
			switch (i) {
			case 8:
				if ((pos / col) > 0) {
					pos = pos - 4;
				} else {
					hp = hp - 5;
				}
				System.out.println(pos + " " + hp);
				break;
			case 2:
				if ((pos / col) < 3) {
					pos = pos + 4;
				} else {
					hp = hp - 5;
				}
				System.out.println(pos + " " + hp);
				break;
			case 4:
				if ((pos % col) > 0) {
					pos = pos - 1;
				} else {
					hp = hp - 5;
				}
				System.out.println(pos + " " + hp);
				break;
			case 6:
				if ((pos % col) < 3) {
					pos = pos + 1;
				} else {
					hp = hp - 5;
				}
				System.out.println(pos + " " + hp);
				break;
			case 5:
				System.out.println("attack!!");
				break;

			}
			if (pos == token.get(0) || pos == token.get(1) || pos == token.get(2)
					|| pos == token.get(3) || pos == token.get(4)) {
				hp = hp - 5;
			}
			if (i == 0 || hp <= 0) {
				System.out.println("~~GAME OVER~~");
				a = false;
			}
		}

	}
}
