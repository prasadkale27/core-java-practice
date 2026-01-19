package tester;

public class TestExceHandling {
	public static void main(String[] args) {
		try {
		int a=100;
		int b=0;
		System.out.println("result " + (a/b));//java.lang.ArithmaticException
		System.out.println("end of try  ");
		}catch(NullPointerException e) {
			System.out.println("exception occured ");
		}
		System.out.println("main over...");
	}

}
//Here’s the full transcribed text from the image you uploaded:
//
//---
//
//**(stack trace)**
//
//**MATCHING exc handler exists — YES (catch)**  
//→ try block aborts  
//→ JVM execs catch block  
//→ code continues.
//
//---
//
//**Inheritance hierarchy of exc handling classes**  
//- `java.lang.Throwable` — super class  
//  - `java.lang.Error` — fatal (e.g., IOError, StackOverflow…)  
//  - `java.lang.Exception`  
//    - `java.lang.RuntimeException` — unchecked exc
//
//---
//
//**try-catch keywords**  
//**checked vs unchecked exceptions**
//
//**Who doesn't differentiate between checked vs unchecked exceptions?**  
//→ JVM (JVM aborts the code in case of unhandled — no try-catch — checked as well as unchecked exceptions)
//
//**Who differentiates?**  
//→ `javac`  
//→ `javac` forces handling of the checked exceptions, otherwise `javac` error
//
//---
//
//
