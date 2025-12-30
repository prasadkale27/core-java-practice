package com.app.core;

public class Student extends Person {

	private int gradYear;
	private String course;
	private double fees;
	private int marks;
	// add a parameterized constructor to init complete state of a Student

	public Student(String firstName, String lastName, int gradYear, String course, double fees, int marks) {
		super(firstName, lastName);
		System.out.println("in student ctor ");
		this.gradYear = gradYear;
		this.course = course;
		this.fees = fees;
		this.marks = marks;

	}

// modified the inherited method toString 
	public String toString() {
		return "Student " + super.toString() + " graduated in " + gradYear + " course: " + course + " fees " + fees
				+ " marks " + marks;
	}

}
