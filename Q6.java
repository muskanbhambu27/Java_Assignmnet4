package java4;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter the size of the array: ");
			int size = scanner.nextInt();

			int[] array = new int[size];

			System.out.println("Enter the elements of the array:");
			for (int i = 0; i < size; i++) {
				System.out.print("Element " + (i + 1) + ": ");
				array[i] = scanner.nextInt();
			}

			System.out.print("Enter the position (1 to " + size + ") to retrieve the value: ");
			int position = scanner.nextInt();

			int value = getValueAtPosition(array, position);
			System.out.println("Value at position " + position + ": " + value);
		} catch (Exception e) {
			System.out.println("Error: Please enter valid input.");
		} finally {
			scanner.close();
		}
	}

	public static int getValueAtPosition(int[] array, int position) throws Exception {
		if (position < 1 || position > array.length) {
			throw new Exception("Invalid position");
		}
		return array[position - 1];
	}
}
