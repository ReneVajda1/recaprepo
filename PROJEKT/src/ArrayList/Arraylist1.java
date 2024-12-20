package ArrayList;

import java.util.ArrayList;

public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> t = new ArrayList<Integer>();
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        t.set(1,5);
        System.out.println(t.subList(1,3));
    }
}
