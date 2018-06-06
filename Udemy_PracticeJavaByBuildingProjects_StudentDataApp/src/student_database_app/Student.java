/*James Hawley
 * 20180604Mon.
 * Practicing Java by taking Udemy courses
 * 
 *  Works Cited:
 *  Course title = "Practice Java by Building Projects"
 *  Instructor = Tim Short
 *  https://www.udemy.com/practice-java-by-building-projects/learn/v4/t/lecture/8098812?start=0*/

package student_database_app;
import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String gradeYear;
	private Integer studentID;
	private String courses;
	private Integer tuitionBalance;
	private Integer costOfCourse;
	
	// Constructor prompt for student name.
	public Student() {
		Scanner userInput = new Scanner(System.in);
		Integer temp = -1;
		
		out.printf("%s%n","Please enter your first name: ");//"%n" is better than "\n" because it lets Java change the new line encoding based on the system it is running on.
		this.firstName = userInput.nextLine();
		
		out.printf("%s%n","Please enter your last name: ");
		this.lastName = userInput.nextLine();
		
		this.gradeYear = gradChoice();
		
		userInput.close();
	}
	private String gradChoice() {
		Scanner userInput = new Scanner(System.in);
		Integer choice;
		String theChoice;
		
		out.printf("%s%n%s%n%s%n%s%n%s%n", 
				"Enter grade year code code:", 
				"1 Freshman",
				"2 Sophomore",
				"3 Junior",
				"4 Senior",
				"else it will be \"none\"");
		
		try
		{
			choice = userInput.nextInt();
		}
		catch(InputMismatchException e)
		{
			choice = 1;
		}
		 userInput.close();
		
		switch(choice) {
			case 1: theChoice = "Freshman";
					break;
			case 2: theChoice =  "Sophomore";
					break;
			case 3: theChoice =   "Junior";
					break;
			case 4: theChoice = "Senior";
					break;
			default: theChoice =   "none";
					break;
		}
		return theChoice;//it is good practice to not have multiple return statements in a single function
	}
	@Override
	public String toString() {
		return String.format(this.firstName + " " + this.lastName + " " + this.gradeYear);
	}
	
	// Generate ID
	
	// Enroll in courses
	
	// View balance
	
	// Pay tuition
	
	// Show status
}
