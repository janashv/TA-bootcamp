package bootcampexcercise.module2;

public class NumToWords {

    public static void main(String[] args) {
        switchCaseEx(5);
        switchCaseEx(100); //wrong value
        switchCaseEx(1);
    }

    public static void switchCaseEx(int number) {
        //switch cases
        switch (number) {
            case 1:
                System.out.println("Value " + number + " is valid → ONE");
                break;
            case 2:
                System.out.println("Value " + number + " is valid → TWO");
                break;
            case 3:
                System.out.println("Value " + number + " is valid → THREE");
                break;
            case 4:
                System.out.println("Value " + number + " is valid → FOUR");
                break;
            case 5:
                System.out.println("Value " + number + " is valid → FIVE");
                break;
            case 6:
                System.out.println("Value " + number + " is valid → SIX");
                break;
            case 7:
                System.out.println("Value " + number + " is valid → SEVEN");
                break;
            case 8:
                System.out.println("Value " + number + " is valid → EIGHT");
                break;
            case 9:
                System.out.println("Value " + number + " is valid → NINE");
                break;
            case 10:
                System.out.println("Value " + number + " is valid → TEN");
                break;
            default:
                System.out.println("Value " + number + " is NOT valid (must be between 1 and 10)");
        }
    }
}