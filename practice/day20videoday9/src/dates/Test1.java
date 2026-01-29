package dates;

import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		Date d1=new Date();//current date and time
		Date d2=new Date(0);//0 msec elapsed after epoch  
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d1.before(d2));//false
		System.out.println(d1.after(d2));//true
		
		

	}

}
