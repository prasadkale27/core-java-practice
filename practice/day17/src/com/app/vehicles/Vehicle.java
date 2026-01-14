package com.app.vehicles;

public class Vehicle {
	private int regNo;
	private String color;
	private double price;

	public Vehicle(int regNo, String color, double price) {

		this.regNo = regNo;
		this.color = color;
		this.price = price;
	}

//override toString to replace hashcode version by actual state details 
	@Override
	public String toString() {
		return "Vehicle [regNo=" + regNo + ", color=" + color + ", price=" + price + "]";
	}

//override to equals to replace ref equality to contents equality 
	 @Override
	public boolean equals(Object o) {
		 System.out.println("in vehicle equals");
		 if(o instanceof Vehicle )
		return this.regNo==((Vehicle)o).regNo   ;
		 return false;
		
	}											
}
