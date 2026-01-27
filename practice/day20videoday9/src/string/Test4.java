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
				
				String s3=new  String("java Strings are easier than  in c++");
				System.out.println(s3.indexOf("Strings")+" "+s3.lastIndexOf("Strings"));// 5   5
				
				
				
				
				
				
				
				
				
				
			}
		
}
//Alright 👍 let’s crack **Regular Expression (Regex)** in a clean, interview-friendly way.
//
//---
//
//## 🔹 What is Regular Expression?
//
//A **Regular Expression (Regex)** is a **pattern** used to **search, match, or replace text**.
//
//👉 In Java, regex is mainly used for:
//
//* Validation ✅
//* Searching 🔍
//* Splitting ✂️
//* Replacing 🔁
//
//---
//
//## 🔹 Regex in Java (Important Classes)
//
//```java
//import java.util.regex.*;
//```
//
//| Class     | Purpose                   |
//| --------- | ------------------------- |
//| `Pattern` | Compiles regex            |
//| `Matcher` | Matches pattern with text |
//
//---
//
//## 🔹 Simple Examples
//
//### 1️⃣ Check if String contains only letters
//
//```java
//String s = "Java";
//
//System.out.println(s.matches("[A-Za-z]+")); // true
//```
//
//---
//
//### 2️⃣ Mobile number validation (India 🇮🇳)
//
//```java
//String mobile = "9876543210";
//
//System.out.println(mobile.matches("[6-9][0-9]{9}")); // true
//```
//
//---
//
//### 3️⃣ Email validation
//
//```java
//String email = "omkar@gmail.com";
//
//System.out.println(email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z]+\\.[a-zA-Z]{2,}"));
//```
//
//---
//
//## 🔹 Common Regex Symbols (Must Know)
//
//| Symbol  | Meaning              | Example      |
//| ------- | -------------------- | ------------ |
//| `.`     | Any single character | `a.b`        |
//| `*`     | 0 or more            | `ab*`        |
//| `+`     | 1 or more            | `ab+`        |
//| `?`     | 0 or 1               | `ab?`        |
//| `^`     | Start of string      | `^Java`      |
//| `$`     | End of string        | `Java$`      |
//| `[]`    | Character set        | `[abc]`      |
//| `[^ ]`  | Not                  | `[^0-9]`     |
//| `{n}`   | Exactly n times      | `[0-9]{4}`   |
//| `{n,m}` | Range                | `[a-z]{2,5}` |
//
//---
//
//## 🔹 Predefined Character Classes
//
//| Regex | Meaning        |
//| ----- | -------------- |
//| `\\d` | digit `[0-9]`  |
//| `\\D` | non-digit      |
//| `\\w` | word char      |
//| `\\W` | non-word       |
//| `\\s` | whitespace     |
//| `\\S` | non-whitespace |
//
//---
//
//## 🔹 Pattern & Matcher Example
//
//```java
//Pattern p = Pattern.compile("Strings");
//Matcher m = p.matcher("java Strings are easier than Strings in c++");
//
//while (m.find()) {
//    System.out.println("Found at index: " + m.start());
//}
//```
//
//### Output
//
//```
//Found at index: 5
//Found at index: 29
//```
//
//---
//
//## 🔹 Difference: `contains()` vs `matches()`
//
//| Method       | Meaning                       |
//| ------------ | ----------------------------- |
//| `contains()` | Partial text search           |
//| `matches()`  | Whole string must match regex |
//
//---
//
//## 🔹 Interview Tip ⭐
//
//> `matches()` internally uses **regex**, but it matches the **entire string**, not a part.
//
//---
//
//If you want next:
//
//* Regex **for password validation** 🔐
//* Regex **MCQs for interview**
//* Regex explained in **Marathi** 🇮🇳
//* Regex vs `indexOf()`


