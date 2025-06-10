package activities.programOne;

import java.util.Scanner;

public class Four {

    public static void main(String [] args) {

        System.out.println("How many quarters do you have: ");
        Scanner coin = new Scanner(System.in);
        double quarter = coin.nextInt();

        System.out.println("How many dimes do you have: ");
        double dime = coin.nextInt();

        System.out.println("How many nickels do you have: ");
        double nickel = coin.nextInt();

        System.out.println("How many pennies do you have: ");
        double pennies = coin.nextInt();

        double sumQuarter = quarter * 0.25;
        double sumDime = dime * 0.10;
        double sumNickel = nickel * 0.05;
        double sumPenny = pennies * 0.01;

        double add = sumQuarter + sumDime + sumNickel + sumPenny;


        System.out.println("You have " + add + " dollars!");

    }

}
