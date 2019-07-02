
import java.util.Scanner;

public class Validations {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		boolean validName = validateName(scnr, "Please enter your name: ");
		boolean validEmail = validateEmail(scnr, "Please enter your email: ");
		boolean validPhoneNumber = validatePhoneNumber(scnr, "Please enter your phone number (xxx-xxx-xxxx): ");
		boolean validDate = validateDate(scnr, "Please enter your birthday (dd/mm/yyyy): ");
	}

	private static boolean validateName(Scanner scnr, String prompt) {
		boolean isValid = false;
		String input;
		do {
			System.out.print(prompt);
			input = scnr.nextLine();
			if (input.matches("[A-Z][a-zA-Z]{0,30}")) {
				isValid = true;
				System.out.println("Valid entry");
			} else {
				System.out.println("Please enter a valid capitalized name");
			}
		} while (!isValid);
		return isValid;
	}

	private static boolean validateEmail(Scanner scnr, String prompt) {
		boolean isValid = false;
		String input;
		do {
			System.out.print(prompt);
			input = scnr.nextLine();
			if (input.matches("[a-zA-Z\\d]{5,30}@[a-zA-Z\\d]{5,10}.[a-zA-Z\\d]{2,3}")) {
				isValid = true;
				System.out.println("Valid entry");
			} else {
				System.out.println("Please enter a valid email");
			}
		} while (!isValid);
		return isValid;
	}

	private static boolean validatePhoneNumber(Scanner scnr, String prompt) {
		boolean isValid = false;
		String input;
		do {
			System.out.print(prompt);
			input = scnr.nextLine();
			if (input.matches("[\\d]{3}-[\\d]{3}-[\\d]{4}")) {
				isValid = true;
				System.out.println("Valid entry");
			} else {
				System.out.println("Please enter a valid phone number");
			}
		} while (!isValid);
		return isValid;
	}

	private static boolean validateDate(Scanner scnr, String prompt) {
		boolean isValid = false;
		String input;
		do {
			System.out.print(prompt);
			input = scnr.nextLine();
			if (input.matches("[\\d]{2}\\/[\\d]{2}\\/[\\d]{4}")) {
				isValid = true;
				System.out.println("Valid entry");
			} else {
				System.out.println("Please enter a valid date");
			}
		} while (!isValid);
		return isValid;
	}
}
