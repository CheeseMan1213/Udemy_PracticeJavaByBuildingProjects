/*James Hawley
 * 20180604Mon.
 * Practicing Java by taking Udemy courses
 * 
 *  Works Cited:
 *  Course title = "Practice Java by Building Projects"
 *  Instructor = Tim Short
 *  URL = https://www.udemy.com/practice-java-by-building-projects/learn/v4/overview
 *  
 *  https://stackoverflow.com/questions/5207162/define-a-fixed-size-list-in-java
 *  https://www.geeksforgeeks.org/generating-password-otp-java/*/
package email_app;

import static java.lang.System.out;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email james = new Email("James", "Hawley");
		out.println(james.toString());
	}

}
