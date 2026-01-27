package string;

public class Test4 {
			public static void main(String[] args) {
				//String class api -  means string class methods , constructors 
				String s1="Anish";
				String s2="Testing Strings API Here";
				System.out.println(s1.compareTo(s2));
				//invoker is s1 greater than argument 	
				//compareTo method is used for naturally sorting 
				//lexicographical ordering 
				//String class implemnts comparasion interface 
				//sorting algorithm and searching algorithm all are adding 
				//it is compare by case sensitive manner
				  //this is for sorting and comparison
				
				//Display 1st and last character of string
				System.out.println(" 1st char   "+   s2.charAt(0) +   "  last character  "    +   s2.charAt(s2.length()-1));
				//char at method of string class return 
				
				//print yes if s2 	contains "API" else print no
				System.out.println(s2.contains("API")?"YES":"NO");
			
				
				
				
				
				
				
				
				
				
			}
		
}
