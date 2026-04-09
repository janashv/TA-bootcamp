package bootcampexcercise.module2.activity;


public class PrintNumWithWhile {
    public static void main(String[] args) {

        int number = 1; //start from first odd number

        //do while loop to print odd numbers
        do {
            //checks if number is odd
            if (number % 2 != 0) {
                System.out.println(number);
            }
            number++; //increment number

        } while (number < 100);
    }
}
