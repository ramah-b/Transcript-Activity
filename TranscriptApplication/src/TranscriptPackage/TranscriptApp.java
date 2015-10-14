package TranscriptPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class TranscriptApp {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		String course, grade, quit = "";
		int credits;

		Transcript transcript = new Transcript();

		System.out.println("Welcome to the transcript application.\n\n");

		while (!quit.equals("n")) {

			course = Validator.getString(sc, "Enter course:  ");

			credits = Validator.getInt(sc, "Enter credits:  ");
			while (credits <= 0 || credits > 4) {
				System.out.println("Number of credits entered in invalid.");
				credits = Validator.getInt(sc, "Enter credits:  ");
			}

			grade = Validator.getString(sc, "Enter grade: ").toUpperCase();

			while (!Validator.validateGrade(grade)) {
				System.out.println("Grade entered in invalid.");
				grade = Validator.getString(sc, "Enter grade: ").toUpperCase();
			}
			CourseEnrollment tempCE = new CourseEnrollment(course, credits,
					grade);
			transcript.addCourse(tempCE);

			quit = Validator.getString(sc, "Another course?  ").toLowerCase();
			System.out.println("\n\n");
		}

		System.out.format("%-14s %-8s %-8s %-8s", "Course", "Credits", "Grade",
				"Quality Points");
		System.out.println();
		ArrayList<CourseEnrollment> CE = new ArrayList<CourseEnrollment>();

		CE = transcript.getCourse();

		for (int i = 0; i < CE.size(); i++) {
			String str;
			str = String.format("%-14s %-8s %-8s %-8s", CE.get(i).getCourse(),
					CE.get(i).getCredits(), CE.get(i).getGrade(), CE.get(i)
							.getQualityPoints(CE.get(i).getGrade()));
			
			System.out.println(str);

		}
		System.out.println("\n");
		System.out.format("%36s %-8s", "GPA: ", transcript.getOverallGPA());
		System.out.println();
	}

}
