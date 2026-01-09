package p2;

public  class FilePrinter implements Printable{
//must implement , inherited abstract funnctionality 
	
	@Override
	public void print (String mesg)
	{
		System.out.println("printing "+ mesg + "on the console");
		//implementation class can directly access i/f constants 
		
		System.out.println(TEST_DATA);
		
		
	}
	
	   
	
	
}
