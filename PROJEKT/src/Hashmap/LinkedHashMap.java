package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMap {

    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("STRING ONE", "STRING TWO");
        m.put("3", "3");
        m.put("4", "4");

        m.containsKey("3");

    }
}
