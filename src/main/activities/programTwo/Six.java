package activities.programTwo;

public class Six {

    public static void main(String[] args) {
        int n;
        int maxDivisors;
        int[] saveCount;
        saveCount = new int[10001];
        maxDivisors = 1;
        saveCount[1] = 1;
        for (n = 2; n <= 10000; n++ ) {

            int D;
            int divisorCount;
            divisorCount = 0;

            for (D = 1; D <= n; D++ ) {
                if ( n % D == 0 )
                    divisorCount++;
            }
            saveCount[n] = divisorCount;
            if (divisorCount > maxDivisors) {
                maxDivisors = divisorCount;
            }
        }
        System.out.println("Among integers between 1 and 10000,");
        System.out.println("The maximum number of divisors was " + maxDivisors);
        System.out.println("Numbers with that many divisors include:");
        for (n = 1; n <= 10000; n++ ) {
            if ( saveCount[n] == maxDivisors ) {
                System.out.println( "   " + n);
            }
        }
    }
}
