package tester;

public class TestCheckedException {

	public static void main(String[] args) {

		System.out.println("before");
		try {
			Thread.sleep(5000);// InterruptedException -- checked exc -- javac forces handling of the checked
			// exception
		} catch (InterruptedException e) {
			System.out.println("Error occurred...");
		}

		System.out.println("after");

	}

}
