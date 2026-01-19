package tester;

public class TestCheckedException {

	public static void main(String[] args) {

		System.out.println("before");
//		try {
		Thread.sleep(5000);// InterruptedException -- checked exc -- javac forces handling of the checked
//		}catch(InterruptedException e) {
//			System.out.println("Error occurred...");
//			
//		}
		// exception
		System.out.println("after");

	}

}
