package tester;

import com.app.core.Faculty;
import com.app.core.Person;
import com.app.core.Student;

public class Test1 {

	public static void main(String[] args) {
		// create student class instance
		// super class ref , super class object , sub class ref , sub class object
		// person : super class , Student sub class
		// direct referencing : sub class ref--> sub class object

		Student student1 = new Student("Rama", "Setu", 2020, "java", 123.12, 85);
		System.out.println(student1);// implicitly --student1.toStringStudent's toString is invoked
		Person p;// super class ref
		p = student1;// up casting : implicitly cast added by javac . (Student extends Person)
		// jvm invokes student toString
		System.out.println(p);// p.toString -- javac resolves method binding by type of the ref(Person)
		// but JVM resolves the method binding by type of the object its reffering to
		p = new Faculty("Rama", "Setu", 2, " java react NOSQL");// up casting
		System.out.println(p);// p.toString : JVM will invokes toString on faculty's object
		Object o;
		o = new Faculty("Rama", "Setu", 2, " roro react NOSQL");//up casting 
		System.out.println(o);
		o = new Student("Rama", "Setu", 2020, "java", 123.12, 85);//upcasting 
		System.out.println(o);
	}

}
//indirect referencing or direct referencing 
