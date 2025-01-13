import java.util.ArrayList;
import java.util.List;

public class ListIntroduction1 {
    public static void main(String[] args) {
        // Step 1: Create an empty list
        List<String> names = new ArrayList<>();

        // Step 2: Print out the number of elements in the list
        System.out.println(names.size()); // Output: 0

        // Step 3: Add "William" to the list
        names.add("William");

        // Step 4: Print out whether the list is empty or not
        System.out.println(!names.isEmpty()); // Output: false

        // Step 5: Add "John" and "Amanda" to the list
        names.add("John");
        names.add("Amanda");

        // Step 6: Print out the number of elements in the list
        System.out.println(names.size()); // Output: 3

        // Step 7: Print out the 3rd element
        System.out.println(names.get(2)); // Output: Amanda

        // Step 8: Iterate through the list and print each name
        for (String name : names) {
            System.out.println(name);
        }

        // Step 9: Iterate through the list with numbering
        for (int i = 0; i < names.size(); i++) {
            System.out.println((i + 1) + ". " + names.get(i));
        }

        // Step 10: Remove the 2nd element
        names.remove(1); // Removes "John"

        // Step 11: Iterate through the list in reverse order
        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }

        // Step 12: Remove all elements
        names.clear();

        // Step 13: Print out the number of elements in the list
        System.out.println(names.size()); // Output: 0
    }
}
