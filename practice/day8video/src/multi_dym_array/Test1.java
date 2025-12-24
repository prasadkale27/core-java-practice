package multi_dym_array;

import java.util.Arrays;

public class Test1 {

	public static int testData = 4567;

	public static void main(String[] args) {

		int testData = 1234;
		System.out.println("local var  " + testData);
//		System.out.println("static var " + Test1.testData);
		System.out.println("static var " + testData);// if i comment a testData local variable then acces it directly

		double[][] data = new double[3][4];
		int value = 100;

		// display array contents : for each
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[i].length; j++)
				data[i][j] = value++;
//				System.out.println(data[i][j]);
		// easier way to print multidimensional array contents ? yes

		System.out.println(Arrays.deepToString(data));

		Test1 t1 = new Test1();
		t1.show();
	}

	private void show() {
		System.out.println("in show : non static method ");
		test();// non static method called static method directly

	}

	private static void test() {
		System.out.println("in test :  static method ");
	}
}
