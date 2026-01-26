package string;

public class Test3 {

	public static void main(String[] args) {
		// literal vs non literal string
		String s1 = "hello";
		String s2 = new String(s1);
		String s3 = "hello";
		String s4 = "Hello";
		System.out.println(s1 == s2);// false-ref equality
		System.out.println(s1.equals(s2));// true - both hold same so its true
		System.out.println(s1 == s3);// false
		System.out.println(s1.equals(s3));// true - content are the same
		System.out.println(s1 == s4);// false
		System.out.println(s1.equals(s4));// false - content equality - diff one is lowercase and another is upper case
		System.out.println(s1.equalsIgnoreCase(s4));// false

	}

}
//both are the String type object 
//literal string or non literal string object is always memory allocated  in heap but in addition 
//literal string ref is added in literal pool
//pooling is for sharing resources 
//eg -- bus is example of pool , pool is equivlent to sharing resources 
//jvm checks any ref contain  uppercase Hello
//internally its called equal method - case sensitive 
//non literal object is marked for garbage collector 
//jvm terminate at that time String class is unloaded and string pool is created when at that time string class loaded that time constant string pool will be terminated
//java application terminate ,  jvm terminate  - string class unloaded due to that 

