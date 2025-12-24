package test_static;

import java.util.Arrays;

public class Test1 {

	public static int testData;
	private int id;

	static {
		System.out.println("1");
		testData = 100;
	}
	static {
		System.out.println("2");
		testData++;
		test();
	}
	Test1(int id){
		this.id=id;
	}
	
	//non static init block or instance initializer block 
	{
		System.out.println("in non static (instance ) initializer  block ");//not called becuase zero object created
	}

	public static void main(String[] args) {

//		int testData = 1234;
//		System.out.println("local var  " + testData);
//		System.out.println("static var " + Test1.testData);
		System.out.println("int main static var " + testData);// if i comment a testData local variable then acces it directly
		Test1 ref1=new Test1(10);
		Test1 ref2=new Test1(20);
	}

	private static void test() {
		System.out.println("in test :  static method "+ testData);
		testData++;
	}
}
