package Enum.parkingLot;

import java.util.ArrayList;
import java.util.List;

public class Car {


    //    Parking Lot
//    Create a Car class with 2 enum properties
//    enum of car types
//    The types of these cars or vehicles is up to you
//    enum of colors
//    Create 256 Vehicles randomly and put them into a List
//    Count and Print the number of same vehicles for each type
//    Count and Print the number of same vehicles for each color
//    Print the most frequently occurring vehicle
    public enum carTypes{
    AUDI, LADA, OPEL, VOLKSWAGEN, BMW
    }
    public enum carColors{
        BLACK, WHITE, BLUE, GREEN, ORANGE, CRIMSON
    }

    public Car(carTypes carTypes, carColors carColors, carTypes type, carColors colors) {
        this.type = type;
        this.colors = colors;
    }

    private final carTypes type;
    private final carColors colors;
}
