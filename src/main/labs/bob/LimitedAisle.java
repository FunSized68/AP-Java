package labs.bob;

import java.util.ArrayList;
import java.util.Random;

/**
 * A subclass of Aisle that limits the number of customers in line based on a maximum capacity.
 * Tracks the number of customers who refuse to join the line due to excessive length.
 *
 * @author [Your Name]
 */
public class LimitedAisle extends Aisle {
    private int maxCapacity; // Maximum allowable line length
    private int customersRefused; // Number of customers who refused to join the line

    /**
     * Construct a LimitedAisle with a specified maximum capacity.
     *
     * @param generator Random number generator for bagging times
     * @param maxCapacity Maximum number of customers allowed in line (including the one being checked out)
     */
    public LimitedAisle(Random generator, int maxCapacity) {
        super(generator); // Call the parent class constructor
        this.maxCapacity = maxCapacity;
        this.customersRefused = 0; // Initialize the counter
    }

    /**
     * Override addCustomer to only add a customer if the line length is below the maximum capacity.
     * If the line is at or above capacity, increment the customersRefused counter.
     *
     * @param customer The new customer to add
     */
    @Override
    public void addCustomer(Customer customer) {
        if (lineLength() < maxCapacity) {
            super.addCustomer(customer); // Add the customer using the parent class method
        } else {
            customersRefused++; // Increment the counter if the line is too long
        }
    }

    /**
     * Return the number of customers who refused to join the line due to excessive length.
     *
     * @return Number of customers refused
     */
    public int getCustomersRefused() {
        return customersRefused;
    }
}
