public class Animal {
    // Private attributes
    private int hunger;
    private int thirst;

    // Constructor
    public Animal() {
        this.hunger = 50;
        this.thirst = 50;
    }

    // Getter for hunger
    public int getHunger() {
        return hunger;
    }

    // Setter for hunger
    public void setHunger(int hunger) {
        if (hunger >= 0) { // Ensure hunger is not negative
            this.hunger = hunger;
        }
    }

    // Getter for thirst
    public int getThirst() {
        return thirst;
    }

    // Setter for thirst
    public void setThirst(int thirst) {
        if (thirst >= 0) { // Ensure thirst is not negative
            this.thirst = thirst;
        }
    }

    // Other methods
    public void eat() {
        if (hunger > 0) hunger--;
    }

    public void drink() {
        if (thirst > 0) thirst--;
    }

    public void play() {
        hunger++;
        thirst++;
    }

    public static void main(String[] args) {
        // Create an Animal instance
        Animal animal = new Animal();

        // Using getters to check values
        System.out.println("Initial Hunger: " + animal.getHunger());
        System.out.println("Initial Thirst: " + animal.getThirst());

        // Using setters to modify values
        animal.setHunger(40);
        animal.setThirst(30);

        System.out.println("\nAfter setting values:");
        System.out.println("Hunger: " + animal.getHunger());
        System.out.println("Thirst: " + animal.getThirst());
    }
}
