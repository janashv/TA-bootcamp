package bootcampexcercise.module2.activity;

public class Calculator {
    public static void main(String[] args) {

        int a = 20;
        int b = 5;

        //call all methods
        System.out.println("Sum: " + sum(a, b));
        System.out.println("Subtract: " + subtract(a, b));
        System.out.println("Multiply: " + multiply(a, b));
        System.out.println("Divide: " + divide(a, b));
        System.out.println("Modul: " + modul(a, b));
    }

    //1 method to add two numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    //2 method to subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }

    //3 method to multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    //4 method to divide two numbers
    public static int divide(int a, int b) {
        return a / b; // assumes b != 0
    }

    //5 method to find remainder (modulo)
    public static int modul(int a, int b) {
        return a % b;
    }
}