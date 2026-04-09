package module7.activity;

public class ArithmeticExceptionActivity {
    public static void main(String args[]) {
        //instance and call method
        ArithmeticExceptionActivity obj = new ArithmeticExceptionActivity();

        //exception reason
        obj.catchMe(10, 0);

        System.out.println("----------------------");

        //call with valid values
        obj.catchMe(10, 2);
    }
    void catchMe(int num1, int num2) {
        try {
            //risky operation
            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException a) {
            //exception due division by zero
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            //always executes
            System.out.println("Thank you for using this program.");
        }
    }
    }
