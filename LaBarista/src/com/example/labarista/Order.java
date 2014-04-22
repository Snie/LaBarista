package com.example.labarista;

import java.util.HashMap;
import java.util.List;

import android.net.ParseException;

import com.parse.FindCallback;
import com.parse.ParseObject;
import com.parse.ParseQuery;

public class Order {
	private HashMap<String, Float> drink;
	private HashMap<String, Float> first;
	private HashMap<String, Float> second;
	private HashMap<String, Float> appetizer;
	private HashMap<String, Float> dessert;
	private Float total;

	public Order() {
		drink = null;
		first = null;
		second = null;
		appetizer = null;
		dessert = null;
		total = 0f;
		
	}

	
	public void addDrink(String name){
		Float price = null;
		//get price from parse
		drink.put(name, price);
		total += price;
	}
	
	
	public void addFirst(String name){
		Float price = null;
		//get price from parse
		first.put(name, price);
		total += price;
	}
	
	
	public void addSecond(String name){
		Float price = null;
		//get price from parse
		second.put(name, price);
		total += price;
	}
	
	
	public void addAppetizer(String name){
		Float price = null;
		//get price from parse
		appetizer.put(name, price);
		total += price;
	}

	public void addDessert(String name){
		Float price = null;
		//get price from parse
		dessert.put(name, price);
		total += price;
	}
	
}
