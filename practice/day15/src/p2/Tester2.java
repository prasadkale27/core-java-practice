package p2;

public class Tester2 {
	public static void main(String[] args) {
		Printable[] printables = { new FilePrinter(), new ConsolePrinter(), new NetworkPrinter() };// 4 -- array holding
		// i/f type of ref
		for (Printable p : printables)
			p.print("some mesg!!!");
	
		
		
		
	}
}
