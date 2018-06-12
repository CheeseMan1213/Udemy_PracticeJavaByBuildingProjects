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

import java.io.ByteArrayInputStream;
import java.util.Scanner;


public class StudentDatabaseApp {

	public static void main(String[] args) {
		//String testString = String.format("%s%n%s%n%s", "Mouse", "Cars", "Extra");
		//String testStringConstructor = String.format("%s%n%s%n%s%n%s%n%s%n%s%n%s", "James", "Hawley", "1", "history", "math", "q", "21");
		String testStringConstructor = String.format("%s%n%s%n%s", "James", "Hawley", "2");
		String testStringEnroll = String.format("%s%n%s%n%s", "history", "math", "q");
		String testStringPay = String.format("%s", "21");
		ByteArrayInputStream in_1 = new ByteArrayInputStream(testStringConstructor.getBytes());
		ByteArrayInputStream in_2 = new ByteArrayInputStream(testStringEnroll.getBytes());
		ByteArrayInputStream in_3 = new ByteArrayInputStream(testStringPay.getBytes());
		Scanner scanUser = new Scanner(System.in);
		Scanner scanStream_1 = new Scanner(in_1);
		Scanner scanStream_2 = new Scanner(in_2);
		Scanner scanStream_3 = new Scanner(in_3);
		//out.println(scanStream.nextLine());
		/*while (scan.hasNextLine()) {
			out.println(scan.nextLine());
			scan.next();
		}*/
		Student student_1 = new Student(scanStream_1);
		student_1.enroll(scanStream_2);
		//out.printf("You now owe: %d", student_1.getBalance());
		student_1.payTuition(scanStream_3);
		out.printf("%s%n",student_1.toString());
	}
}
