package activities.programTwo;
import java.util.Scanner;

public class Four {

    public static void main(String [] args) {

        char word;
        boolean space;

        System.out.println("Please enter your sentence: ");
        Scanner user = new Scanner(System.in);
        String line = user.nextLine();

        for(int i = 0; i < line.length(); i++) {

            word = line.charAt(i);
            if(Character.isLetter(word)) {
                System.out.println(word);
                space = false;
            }
            else {
                System.out.println();
                space = true;
            }
        }
        System.out.println();
    }
}
