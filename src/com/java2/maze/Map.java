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
	Player player;
	boolean a = true;
	Random r1 = new Random();
	HashSet<Integer> trap = new HashSet<>();

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
		List<Integer> token = new ArrayList<>();
		Iterator<Integer> it = trap.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}
		

	}

	public void start() {
		while (a) {
			Scanner sc1 = new Scanner(System.in);
			int i = sc1.nextInt();
			switch (i) {
			case 8:
				if (player.pos / col > 0) {
					player.pos = player.pos - 5;
				} else {
					player.hp = player.hp - 5;
				}
				System.out.println(player.pos + " " + player.hp);
				break;
			case 2:
				if (player.pos / col < 3) {
					player.pos = player.pos + 5;
				} else {
					player.hp = player.hp - 5;
				}
				System.out.println(player.pos + " " + player.hp);
				break;
			case 4:
				if (player.pos % col > 0) {
					player.pos = player.pos - 1;
				} else {
					player.hp = player.hp - 5;
				}
				System.out.println(player.pos + " " + player.hp);
				break;
			case 6:
				if (player.pos % col < 3) {
					player.pos = player.pos + 1;
				} else {
					player.hp = player.hp - 5;
				}
				System.out.println(player.pos + " " + player.hp);
				break;
			case 5:
				System.out.println("attack!!");
				break;

			}

			if (i == 0 || player.hp <= 0) {
				System.out.println("~~GAME OVER~~");
				a = false;
			}
		}

	}
}
