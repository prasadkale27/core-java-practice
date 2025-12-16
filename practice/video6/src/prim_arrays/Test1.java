package prim_arrays;

import java.util.Scanner;

public class Test1 {
	
		public static void main(String[] args) {
			//create a scanner instance attached to std i/p
			Scanner sc=new Scanner(System.in);
			//print the name of the class loaded for above scanner object 
			System.out.println("Name of the class loaded for scanner object "    +    sc.getClass());
			System.out.println("Enter Size of The Array");//10
			
			//create a double [] of user specified size
			double [] data; //data : ref type of var (array type) -- mem allocated on : stack 
			//System.out.println(data);//javac err
			data=new double[sc.nextInt()];//array class is loaded in the method area (metaspace) : [D --> //
			//1 array object is created on the  heap 
			//display array data : for  loop
			
			System.out.println("Name of the class loaded for double []" +data.getClass());
			
			System.out.println("Default array contents via for loop");
			for(int i=0; i<data.length;i++)	
				System.out.println(data[i]);
			System.out.println("Default array contents via for-each loopor inhance for loop");
			for(double d: data )//
				System.out.println(d); 
			
			//Accept data from User(Scanner) & store it in the Array
			
			for(int i=0;i<data.length;i++)
			{
				System.out.println("Enter Data");
				data[i]=sc.nextDouble();
				
			}
			
			//Display array data using for each 
			System.out.println("Initiated array contents via for-each loopor inhance for loop");
			for(double d: data )//
				System.out.println(d);
			
			
			 
			
			
			
			
			
			//close scanner 
			sc.close();
			
		}

}
