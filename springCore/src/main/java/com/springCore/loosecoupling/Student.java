package com.springCore.loosecoupling;

public class Student {
	private int id;
	private Cheat cheat;

	@Override
	public String toString() {
		return "Student [id=" + id + ", cheat=" + cheat + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cheat getCheat() {
		return cheat;
	}

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}
	public void cheat() {
		cheat.cheating();
	}

}
