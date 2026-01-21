package tester;

import java.util.Scanner;

public class TestTryWithResources {

	public static void main(String[] args) {

		// create scanner instance , using try-with-resources block
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your  complete name");
			System.out.println("Hello " + sc.nextLine());
		} // jvm auto calls sc.close(); so you does not need to call a
			// scanner will close here
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("main over ");
	}
}