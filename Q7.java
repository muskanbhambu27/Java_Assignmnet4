package java4;

import java.util.StringTokenizer;

public class Q7 {

	public static void main(String[] args) {
		String input = "Hello World.";

		try {
			StringTokenizer tokenizer = new StringTokenizer(input);

			String firstWord = tokenizer.nextToken();
			System.out.println("First word: " + firstWord);

			String secondWord = tokenizer.nextToken();
			System.out.println("Second word: " + secondWord);

			String thirdToken = tokenizer.nextToken();
			System.out.println("Third token: " + thirdToken);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
