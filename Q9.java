package java4;

	class Calculator {
	    private int num1;
	    private int num2;

	    public Calculator(int num1, int num2) {
	        this.num1 = num1;
	        this.num2 = num2;
	    }

	    public int Add() {
	        if (num1 < 0 || num2 < 0) {
	            throw new ArithmeticException("Numbers should be positive for addition.");
	        }
	        return num1 + num2;
	    }

	    public int Subtract() {
	        if (num1 < 0 || num2 < 0) {
	            throw new ArithmeticException("Numbers should be positive for subtraction.");
	        }
	        return num1 - num2;
	    }

	    public int Multiply() {
	        if (num1 == 0 || num2 == 0) {
	            throw new ArithmeticException("Numbers should not be zero for multiplication.");
	        }
	        return num1 * num2;
	    }

	    public int Division() {
	        if (num2 == 0) {
	            throw new ArithmeticException("Denominator should not be zero for division.");
	        }
	        return num1 / num2;
	    }
	}

	public class Q9 {
	    public static void main(String[] args) {
	        try {
	            Calculator obj1 = new Calculator(10, 5);
	            System.out.println("Addition: " + obj1.Add());

	            Calculator obj2 = new Calculator(10, 5);
	            System.out.println("Subtraction: " + obj2.Subtract());

	            Calculator obj3 = new Calculator(10, 5);
	            System.out.println("Multiplication: " + obj3.Multiply());

	            Calculator obj4 = new Calculator(10, 5);
	            System.out.println("Division: " + obj4.Division());
	        } catch (NumberFormatException e) {
	            System.out.println("Error: Non-integer value provided.");
	        } catch (ArithmeticException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}

