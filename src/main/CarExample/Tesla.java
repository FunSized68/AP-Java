package CarExample;

public class Tesla extends Car {

    public Tesla() {
        super("Tesla");
    }

    @Override
    public void beep() {
        System.out.println("Glitch! Glitch!");
    }

    public void recharge() {
        System.out.println("I am recharging.");
    }
}
