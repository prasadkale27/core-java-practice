package com.app.fruits;

public class Fruit {
	private String name;
	private String colour;
	private double weight;

	public Fruit(String name, String colour, double weight) {
		super();
		this.name = name;
		this.colour = colour;
		this.weight = weight;
	}

	// common functionality addeed in the common super class
	// since its overriding Object's toString : added @Override annotation
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", colour=" + colour + ", weight=" + weight + "]";
	}
	// common functionality addeed in the common super class : all fruits have taste

	public String taste() {
		return "no specific taste";
	}

	// add a getter to access fruit's name
	public String getName() {
		return name;
	}

	// add a getter to access fruit's name

}
