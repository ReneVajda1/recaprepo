package Builder.CarBuilder;

public class CarBuilder {
    public static void main(String[] args) {

        Car car = Car.builder()
                .name("Toyota")
                .year(2007)
                .sunroof(true)
                .model("75214-25")
                .build();

        System.out.println(car);
    }
}


