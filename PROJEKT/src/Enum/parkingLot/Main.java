package Enum.parkingLot;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> listOfCars = new ArrayList<>();
        Random random = new Random();

        // Create 256 cars randomly
        for (int i = 0; i < 256; i++) {
            Car.carTypes randomType = Car.carTypes.values()[random.nextInt(Car.carTypes.values().length)];
            Car.carColors randomColor = Car.carColors.values()[random.nextInt(Car.carColors.values().length)];
            listOfCars.add(new Car(randomType, randomColor));
        }

        // Count the number of cars of each type
        Map<Car.carTypes, Integer> typeCount = new HashMap<>();
        for (Car car : listOfCars) {
            typeCount.put(car.getType(), typeCount.getOrDefault(car.getType(), 0) + 1);
        }

        System.out.println("Count of cars by type:");
        for (Map.Entry<Car.carTypes, Integer> entry : typeCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Count the number of cars of each color
        Map<Car.carColors, Integer> colorCount = new HashMap<>();
        for (Car car : listOfCars) {
            colorCount.put(car.getColor(), colorCount.getOrDefault(car.getColor(), 0) + 1);
        }

        System.out.println("\nCount of cars by color:");
        for (Map.Entry<Car.carColors, Integer> entry : colorCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Find the most frequently occurring car type
        Car.carTypes mostFrequentType = null;
        int maxTypeCount = 0;

        for (Map.Entry<Car.carTypes, Integer> entry : typeCount.entrySet()) {
            if (entry.getValue() > maxTypeCount) {
                maxTypeCount = entry.getValue();
                mostFrequentType = entry.getKey();
            }
        }

        System.out.println("\nMost frequently occurring car type: " + mostFrequentType + " with " + maxTypeCount + " cars.");

        // Print all the cars
        System.out.println("\nList of all cars:");
        for (Car car : listOfCars) {
            System.out.println(car);
        }
    }
}
