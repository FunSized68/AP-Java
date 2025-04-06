package CarExample;

public abstract class Car {

    private String name;

    public Car(String name) {
        this.name = name;
    }

    public void beep() {
        System.out.println("BEEP!");
    }

    public String toString() {
        return "I am a " + name + ".";
    }

}
