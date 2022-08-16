package testing.testing1;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class Junit {
		
		@Mock
		private Regex rg = new Regex();
		/**
		 * testing first name
		 */
		@Test
		public void fname() {
			try {
				assertTrue(Regex.firstname("iva"));
			}catch(AssertionError e) {
				System.out.println("invalid name");
			}
			
		}
		/**
		 * testing last name
		 */
		@Test
		public void lname() {
			try {
				assertTrue(Regex.lastname("Karthi"));
			}catch(AssertionError e) {
				System.out.println("invalid last name");
			}
			
		}
		/**
		 * testing password
		 */
		@Test
		public void pass() {
			try {
				assertTrue(Regex.password("asdfghjkS"));
			}catch(AssertionError e) {
				System.out.println("invalid password");
			}
			
		}
		/**
		 * testing email
		 */
		@Test
		public void email() {
			try {
				assertTrue(Regex.email("karthikeyan26@gmail.com"));
			}catch(AssertionError e) {
				System.out.println("invalid email");
			}
			
		}

}
