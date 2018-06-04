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

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private Integer defaultPasswordLength;
	private String department;
	private Integer mailBoxCapacity;
	private String alternateEmail;
	
	//Constructor to receive the first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.defaultPasswordLength = 16;
		//Using a private method to continue the constructor process
		this. password = randomPassword(this.defaultPasswordLength);
		this.department = setDepartment();
		this.mailBoxCapacity = 12;
		this.alternateEmail = "cats@hotmail.com";
	}
	//Ask for the department
	//generate random password
	//set the mailbox capacity
	//set the alternate email
	//change the password

	public String getDepartment() {
		return department;
	}
	private String randomPassword(Integer length) {
		/*You are having too much trouble trying to convert his way to Java Generics
		 * Just do it the way her did it*/
		
		
		//String passwordSet = new String("abcdefghijklmnpqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789@#$%");
		String upper =  "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower =  "abcdefghijklmnpqrstuvwxyz";
		String numbers =  "1234567890";
		String symbols  =  "!@#$%^&*()_+";
		String combinedVaules = upper + lower + numbers + symbols;
		char[] password = new char[length];
		for(int i = 0; i < length; i = i + 1)
		{
			int rand = (int) (Math.random() * combinedVaules.length());
			password[i] = combinedVaules.charAt(rand);
			//out.println(rand);
			//out.println(combinedVaules.charAt(rand));
		}
		//List<Character> password = FixedSizeList.decorate(Arrays.asList(new YourType[100]));
		//return new String(passwordSet.charAt(1).);
		return new String(password);
	}

	private String setDepartment() {
		
		Scanner userInput = new Scanner(System.in);
		Integer depChoice;
		String theChoice;
		
		out.printf("%s\n%s\n%s\n%s\n%s\n", 
				"Enter department code:", 
				"1 for sales",
				"2 for development",
				"3 for Accounting",
				"else it will be \"none\"");
		
		try
		{
			depChoice = userInput.nextInt();
		}
		catch(InputMismatchException e)
		{
			depChoice = 12;
		}
		 userInput.close();
		
		switch(depChoice) {
			case 1: theChoice = "sales";
						break;
			case 2: theChoice =  "development";
						break;
			case 3: theChoice =   "accounting";
						break;
			default: theChoice =   "none";
						break;
		}
		return theChoice;//it is good practice to not have multiple return statements in a single function
	}
	@Override
	public String toString() {
		return String.format("%s %s, %s, %d, %s %s", this.firstName, this.lastName, this.department, this.mailBoxCapacity, this.alternateEmail, this.password);
	}
}
