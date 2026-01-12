package p2;

public class Tester {
	public static void main(String[] args) {
		Printable printable = new MyImplClass();//upcasting
		printable.print("Some mesg");
		Computable ref=new MyImplClass();
		System.out.println("result "+ref.compute(10, 20));
		
		
		
	}

}
