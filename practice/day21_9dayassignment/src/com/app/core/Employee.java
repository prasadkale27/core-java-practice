package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private int empId;
	private String firstName;
	private String lastName;
	private String email;
	private String deptId;
	private Date joinDate;
	private double salary;

	// SDF for parsing (String --> Date) and formatting (Date --> String)
	public static SimpleDateFormat sdf;

	// Static initializer block
	static {
		sdf = new SimpleDateFormat("dd/MM/yyyy");
	}

	// Constructor
	public Employee(int empId, String firstName, String lastName,
			String email, String deptId, Date joinDate, double salary) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.deptId = deptId;
		this.joinDate = joinDate;
		this.salary = salary;
	}

	// Override toString()
	@Override
	public String toString() {
		return "Employee [empId=" + empId 
				+ ", firstName=" + firstName 
				+ ", lastName=" + lastName 
				+ ", email=" + email
				+ ", deptId=" + deptId 
				+ ", joinDate=" + sdf.format(joinDate) 
				+ ", salary=" + salary + "]";
	}

	// Override equals (PK = empId)
	@Override
	public boolean equals(Object o) {
		System.out.println("In emp equals");
		if (o instanceof Employee)
			return this.empId == ((Employee) o).empId;
		return false;
	}
}
