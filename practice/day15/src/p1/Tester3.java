package p1;

public class Tester3 {
	public static void main(String[] args) {
		ConsolePrinter printer = new ConsolePrinter();// direct ref
		printer.print("Hello how are you doing ");
		Printable reference;// ref type var --i/f type of ref or jargan means technical terms
		// can you create of references - > no
		reference = printer;// up casting i/f ref var --> any of it's imple. class instance.:indirect ref 
		reference.print("new mesg!!!!");// jvm invokes :@run time print method on which instance ---ConsolePrinter

	}

}
