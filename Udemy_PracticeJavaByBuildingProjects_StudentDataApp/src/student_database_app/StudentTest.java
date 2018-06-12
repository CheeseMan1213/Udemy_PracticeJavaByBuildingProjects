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
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class StudentTest {//Why was this not initially public, oh well, I fixed it
	
	private Student student_1;
	
	@Before
	public void setUp() {
		String testStringConstructor = String.format("%s%n%s%n%s", "James", "Hawley", "2");
		//String testStringEnroll = String.format("%s%n%s%n%s", "history", "math", "q");
		//String testStringPay = String.format("%s", "21");
		ByteArrayInputStream in_1 = new ByteArrayInputStream(testStringConstructor.getBytes());
		//ByteArrayInputStream in_2 = new ByteArrayInputStream(testStringEnroll.getBytes());
		//ByteArrayInputStream in_3 = new ByteArrayInputStream(testStringPay.getBytes());
		Scanner scanStream_1 = new Scanner(in_1);
		//Scanner scanStream_2 = new Scanner(in_2);
		//Scanner scanStream_3 = new Scanner(in_3);
		this.student_1 = new Student(scanStream_1);
		//this.student_1.enroll(scanStream_2);
		//this.student_1.payTuition(scanStream_3);
	}
	@Test
	void testName() {
		/*
		String testStringConstructor = String.format("%s%n%s%n%s", "James", "Hawley", "2");
		//String testStringEnroll = String.format("%s%n%s%n%s", "history", "math", "q");
		//String testStringPay = String.format("%s", "21");
		ByteArrayInputStream in_1 = new ByteArrayInputStream(testStringConstructor.getBytes());
		//ByteArrayInputStream in_2 = new ByteArrayInputStream(testStringEnroll.getBytes());
		//ByteArrayInputStream in_3 = new ByteArrayInputStream(testStringPay.getBytes());
		Scanner scanStream_1 = new Scanner(in_1);
		//Scanner scanStream_2 = new Scanner(in_2);
		//Scanner scanStream_3 = new Scanner(in_3);
		this.student_1 = new Student(scanStream_1);
		//this.student_1.enroll(scanStream_2);
		//this.student_1.payTuition(scanStream_3);
*/		
		//assertEquals(ExpectedOutput, ActualOutput)
		assertEquals("James", this.student_1.getFirstName());
		assertEquals("Hawley", this.student_1.getLastName());
	}
}
