package com.app.tester;

import java.util.Scanner;

import com.app.core.Box;

/*
 * 
 * Ask user(client) , how many boxes to make ?
 * Accept Box dimensions.
Store these details suitably.
 * 
 */

public class TestBoxArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many boxes pls ? ");
		// create array type of ref
		Box[] boxes;// boxes : local variable (mem allocated in stack : no of bytes as per jvm
					// specification un initialized )
		// create Box [] : array type of object , that can hold Box type of refs.

		boxes = new Box[sc.nextInt()];// 4 , [L com.app.Box class : Box [] class loaded in method area -->
		// aray object created in heap //CP , length = 4 , 4 nulls
		System.out.println("Name of the Box[] class  loaded in the " + boxes.getClass());
		// Display default array contents : for each
		System.out.println("def array contents ");
		for (Box b : boxes)
			System.out.println(b);
		//Accept Box dimension from the user --> create box class instance --> add the ref of
		//this Box object into the array 
		for(int i=0;i<boxes.length;i++)
		{
			System.out.println("Enter Box dims -  w d h ");
			boxes[i]=new Box(sc.nextDouble() , sc.nextDouble() , sc.nextDouble());
			
		}
		//Display using singlr for-each loop , box dims n volume 
		for(Box b : boxes )
		{
			System.out.println(b.getBoxDimensions());
			System.out.println("volume" );
		}

		sc.close();

	}

}
