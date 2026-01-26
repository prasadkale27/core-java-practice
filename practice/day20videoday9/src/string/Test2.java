package string;

public class Test2 {
	public static void main(String[] args) {
		// == vs equals method
		// reference equality vs equal method
		String s1 = new String("testing12345");
		String s2 = new String("testing12345");
		System.out.println(s1 == s2);// ref equality : false
		System.out.println(s1.equals(s2));// equals : inherited from java.lang.object -- has String class oerridden it
			//yes - FOR (MODIFICATION - METHOD OERRIDING IS ACHIVE RUNTIME POLYMORPHISM )
			//For replacing ref equality by content  equality and content of the String is (char sequence) : true 
	}
}
