package activities.programOne;
import java.util.Scanner;

public class Five {

    public static void main(String [] args) {

        System.out.println("Enter the amount of eggs you have: ");
        Scanner user = new Scanner(System.in);

        int eggs = user.nextInt();
        int gross = eggs / 144;
        int above = eggs % 144;
        int dozen = above / 12;
        int left = above % 12;

        System.out.println("Your number of eggs are " + gross + " gross, " + dozen + " dozen, and " + left + ".");

    }
}
