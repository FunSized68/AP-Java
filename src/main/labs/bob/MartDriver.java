package labs.bob;

/**
 * Driver class for the grocery store simulation.
 *
 * @author Nathan Sprague
 *
 */
public class MartDriver {

    public static void main(String[] args) {
        int totalSeconds = 8 * 60 * 60;
        int numCashiers = 8;
        double customerProbability = 0.05;
        int maxItems = 100;
        int[] maxCapacities = {5, 7, 20};

        for (int maxCapacity : maxCapacities) {
            System.out.println("\nRunning simulation with max capacity: " + maxCapacity);
            MartSimulation sim = new MartSimulation(totalSeconds, numCashiers,
                    customerProbability, maxItems, maxCapacity);
            sim.runSimulation();
            sim.printResults();
        }
    }
}
