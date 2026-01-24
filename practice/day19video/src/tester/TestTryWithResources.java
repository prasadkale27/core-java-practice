package tester;

import java.util.Scanner;

public class TestTryWithResources {

	public static void main(String[] args) {

		// create scanner instance , using try-with-resources block
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your  complete name");
			//p
			System.out.println("Hello " + sc.nextLine());
			System.out.println("Enter a number ");
			System.out.println("You entered "+sc.nextDouble());
			System.out.println("end of try ....");
		} // jvm auto calls sc.close(); so you does not need to call a
			// scanner will close here
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("main over ");
	}
}

//case of un handled --no try-catch , chked as well as un-chked excs)
//
//who differentiates ? ---javac
//javac forces handling of the checked excs , o.w javac error
//
//throws
//finally
//try-with-resources
//custom exceptions
//objective : Accept speed of a vehicle from user (scanner) --highway
//min speed : 30
//max speed : 80
//speed < 30
//speed > 80
//In case of speed outside the range --Prog will have to detect the err --create instance of user defined
//exc class --explicitly throw custom exc to the code
//eg :
//```
//
//Let me know if you want this formatted for notes, slides, or documentation. I can also expand each point with examples or explanations if you'd like.
//
//
//Here’s the full transcribed text from both screenshots you shared, exactly as it appears:
//
//---
//
//### 📝 Screenshot 1: Exception Handling Overview
//
//```
//case of un handled --no try-catch , chked as well as un-chked excs)
//
//who differentiates ? ---javac
//javac forces handling of the checked excs , o.w javac error
//
//throws
//finally
//try-with-resources
//custom exceptions
//objective : Accept speed of a vehicle from user (scanner) --highway
//min speed : 30
//max speed : 80
//speed < 30
//speed > 80
//In case of speed outside the range --Prog will have to detect the err --create instance of user defined
//exc class --explicitly throw custom exc to the code
////eg :
////```
//
//---
//
//### 📝 Screenshot 2: Creating Custom Exceptions
//
//```
//FileReader fr = new FR(....))
//{
//    .........
//} catch - all
//
//Creating Custom Exc (User defined exception or application exc)
//Need:
//1. Validations: In case of validation failures: Prog will have to throw custom exc class instance
//2. B.L failures (eg: funds transfer: insufficient finds): Prog will have to throw custom exc class instance
//
//1. Create a pkgd public class which extends Throwable (not reco but legal)/Exception (recommended)/Error (not reco but legal)/RuntimeExc (not reco but legal)
//eg: public class MyException extends Exception {
//    public MyException(String mesg)
//    {
//        super(mesg);
//    }
//}
//public class MyException2 extends RunTimeException {....}
//```
//
//---
//
//Let me know if you'd like this formatted for notes, slides, or if you want me to expand any of the points with examples or explanations.
//
//
//
//





