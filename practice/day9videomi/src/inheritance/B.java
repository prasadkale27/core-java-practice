package inheritance;

public class B extends A {

	B() {
		//super();//javac implicitly add super ()=>a call to imediate super's class's ctor

		System.out.println("2");
	}

}
