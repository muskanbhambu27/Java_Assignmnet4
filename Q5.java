package java4;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter a number: ");
			double number = scanner.nextDouble();

			double square = calculateSquare(number);
			System.out.println("Square of the number: " + square);
		} catch (Exception e) {
			System.out.println("Error: Please enter a valid number.");
		} finally {
			scanner.close();
		}
	}

	public static double calculateSquare(double number) {
		return number * number;
	}
}
