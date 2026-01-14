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

		@Override
		public String toString() {
			return "Vehicle [regNo=" + regNo + ", color=" + color + ", price=" + price + "]";
		}
		
	
}
