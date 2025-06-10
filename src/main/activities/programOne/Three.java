package activities.programOne;

import java.util.Scanner;

public class Three {

    public static void main(String [] args) {

        System.out.println("Enter your first name: ");

        Scanner name = new Scanner(System.in);
        String user = name.nextLine();
        String upper = user.toUpperCase();

        System.out.println("Hello, " + upper + " nice to meet you!");

    }

}
