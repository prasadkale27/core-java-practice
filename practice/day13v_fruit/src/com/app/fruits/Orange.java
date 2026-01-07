package com.app.fruits;

public class Orange extends Fruit {
	public Orange(String colour, double weight) {
		super("Orange", colour, weight);
	}

//override the common functionality inherited from the super class 
	@Override
	public String taste() {
		return "sweet";
	}

// add sub class specific func 
	public void pulp() {
		System.out.println(getName() + "Can be pulped !");
	}
}
