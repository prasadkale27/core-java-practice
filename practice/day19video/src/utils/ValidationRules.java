package utils;

import custom_exception.SpeedOutOfRangeException;

public class ValidationRules {
//define speed limits 
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	// COMPILER GIVE YOU ERROR BECUASE IT IS NOT INITIALIZE DONT WORRY
	// Best way to initialize static data member is static block

	static {
		System.out.println("in static init block ");
		MIN_SPEED = 30;
		MAX_SPEED = 80;
		// your compiler stops cribing
		// static initializer block called exactly once during the class loading time
	}

	// add a static method for speed validation for checking speed
	// public becuase we access outside the pack
	// do not use boolean when you are exception handling
	// dont say or becuase i am generating diffrent mesg
	public static void validateSpped(int speed) throws SpeedOutOfRangeException{
		if (speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("You are driving too slow :causing jam  ");
		if(speed>MAX_SPEED)
			throw new SpeedOutOfRangeException("you are driving too fast : fatal");
		System.out.println("speed within range ");
			
			
			
			
		// here you are give error becuase compiler forces to handling checked
		// excception
		// when you extends from exception so when you extends from RuntimeException it
		// does not get error typically in core java we use a checked exception mostly
		// in core java we typically deal with cheked exception
		//there is two option two satisfy compiler 1)throws 2)try catch 
		//if you want handlend a exception inside method method level handling 
		//handling right in method then supppy try cathc block if you know i want centralized exception there are tons of validation mathod 
	}

}// "You are driving too slow : "
