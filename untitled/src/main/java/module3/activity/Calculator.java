package module3.activity;

public class Calculator {

    //constant for calculator type
    public static final String CALC_TYPE_BASIC = "BASIC";

    private String calculatorType;

    //constructor
    public Calculator(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    //getter method
    public String getCalculatorType() {
        return calculatorType;
    }

    //adding method
    public int add(int a, int b) {
        return a + b;
    }

    //subtract method
    public int subtract(int a, int b) {
        return a - b;
    }

    //divide method
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }

    //multiply method
    public int multiply(int[] numbers) {
        int result = 1;

        for (int num : numbers) {
            result *= num;
        }
        return result;
    }
}