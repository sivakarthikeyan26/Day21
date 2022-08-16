package testing.testing1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
	/**
	 * function t check firstname
	 * @param fname
	 * @return
	 */
	public static boolean firstname(String fname) {
		return Pattern.matches("[A-Z][a-z]{3,}", fname);
	}
	/**
	 * function to check the lastname
	 * @param lname
	 * @return
	 */
	public static boolean lastname(String lname) {
		return Pattern.matches("[A-Z][a-z]{3,}", lname);
	}
	
	/**
	 * function to check the password
	 * @param pass
	 * @return
	 */
	public static boolean password(String pass) {
		return Pattern.matches("^(?=.{8,}$)(?=.*?[a-z])(?=.*?[A-Z])(?=.*\\W).*$", pass);
	}
	/**
	 * function to check the email address
	 * @param email
	 * @return
	 */
	public static boolean email(String email) {
		return Pattern.matches("^(.+)@(.+)$", email);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name");
		String firstname = sc.next();
		System.out.println("Enter the last name");
		String lastname = sc.next();
		System.out.println("Enter the email id");
		String email = sc.next();
		System.out.println("Enter the password");
		String pass = sc.next();
		/**
		 * checking if the given name starts with capital letter and has min 3 letters
		 */
		boolean result = firstname(firstname);
		/**
		 * checking if the given name starts with capital letter and has min 3 letters
		 */
		boolean result2 = lastname(lastname);

		/**
		 * checking password
		 */
		boolean result3 = password(pass);
		
		boolean result4 = email(email);

		/**
		 * if all the cases are true print valid else invalid
		 */
		if(result && result2 && result3 && result4) {
			System.out.println("valid");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
