package labs;

import java.util.Scanner;

public class Reverse {
    public static void main(String [] args) {

        System.out.println("Please input a positive integer: ");
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt(); // finds the length of the array

        System.out.println("Enter " + x + " values: ");
        int [] nums = new int[x]; // makes an array which has the length

        for (int i = 0; i < nums.length; i++) {
            nums[i] = obj.nextInt(); // gives elements of array to the user
        }
        for (int i : (nums)) {
            System.out.print(i + " "); // to print out the original array
        }
        System.out.println();
        for (int i : reverseArray(nums)) {
            System.out.print(i + " "); // to print out the reverse array
        }

    }

    public static int [] reverseArray (int [] arr) {

        int temp = 0;

        for(int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i]; // To assign values to the last element of array
            arr[arr.length - 1 - i] = temp; // To assign values to the first element of array
        }
        return arr;

    }
}
