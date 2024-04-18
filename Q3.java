package java4;

public class Q3 {

	public static void main(String[] args) {
		String[] array = { "Hello", "world", "!", "This", "is", "a", "Java", "program" };
		String concatenatedString = concatenateArrayElements(array);
		System.out.println("Concatenated String: " + concatenatedString);
	}

	public static String concatenateArrayElements(String[] array) {
		StringBuilder stringBuilder = new StringBuilder();
		for (String element : array) {
			stringBuilder.append(element);
		}
		return stringBuilder.toString();
	}
}
