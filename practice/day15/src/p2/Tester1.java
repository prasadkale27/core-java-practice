package p2;

public class Tester1 {
	public static void main(String[] args) {

		Printable printer;// ref type var --i/f type of ref
		printer = new ConsolePrinter(); // upcasting
		printer.print("1st msg");// run time polymorphism (Dynamic method Dispatch) : instance of console printer

		printer = new FilePrinter();// run time polymorphism (Dynamic method Dispatch) : instance of file printer
		printer.print("2nd msg");

		printer = new NetworkPrinter();// run time polymorphism (Dynamic method Dispatch) : instance of Network printer
		printer.print("3nd msg");
	}

}
