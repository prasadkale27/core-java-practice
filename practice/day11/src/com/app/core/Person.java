package com.app.core;
 
public class Person {
	
	private String firstName , lastName;

	public Person(String firstName, String lastName) {
		System.out.println("in person ctor ");
	//	super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//can person class modify (override ) inherited form of  toString method ?
	public String toString() {
		return firstName + " " + lastName;

	}
	//add a getter for firstName of the person 
//	public String getFirstName()
//	{
//		return this.firstName;
//	}

	public String getFirstName() {
		return firstName;
	}
	
}
