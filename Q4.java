package java4;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		String input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the palindarome:");
		input = sc.next();
		boolean isPalindrome = isPalindrome(input);
		if (isPalindrome) {
			System.out.println("The input string \"" + input + "\" is a palindrome.");
		} else {
			System.out.println("The input string \"" + input + "\" is not a palindrome.");
		}
	}

	public static boolean isPalindrome(String str) {
		str = str.toLowerCase();

		str = str.replaceAll("[^a-zA-Z0-9]", "");

		String reversedStr = new StringBuilder(str).reverse().toString();

		return str.equals(reversedStr);
	}
}
