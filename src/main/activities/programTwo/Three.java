package activities.programTwo;
import java.util.Scanner;

public class Three {

    public static void main(String [] args) {

        double first;
        String operator;
        double second;

        Scanner user = new Scanner(System.in);
        System.out.println("This program will compute simple mathematical computations, please enter 0 to terminate.");
        System.out.println("Enter your first number: ");
        first = user.nextDouble();
        System.out.println("Enter your operator: ");
        operator = user.nextLine();
        System.out.println("Enter your second number: ");
        second = user.nextDouble();

        if (operator.equals("+")) {
            System.out.println(first + second);
        }

        if (operator.equals("-")) {
            System.out.println(first - second);
        }

        if (operator.equals("*")) {
            System.out.println(first * second);
        }

        if (operator.equals("/")) {
            System.out.println(first / second);
        }
    }
}
