package tester;

public class Tester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.out.println("in main");
		int c=100/10;//AE
		System.out.println("result " + c);
		String s="1234";
		System.out.println("parsed int value"+Integer.parseInt(s));//Number format exception 
		s=null;
		System.out.println("char at 0th index "+s.charAt(0));
		int [] data= {1,2,3,4,5};
		System.out.println("array data "+data[5]);
		System.out.println("end of try...");
		}catch(ArithmeticException e) {
			System.out.println("1");
		}catch(NumberFormatException e) {
			System.out.println("2");
		}
		System.out.println("main over ....");
	}

}
