package bootcampexcercise.module2.activity;

public class FindInArray {
    public static void main(String[] args) {
        //array of 20 numbers
        int[] numbers = {
                11, 45, 7, 9, 23, 6, 90, 4, 67, 21,
                78, 13, 5, 99, 32, 4, 76, 2, 18, 0
        };

        //call method to find largest number
        int largest = findLargest(numbers);

        System.out.println("largest number in the array is: " + largest);
    }
    //method to find largest number in array
    public static int findLargest(int[] arr) {
        int largest = arr[0]; //assuming that first element is largest

        //loop through array
        for (int i = 1; i < arr.length; i++) {

            //compare and update largest
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
