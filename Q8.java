package java4;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		String input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String Name:");
		input = sc.next();
		try {
			checkForVowels(input);
			System.out.println("The string contains vowels.");
		} catch (NoVowelsException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void checkForVowels(String str) throws NoVowelsException {
		if (!containsVowels(str)) {
			throw new NoVowelsException("The string does not contain any vowels.");
		}
	}

	public static boolean containsVowels(String str) {
		for (char c : str.toCharArray()) {
			if ("AEIOUaeiou".indexOf(c) != -1) {
				return true;
			}
		}
		return false;
	}
}

class NoVowelsException extends Exception {
	public NoVowelsException(String message) {
		super(message);
	}
}
