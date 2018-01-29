import java.util.Scanner;

/**
 * The Conversion class takes user input integers and characters and converts them into binary and hexadecimal.
 * @author Sapper
 * 28JAN2018
 * @version 1.0
 */

public class Conversion {
	/**
	 * The main() method executes the code instructions and converts the user input.
	 * @param args arguments passed from the command line.
	 */
	public static void main(String[] args) {
		//initialize a scanner to read keyboard input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an integer to be converted into binary or hex values");
		//read input, store as integer
		int numberEntered = keyboard.nextInt();
		//convert to Binary String
		String numBinary = Integer.toBinaryString(numberEntered);
		//convert to hexadecimal string
		String numHex = Integer.toHexString(numberEntered);
		System.out.println("You Entered " + numberEntered + ", this number in binary is: " + numBinary + ", and in Hex: " + numHex);
		System.out.println();
		
		System.out.println("Now enter a character: ");
		char charEntered = keyboard.next().trim().charAt(0);
		int ofChar = charEntered;
		String ofCharBin = Integer.toBinaryString(ofChar);
		System.out.println("character in decimal: " + ofChar);
		String ofCharHex = Integer.toHexString(ofChar);
		System.out.println("the character " + charEntered + " in Binary is: " + ofCharBin + "\nAnd in Hex is: " + ofCharHex);


	}
}
