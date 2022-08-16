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
				assertTrue("invalid first name",Regex.firstname("iva"));
			}catch(AssertionError e) {
				System.out.println(e.getMessage());
			}
			
		}
		/**
		 * testing last name
		 */
		@Test
		public void lname() {
			try {
				assertTrue("Invalid last name",Regex.lastname("Karthi"));
			}catch(AssertionError e) {
				System.out.println(e.getMessage());
			}
			
		}
		/**
		 * testing password
		 */
		@Test
		public void pass() {
			try {
				assertTrue("Invalid password",Regex.password("asdfghjkS"));
			}catch(AssertionError e) {
				System.out.println(e.getMessage());
			}
			
		}
		/**
		 * testing email
		 */
		@Test
		public void email() {
			try {
				assertTrue("Invalid email",Regex.email("karthikeyan26"));
			}catch(AssertionError e) {
				System.out.println(e.getMessage());
			}
			
		}

}
