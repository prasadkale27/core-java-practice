package com.app.fruits;

public class Mango extends Fruit {

	public Mango(String colour, double weight) {
		super("Mango", colour, weight);
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
