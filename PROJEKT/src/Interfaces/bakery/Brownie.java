package Interfaces.bakery;

public class Brownie extends Cookie {

    @Override
    public String toString() {
        return "Brownie{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Brownie(int price, String name) {


    }
}
