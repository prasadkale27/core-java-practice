package com.app.core;

public class Person {
	
	private String firstName , lastName;

	public Person(String firstName, String lastName) {
		System.out.println("in person ctor ");
	//	super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	

	
}
