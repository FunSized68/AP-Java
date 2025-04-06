package random;

public class Human {

    private String name = "";
    private String proffesion = "";

    public Human(String name, String proffesion) {
        this.name = name;
        this.proffesion = proffesion;
    }

    public String getName() {
        return name;
    }

    public String getProffesion() {
        return proffesion;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProffesion(String proffesion) {
        this.proffesion = proffesion;
    }

    public static void walk() {
        System.out.println("I am walking on 2 legs");
    }

    public String toString() {

        return name + " " + proffesion;

    }

    public static void main(String [] args) {
        Human c = new Human("Ishaan", "Student");
        c.getName();
    }

}
