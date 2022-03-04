package swithStatements;

import java.util.Scanner;

public class JavaSwitchStatements {
	/*
	 * ideal for int, short, byte, char or string value
	 * against fixed known value
	 * a single value to check
	 */

	public static void main(String[] args) {
		System.out.println("Enter a color first letter: ");
		Scanner s = new Scanner(System.in);
		String color = s.next();

		switch (color) {
		case "r": case "R":
			System.out.println("Red");
			break;
		case "b":
			System.out.println("Blue");
			break;
		case "g":
			System.out.println("Green");
			break;

		default:
			System.out.println("Invalid color");

		}

	}

}
