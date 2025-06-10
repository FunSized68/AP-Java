package activities.programOne;

import java.util.Scanner;

public class Six {

    public static void main(String [] args) {

        System.out.println("Please enter your first and last name seperated by a space: ");
        Scanner user = new Scanner(System.in);
        String full = user.nextLine();

        int space = full.indexOf(" ");

        String first = full.substring(0, space);
        String last = full.substring(space + 1, full.length());


        System.out.println("Your first name is " + first + ", which has " + first.length() + " characters.");
        System.out.println("Your last name is " + last + ", which has " + last.length() + " characters.");

    }

}
