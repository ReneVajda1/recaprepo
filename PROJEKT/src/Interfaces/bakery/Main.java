package Interfaces.bakery;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Cookie cookie = new Cookie();
//        Brownie brownie = new Brownie("Brownie", 240);
//        List<Cookie> cookies = new ArrayList<>();
        Store cookieStore = new Store();
        cookieStore.cookies.add(new Brownie(240,"Brownie"));
        cookieStore.cookies.add(new Brownie(240,"Muffin"));

        System.out.println(cookieStore.cookies);


    }
}
