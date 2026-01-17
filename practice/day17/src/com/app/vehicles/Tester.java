package com.app.vehicles;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st vehicle details  : regNo,  color,  price");
		Vehicle vehicle1 = new Vehicle(sc.nextInt(), sc.next(), sc.nextDouble());
		System.out.println("Enter 2nd  vehicle details  : regNo,  color,  price");
		Vehicle vehicle2 = new Vehicle(sc.nextInt(), sc.next(), sc.nextDouble());
		// test equality of two vehicles
		System.out.println(vehicle1.equals(vehicle2));// using inherited form of equals :based upon ref equality
		System.out.println(vehicle1.equals(sc));
		Vehicle vehicle3=vehicle1;
		System.out.println(vehicle1.equals(vehicle3));
		
		
		sc.close();
	}
}
