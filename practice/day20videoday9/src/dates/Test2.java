package dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args)  throws ParseException{
		// TODO Auto-generated method stub
		
		try(Scanner sc=new Scanner (System.in))
		{
			//1.create instance of SDF -- DATE BASED pattern 
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			System.out.println("Enter join date of the 1st emp(dd-MM-yyyy)");
			Date joinDate1 = sdf.parse(sc.next());
			System.out.println("Enter join date of the 2nd emp(dd-MM-yyyy)");
			Date joinDate2 = sdf.parse(sc.next());
			//display which of them is the seniour emp?
			if(joinDate1.before(joinDate2))
				System.out.println("Emp 1 is senior ");
			else
				System.out.println("Emp 2 is Senior");
			System.out.println(" toStrng  of Date  "+joinDate1);//Date's classes to string is called = toString
			System.out.println("formatted date String" + sdf.format(joinDate1));
			 
			
			
			
			
			
		}
		
		
		

	}

}
