package tester;

public class TestExceHandling {
	public static void main(String[] args) {
		try {
		int a=100;
		int b=10;
		System.out.println("result " + (a/b));//java.lang.ArithmaticException
		System.out.println("end of try  ");
		}catch(ArithmeticException e) {
			System.out.println("exception occured ");
		}
		System.out.println("main over...");
	}

}
