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

public class StudentDatabaseApp {

	public static void main(String[] args) {
		Student student_1 = new Student();
		out.printf("%s%n",student_1.toString());
	}
}
