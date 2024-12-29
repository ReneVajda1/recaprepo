package Interfaces.bakery;

import java.util.ArrayList;
import java.util.List;

public class Store {

    List<Cookie> cookies = new ArrayList<>();

    @Override
    public String toString() {
        return "Store{" +
                "cookies=" + cookies +
                '}';
    }
}
