package java4;

public class Q1 {
	public static void main(String[] args) {
		Integer num1 = new Integer(10);
		Integer num2 = new Integer(10);

		System.out.println("Using == for Integer objects:");
		System.out.println("num1 == num2: " + (num1 == num2)); 

		System.out.println("Using equals() for Integer objects:");
		System.out.println("num1.equals(num2): " + num1.equals(num2));

		Float f1 = new Float(3.14);
		Float f2 = new Float(3.14);

		System.out.println("\nUsing == for Float objects:");
		System.out.println("f1 == f2: " + (f1 == f2));

		System.out.println("Using equals() for Float objects:");
		System.out.println("f1.equals(f2): " + f1.equals(f2));
	}
}
