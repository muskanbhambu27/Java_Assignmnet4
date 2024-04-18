package java4;

public class Q2 {
	public static void main(String[] args) {
		String input = "hello world";
		String result = removeDuplicates(input);
		System.out.println("Original String: " + input);
		System.out.println("String after removing duplicates: " + result);
	}

	public static String removeDuplicates(String str) {
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			if (stringBuffer.indexOf(String.valueOf(currentChar)) == -1) {
				stringBuffer.append(currentChar);
			}
		}
		return stringBuffer.toString();
	}
}
