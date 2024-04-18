package java4;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter an integer: ");
			String input = scanner.nextLine();

			int number = convertToInteger(input);
			System.out.println("The integer value is: " + number);
		} catch (NumberFormatException e) {
			System.out.println("Error: Input contains non-digits.");
		} catch (IllegalArgumentException e) {
			System.out.println("Error: Input is too large to convert to an integer.");
		} finally {
			scanner.close();
		}
	}

	public static int convertToInteger(String str) throws NumberFormatException, IllegalArgumentException {
		long num = Long.parseLong(str);

		if (num < Integer.MIN_VALUE || num > Integer.MAX_VALUE) {
			throw new IllegalArgumentException("Input is too large to convert to an integer.");
		}

		return (int) num;
	}
}
