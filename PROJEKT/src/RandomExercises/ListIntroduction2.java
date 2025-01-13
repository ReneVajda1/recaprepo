import java.util.ArrayList;
import java.util.List;

public class ListIntroduction2 {
    public static void main(String[] args) {
        List<String> ListA = new ArrayList<>();

        ListA.add("Apple");
        ListA.add("Avocado");
        ListA.add("Blueberries");
        ListA.add("Durian");
        ListA.add("Lychee");
        System.out.println(" ");


        List<String> ListB = new ArrayList<>(ListA);
        ListB.get(2);





    }
}
