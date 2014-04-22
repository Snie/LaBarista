package com.example.labarista;

public class Person {
	public Order order;
	
	public Person() {
		order = null;
	}
	
	public void newOrder(){
		order = new Order();
	}
	
}

