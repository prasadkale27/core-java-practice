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
		System.out.println(vehicle1.hashCode()+""+vehicle2.hashCode());
		System.out.println(vehicle1==vehicle2);//false check diffrent object
		System.out.println(vehicle1.equals(sc));
		Vehicle vehicle3=vehicle1;//copy of references  and it going to check the reference equality
		System.out.println("copy of ref ");
		System.out.println(vehicle1.equals(vehicle3));//same object pointing and its copy of ref true
		
		
		
		sc.close();
	}
}
