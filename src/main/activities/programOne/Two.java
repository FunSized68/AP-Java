package activities.programOne;

import java.util.Random;

public class Two {

    public static void main(String [] args) {
        int x = (int) (Math.random() * 6) + 1;
        int y = (int) (Math.random() * 6) + 1;
        int z = x + y;

        System.out.println("Your first dice roll was: " + x);
        System.out.println("Your second dice roll was: " + y);
        System.out.println("Your total is: " + z);
    }
}
