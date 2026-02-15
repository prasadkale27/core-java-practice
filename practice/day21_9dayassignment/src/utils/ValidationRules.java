package utils;

import custom_exceptions.EmpHandlingException;

public class ValidationRules {
	 // add a public static method : to validate email ( invoked by tester )
	// rule : must contain : "@" -- contains , must end with .com -- endsWith
	// return validate email , in case of no validation errs
	// otherwise throw custom exception

	public static String validateEmail(String email) throws EmpHandlingException {
		if (email.contains("@") && email.endsWith("com"))
			return email;
		// => invalid email -- throw custom exc
		throw new EmpHandlingException("Invalid email");
	}
}
