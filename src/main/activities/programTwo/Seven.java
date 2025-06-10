package activities.programTwo;

public class Seven {

    public static void main(String[] args) {

        int[] numFound;
        int count;
        numFound = new int[365];
        count = 0;

        while (true) {
            int birthday;
            birthday = (int)(Math.random()*365);
            count++;
            if ( numFound[birthday] == 2 )
                break;
            numFound[birthday]++;
        }
        System.out.println("It took " + count +
                " tries to find three people with the same birthday.");
    }
}
