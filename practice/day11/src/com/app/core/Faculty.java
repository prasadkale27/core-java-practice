package com.app.core;

public class Faculty extends Person {

	private int yrsOfExperience;
	private String sme;

	public Faculty(String fn, String ln, int yrs, String sme) {
		super(fn, ln);// explicitly invoking immediate super cls's matching constructor
		System.out.println("in faculty constructor ");
		yrsOfExperience = yrs;
		this.sme = sme;

	}

	public String toString() {
		return " faculty " + super.toString() + " experience " + yrsOfExperience + " sme " + sme;
	}
	
	//add new functionality
	public void teach()
	{
		System.out.println(getFirstName()+"expert in " + sme );
	}
	
	
}
