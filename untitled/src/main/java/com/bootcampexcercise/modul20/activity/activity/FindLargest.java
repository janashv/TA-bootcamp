package com.bootcampexcercise.modul20.activity.activity;

public class FindLargest {
    public static void main(String[] args) {

        //provided numbers
        int x = 10;
        int y = 88;
        int z = 2;

        //method call
        int largest = findLargest(x, y, z);

        System.out.println("Largest number found: " + largest);
    }

    //method to find the largest number using if-else
    public static int findLargest(int x, int y, int z) {
        int largest;

        if (x >= y && x >= z) {
            largest = x;
        } else if (y >= x && y >= z) {
            largest = y;
        } else {
            largest = z;
        }

        return largest;
    }
}
