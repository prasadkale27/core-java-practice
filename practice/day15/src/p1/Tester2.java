package p1;

import static p1.Printable.TEST_DATA;


public class Tester2 {

	public static void main(String[] args) {
		ConsolePrinter printer = new ConsolePrinter();
		printer.print("Hello how are you doing ");
		//can tester access i/f constant ? 
		System.out.println("i/f constants 	"+ Printable.TEST_DATA);
	
	
	
	}

}
