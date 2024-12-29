package Interfaces.bakery;

public class Cookie {
    String name;
    int price;

    @Override
    public String toString() {
        return "Cookie{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
