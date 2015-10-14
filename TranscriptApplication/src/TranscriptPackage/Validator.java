package TranscriptPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validator {

	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.next(); // read user entry
		s += sc.nextLine(); // discard any other data entered on the line
		return s;
	}

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			try {
				i = sc.nextInt();
				isValid = true;
			} catch (InputMismatchException e) {
				System.out
						.println("Incorrect input. Please enter a valid number.");
			}

			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}

	public static boolean validateGrade(String grade) {
		boolean isValid = false;
		switch (grade) {
		case "A":
			isValid = true;
			break;
		case "B":
			isValid = true;
			break;
		case "C":
			isValid = true;
			break;
		case "D":
			isValid = true;
			break;
		case "F":
			isValid = true;
			break;
		}

		return isValid;
	}
}
