package bootcampexcercise.module2.activity;

public class MultiplicationTable {
    public static void main(String[] args) {
        //call method to print tables from 11 to 20
        printTables(11, 20);
    }

    //method to print multiplication tables
    public static void printTables(int start, int end) {
        //loop through each number
        for (int i = start; i <= end; i++) {

            //print table for current number
            printSingleTable(i);

            System.out.println();
        }
    }

    //method to print multiplication table for a single number
    public static void printSingleTable(int number) {

        System.out.println("Multiplication table for " + number + ":");

        //loop from 1 to 10 to generate multiplication results
        for (int j = 1; j <= 10; j++) {

            System.out.println(number + " x " + j + " = " + (number * j));
        }
    }
}
