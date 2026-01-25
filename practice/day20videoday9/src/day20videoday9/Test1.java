package day20videoday9;

public class Test1 {
	// testing immutabilty of the strings
	public static void main(String[] args) {
		String s1 = new String("Hello");
		s1.concat("hi");// hello
		String s2 = s1.concat("hi");// Hellohi
		System.out.println(s1);
		System.out.println(s2);
		s1 += "12345";// this 1st s1 object is no longer refering
		System.out.println(s1);// Hello12345

		s2.toUpperCase();// Hellohi string is not modify it is immutable so you can not change it
		// once you string object is created is read only
		System.out.println(s2);// Hellohi
		System.out.println(s2.toUpperCase());// just printed and then discarded.
		// upper case another object is created
		// HELLOHI
		System.out.println(s2);// Hellohi
		// replace all occurences of "l" in s2 by "t"
		String s3=s2.replace("l", "t");
		System.out.println(s2);//not replaced
		System.out.println(s3);//replaced

	}

	// strign internally holds character array
}

















//
//String Handling in Java
//java.lang.String
//• 	Immutable char sequence
//• 	String objects are immutable BUT String refs are mutable, unless declared final
//• 	Inherently thread safe
//• 	Has length only
//java.lang.StringBuilder
//• 	Mutable char sequence
//• 	Added later in API than StringBuffer
//• 	Has same API as StringBuffer
//• 	Has length & capacity attributes
//• 	Inherently thread unsafe
//java.lang.StringBuffer
//• 	Legacy class
//• 	Inherently thread safe
