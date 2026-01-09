package p2;

public class Tester3 {
	public static void main(String[] args) {
		Printable[] printables = { new NetworkPrinter(), new FilePrinter(), new ConsolePrinter() };// 4 -- array holding
		// i/f type of ref
		for (Printable p : printables) {
			p.print("some mesg!!!");
			if (p instanceof NetworkPrinter)
				((NetworkPrinter) p).encryptData("msg to be coded ");
			else
				System.out.println("can not encrypt the data !!!!!");
		}
	}
}