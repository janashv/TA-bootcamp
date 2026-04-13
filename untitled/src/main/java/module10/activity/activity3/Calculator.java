package module10.activity.activity3;

public class Calculator {

    //sum of 2 integers
    public int add(int a, int b) {
        return a + b;
    }

    //sum of 3 integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    //subtracts second number from first number.
    public int subtract(int a, int b) {
        return a - b;
    }

    //divides 2 numbers
    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Invalid input: cannot divide by zero.");
            return 0;
        }
    }

    //multiplies two numbers
    public int multiply(int a, int b) {
        try {
            if (a < 0 || b < 0) {
                throw new InvalidInputException("Invalid input: negative values are not allowed for multiplication.");
            }
            return a * b;
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}