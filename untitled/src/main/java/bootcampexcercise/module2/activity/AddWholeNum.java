package bootcampexcercise.module2.activity;

public class AddWholeNum {
    public static void main(String[] args) {

        int sum = 0;

        //loop from 50 to 100
        for (int i = 50; i <= 100; i++) {
            //conditional statement
            if (i >= 50 && i <= 100) {
                sum += i;
            }
        }
        System.out.println("Sum from 50 to 100 is: " + sum);
    }
}