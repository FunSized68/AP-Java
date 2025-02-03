package labs;

import java.util.Scanner;

public class Reverse {
    public static void main(String [] args) {

        System.out.println("Please input a positive integer: ");
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();

        System.out.println("Enter " + x + " values: ");
        int [] nums = new int[x];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = obj.nextInt();
        }
        for (int i : (nums)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : reverseArray(nums)) {
            System.out.print(i + " ");
        }

    }

    public static int [] reverseArray (int [] arr) {
        int temp = 0;

        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr [i] = arr [arr.length - 1 - i];
            arr [arr.length - 1 - i] = temp;
        }
        return arr;
    }
}
