package tester;

public class TestCheckedException {

	public static void main(String[] args) throws InterruptedException {
		//jvm is the caller of main method and jvm is handled it 
		//throws keyword ans exception handling deligation 
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
