

import java.util.*;

/**
 * 
 * @author Patan Shahanaz Khanam 
 *        
 *
 */
public class NameValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**
		 * input from the user
		 */
		System.out.println("Enter First Name of an Employee");
		String fname = sc.next(); // first name of an employee
		System.out.println("Enter Last Name of an Employee");
		String lname = sc.next(); // last name of an employee
		sc.close(); // scanner close

		try {
			/**
			 * check the full name of an employee is blank or not check the first name or
			 * last name contain digit if string contain digit then throw
			 * InvalidNameException
			 */
			if (fname == "" || fname == null || lname == "" || lname == null) {

				throw new InvalidName("Please Enter Full Name of an Employee");
				
			} else if (fname.matches(".*\\d.*") && lname.matches(".*\\d.*")) { // check first and last name containing
																				// digit
				throw new InvalidName("Enter Valid Full Name of an Employee");

			} else if (fname.matches(".*\\d.*")) { // check first name containing digit

				throw new InvalidName("Enter Valid First Name of an Employee");

			} else if (lname.matches(".*\\d.*")) { // check last name containing digit

				throw new InvalidName("Enter Valid Last Name of an Employee");

			} else {
				System.out.println("Full Name of an Employee is " + fname + " " + lname);
			}
		} catch (InvalidName e) {
			// print the exception
			System.out.println(e.getMessage());

		}
	}

}
