package com.app.fruits;

public class Apple extends Fruit {

	public Apple(String colour, double weight) {
		super("Apple", colour, weight);
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
