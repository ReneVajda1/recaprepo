package Arrays;

import java.util.ArrayList;

public class ArrayListInt {
    public static void main(String[] args) {
        ArrayList<Integer> asdfList = new ArrayList<>();
        asdfList.add(90);
        asdfList.add(85);
        asdfList.add(70);

        for (int i = 0; i < asdfList.size(); i++) {
            System.out.printf(" asdfLISTO #%d == %d\n ",i, asdfList.get(i));
        }

    }
}
