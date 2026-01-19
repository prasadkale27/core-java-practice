package tester;

import com.app.students.Student;

public class TestStudentEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object s1 = new Student(101, "react", "Prasad", "kale", 90);
		Object s2 = new Student(101, "angular", "Prasad", "kale", 90);
		System.out.println(s1.equals(s2));
		// Object s1=new Student(101 ,"react", "Prasad", "kale" , 90); jvm goes by type
		// of object so student equal method call

	}

}
