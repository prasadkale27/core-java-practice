package tester;

public class TestFinally3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("1");
		try {
			testMe();
			System.out.println("back in main");//exception is still raised and exception is not service 
		} catch (Exception e) {
			System.out.println("in main's catch-all " + e);// not enter in that block becusae there is no exception
		} finally {
			System.out.println("in main's finally");
		}
		System.out.println("main over..");
	}

//one static method directly call another static method 
	// nested try block
	// inner in testMe();
	// outer in the main method
	private static void testMe() throws InterruptedException {
		try {
			System.out.println("in meth's try");
			String[] ss = { "aa", "bb" };
			
			//there is two string object and one is array holder so three object is created 
			//
			// array of string type of ref
			Thread.sleep(1000);
			//this is delay of one sec
			/// javac forces to handled the checked exception
			// which are the two differ way to satisfy the compiler
			// 1)try catch block
			// 2)throws - delegating the exceptioin handled to the caller
			// testMe() delegating exception handled to the caller and the caller is the
			// main method
			// who is the caller of testMe() is the main method
			System.out.println(ss[1]);//AOB 
			boolean flag = true;
			if (flag)
				return;
			System.out.println("end of try");
		} finally {
			System.out.println("in meth's finally");
		}
	}
}
//Here’s the full transcribed text from the latest image you uploaded:
//
//---
//
//**3.** `try { ... } catch (NPE e) {} catch (AE e) {} catch (Exception e) { catch-all }`
//
//**3.5** `try { ... } catch (NPE | AOB e) { ... } catch (Exception e) { catch-all }`
//
//---
//
//**4. `throws` syntax —**  
//- Method declaration `throws` comma-separated list of exception classes.
//
//**Examples from Java API:**  
//- `Integer` class API:  
//  `public static int parseInt(String s) throws NumberFormatException`  
//- `Thread` class API:  
//  `public static void sleep(long ms) throws InterruptedException`  
//- `FileReader` API:  
//  `public FileReader(String fileName) throws FileNotFoundException`
//
//---
//
//**`throws` — keyword meant for `javac`**  
//- **Meaning** — Method *may* raise specified exception.  
//- Current method is **not** handling it, but its **caller should handle**.  
//- **Mandatory** — only in case of **unhandled** (no try-catch) **checked exceptions** (not extended from `RuntimeException`).  
//- **Use case** — used in **delegating** the exception to caller.
//
//---
//
//**4.5 Throwable class API**  
//1. `public String toString()` — returns name of exception class & reason (detailed error message)
//
//---
//
//Let me know if you’d like this turned into a cheat sheet, quiz, or code examples to practice.

