package com.java2.maze;

public class Player {
	int hp;
	int pos;

	public Player() {
	}

	public Player(int hp, int pos) {
		super();
		this.hp = hp;
		this.pos = pos;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

}
