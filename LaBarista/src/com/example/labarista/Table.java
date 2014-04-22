package com.example.labarista;

public class Table {
	public int people;
	public boolean taken;
	
	public Table(int people) {
		taken = false;
		this.people = 0;
	}
	
	public void takeTable(int people){
		this.people = people;
		taken = true;
	}
	
	public void leaveTable() {
		this.people = 0;
		taken = false;
	}
}

