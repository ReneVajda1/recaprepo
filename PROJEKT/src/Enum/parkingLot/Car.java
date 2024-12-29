package Enum.parkingLot;

public class Car {
    public enum carTypes {
        AUDI, LADA, OPEL, VOLKSWAGEN, BMW
    }

    public enum carColors {
        BLACK, WHITE, BLUE, GREEN, ORANGE, CRIMSON
    }

    private final carTypes type;
    private final carColors color;

    // Constructor
    public Car(carTypes type, carColors color) {
        this.type = type;
        this.color = color;
    }

    public carTypes getType() {
        return type;
    }

    public carColors getColor() {
        return color;
    }

    @Override
    public String toString() {
        return type + " (" + color + ")";
    }
}
