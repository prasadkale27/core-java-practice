package string;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb1 = new StringBuilder("hello");
		System.out.println("length" + sb1.length() + "  capa " + sb1.capacity());// 5 capacity =16+5=21
		sb1.append(true);
		sb1.append(123.45);
		StringBuilder sb2 = sb1.append(34567);
		
		System.out.println(sb1);// sb1.toString , concateneted contents
		// hellotrue123.4534567
		System.out.println(sb2);
		System.out.println(sb1==sb2);//true
		sb1.insert(2, 999999);
		System.out.println(sb2);
		
		
	}

}
