import java.util.Scanner;

/**
 * The Names class prompts users to enter their full name, reads the input, and prints the last name.
 * @author Sapper
 * @version 1.0
 * email: email
 * 27JAN2018
 */

public class Names {
	public static void main(String[] args) {
		System.out.println("Please enter your full name");
		Scanner keyboard = new Scanner(System.in);
		keyboard.useDelimiter("\n");
		String fullName = keyboard.next();
		String familyName = fullName.substring(fullName.lastIndexOf(' ')+1);
		System.out.println();
		System.out.println("Hello Mr./Mrs. " + familyName);
	}
}
