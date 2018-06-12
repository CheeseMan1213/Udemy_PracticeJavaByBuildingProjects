/*James Hawley
 * 20180604Mon.
 * Practicing Java by taking Udemy courses
 * 
 *  Works Cited:
 *  Course title = "Practice Java by Building Projects"
 *  Instructor = Tim Short
 *  https://www.udemy.com/practice-java-by-building-projects/learn/v4/t/lecture/8098812?start=0
 *  https://stackoverflow.com/questions/6415728/junit-testing-with-simulated-user-input?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa*/

package student_database_app;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String gradeYear;
	private Integer studentID;
	private List<String> coursesList;
	private Integer tuitionBalance;
	private Integer costOfCourse;
	private Scanner classScanner;
	
	// Constructor prompt for student name.
	public Student(Scanner scan) {
		this.classScanner = scan;
		this.coursesList = new ArrayList<String>();
		this.tuitionBalance = 0;
		this.costOfCourse = 600;
		
		this.classScanner = this.setName(this.classScanner);
		
		this.classScanner = gradChoice(this.classScanner);
		
		
	}
	private Scanner setName(Scanner scan) {
		//Scanner userInput = new Scanner(System.in);
		
		out.printf("%s%n","Please enter your first name: ");//"%n" is better than "\n" because it lets Java change the new line encoding based on the system it is running on.
		this.firstName = scan.nextLine();
		
		out.printf("%s%n","Please enter your last name: ");
		this.lastName = scan.nextLine();
		
		return scan;
	}
	private Scanner gradChoice(Scanner scan) {
		//Scanner userInput = new Scanner(System.in);
		Integer choice = -1;
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
			choice = (Integer)(scan.nextInt());

		}
		catch(NoSuchElementException e)
		{
			out.println("***************");
			out.println(choice);
			out.println("***************");
			choice = 1;
		}
		
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
		this.gradeYear = theChoice;
		return scan;//it is good practice to not have multiple return statements in a single function
	}
	//Enroll
	public Scanner enroll(Scanner scan) {
		String course = "Q";
		//Scanner userInput = new Scanner(System.in);
		do {
			
			out.printf("%s%n", "Enter course to enroll (Q to quit): ");
			//userInput.nextLine();
			course = scan.nextLine();
			if(!(course.equals("Q") || course.equals("q"))) {
			this.coursesList.add(course);
			this.tuitionBalance = this.tuitionBalance + this.costOfCourse;
			}
			
		} while(!(course.equals("Q") || course.equals("q")));
		
		return scan;

	}
	//View balance
	public Integer getBalance() {
		return this.tuitionBalance;
	}
	//Pay Tuition
	public Scanner payTuition(Scanner scan) {
		out.printf("%n%s%n", "Please enter your payment: ");
		//Scanner in = new Scanner(System.in);
		Integer payment = scan.nextInt();
		this.tuitionBalance = this.tuitionBalance - payment;
		out.printf("%s %d%n", "Thank you for your payment of:", payment);
		out.printf("%s %d %s%n", "You have", this.getBalance(), "left.");
		
		return scan;
	}
	@Override
	public String toString() {
		String studentData;
		studentData = String.format("%n" + this.firstName +" "+ this.lastName + " is a " + this.gradeYear + "."
				+ "%nClasses enrolled in: " + this.coursesList
				+ "%nYou now owe: " + this.tuitionBalance);
		//studentData = studentData + String.format( "%n" + this.firstName + " " + this.lastName + " " + this.gradeYear);
		return studentData;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// Generate ID
	
	// Enroll in courses
	
	// View balance
	
	// Pay tuition
	
	// Show status
}
