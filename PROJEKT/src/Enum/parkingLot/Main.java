package Enum.parkingLot;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Main {


    public static void main(String[] args) {
        List<Car> listOfCars = new ArrayList<>();
         Random random = new Random();
        for (int i = 0; i < 256; i++) {
            Car.carTypes randomType = Car.carTypes.values()[random.nextInt(Car.carTypes.values().length)];
            Car.carColors randomColor = Car.carColors.values()[random.nextInt(Car.carColors.values().length)];

            listOfCars.add(new Car(randomType, randomColor));
        }

        System.out.println("asdf string");
        for (int i = 0; i < listOfCars.size(); i++) {
            System.out.println(listOfCars.get(i));

        }
    }
}

