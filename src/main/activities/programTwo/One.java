package activities.programTwo;
import java.util.Random;

public class One {

    public static void main(String [] args) {

        int die1;
        int die2;
        int count = 0;

        do {
            die1 = (int) (Math.random() * 6) + 1;
            die2 = (int) (Math.random() * 6) + 1;
            count++;

        } while(die1 != 1 || die2 != 1);

        System.out.println("It took " + count + " rolls to get Snake Eyes.");

    }
}
