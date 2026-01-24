package tester;

import static utils.ValidationRules.validateSpped;

import java.util.Scanner;

public class TestCustomException {
	public static void main(String[] args)/* throws SpeedOutOfRangeException */ {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Speed ");
			// directly access is
			validateSpped(sc.nextInt());
			System.out.println("End of try");
		}catch(Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("End of main");

	}
 
}
// when static method call classs has to be loaded and static initializer block loading 
//jvm will provide default handler and abort the code 
// throwing the exception programmer
//handling the exception jvm 
//method level delegate but somewhere you handle 
//satisfy compiler actual handling 
//Ref is exception but object is SppedOutOfRange excecption 
//compile classes under bin 