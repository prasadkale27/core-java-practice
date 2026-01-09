package p2;

public class NetworkPrinter implements Printable {
//must implement , inherited abstract funnctionality 

	// implmentation is class specific
	@Override
	public void print(String mesg) {
		System.out.println("Sending " + mesg + "from client --> server ");

	}
	//Override 
	public void encryptData(String mesg)
	{
		System.out.println("Encrypting the mesg " + mesg);
		
	}

}
