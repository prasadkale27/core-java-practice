package p2;

public class MyImplClass implements Printable , Computable {
	@Override
	public void print(String mesg ) {
		System.out.println("print a msg" + mesg	);
	}

	@Override
	public double compute(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}
	
	// add new method
	public void test() {
		System.out.println("in test");
	}

}
