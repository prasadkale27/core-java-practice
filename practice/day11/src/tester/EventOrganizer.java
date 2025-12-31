package tester;

import java.util.Scanner;

import com.app.core.Faculty;
import com.app.core.Person;
import com.app.core.Student;

public class EventOrganizer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  max no of participants ");// 20
		Person[] participants = new Person[sc.nextInt()];// array of ref
		boolean exit = false;
		int counter = 0;
		while (!exit) {
			System.out
					.println("Option 1.Register Student  2. Register faculty 3.Display details of all the participents "
							+ "4 Display specific participate details 5.Invoke subclass specific functionality 100 Exit");
			System.out.println("Choose Option ");
			switch (sc.nextInt()) {
			case 1:// student registration
				if (counter < participants.length) {
					System.out.println("Enter student details -firstName , lastName ,gradYear , course ,fees , marks ");
					// upcasting
					participants[counter++] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(),
							sc.nextDouble(), sc.nextInt());
				} else
					System.out.println("Event full!!!");
				break;
			case 2:// faculty registration
				if (counter < participants.length) {
					System.out.println("Enter faculty details - first name , lastname , yrofex , sme");
					participants[counter++] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());
				} else
					System.out.println("Event full!!!!");
				break;
			case 3:// display details of all participants
				for (Person p : participants)// p=participants[0],.....p=participants[participants.length-1]
					if (p != null)// null checking
						System.out.println(p);// type of ref : Person , type of Object :student or faculty
				// {f1,f2,s1,s2,null,null...}
				break;
			case 4:
				System.out.println("Enter seat no");

				int index = sc.nextInt() - 1;
				if (index >= 0 && index < counter)
					System.out.println(participants[index]);
				else
					System.out.println("invslid seat no");
				break;
			case 5:
				System.out.println("Enter the seat no ");
				index = sc.nextInt() - 1;
				if (index >= 0 && index < counter) {
					Person p = participants[index];
				//	p.study();// javac resolves by type of the reference p : Person , why javac err : since
								// there is no study method define in Person class
					// downcasting :climbing down inheritance hierarchy (not done implicitly by the
					// javac )
					((Student)p).study();
					
					
				} else
					System.out.println("invslid seat no");
				break;
			case 100:
				exit = true;
				break;

			}
		}
		sc.close();

	}

}
