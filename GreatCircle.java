import java.util.Scanner;

/**
 * The GreatCircle class reads two lat and long coordinates entered by a user and calculates the distance between them.
 * @author Sapper
 * @version 1.0
 * email: email
 * 27JAN2018
 */

public class GreatCircle {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter two lattitude and longitude coordinates, the first number is north or south with negative being south and the second number is East or West with east being a negative value, and I will find the distance between them.");
		System.out.println();
		System.out.println("First North/South: ");
		double norSouth1 = Math.toRadians(keyboard.nextDouble());
		System.out.println("First east/west: ");
		double eastWest1 = Math.toRadians(keyboard.nextDouble());
		System.out.println();
		System.out.println("Second North/South: ");
		double norSouth2 = Math.toRadians(keyboard.nextDouble());
		System.out.println("Second east/west: ");
		double eastWest2 = Math.toRadians(keyboard.nextDouble());

		double earthRadius = 6371.01;
		double distance = 0.0;
		distance = (earthRadius * Math.acos(Math.sin(norSouth1) * Math.sin(norSouth2) + Math.cos(norSouth1) * Math.cos(norSouth2) * Math.cos(eastWest1 - eastWest2)));

		System.out.println("The distance between them is: " + distance + "km");

	}
}
