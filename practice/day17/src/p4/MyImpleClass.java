package p4;

public class MyImpleClass implements A, B {
	
		@Override 
		public void show() {
		System.out.println("in show ");
		
	}

		@Override
		public void show(String mesg) {
			// TODO Auto-generated method stub
			System.out.println("in show with mesg"+mesg);
		}
}
