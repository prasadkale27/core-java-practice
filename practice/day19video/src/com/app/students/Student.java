package com.app.students;

public class Student {
	private int rollNo;
	private String subject;
	private String firstName;
	private String lastName;
	private double gpa;

	public Student(int rollNo, String subject, String firstName, String lastName, double gpa) {
		super();
		this.rollNo = rollNo;
		this.subject = subject;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", subject=" + subject + ", firstName=" + firstName + ", lastName="
				+ lastName + ", gpa=" + gpa + "]";
	}

	// replace ref equality by content (rollNo n subject ) equality
	@Override
	public boolean equals(Object o) {

		System.out.println("in student equals ");
		if (o instanceof Student) {

			Student s = (Student) o;
			return this.rollNo == s.rollNo && this.subject.equals(s.subject);
			// content of
			// data type of subject = is reference data type
			// which type of reference - class type of ref , array type of ref, interface
			// type of ref - (class type ref )
			// are you cheking -- ref equality of string or content equality of string
			// data type of subject is string and string class overriden equal
			//checking of indirect referencing 
		}
		return false;

	}
}