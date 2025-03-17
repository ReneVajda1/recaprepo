package JavaMasterClass.methods;

import java.util.HashSet;
import java.util.Set;

public class Isogram {

    public static void main(String[] args) {

        System.out.println(isogram("carrot"));
        System.out.println(isogram("Readily"));
    }

    public static boolean isogram(String input) {

        if (input.length() == 0) {
            return false;
        }

        String cleanedInput = input.toLowerCase().replace(" ", "");

        Set<Character> seenLetters = new HashSet<>();

        for (int i = 0; i < cleanedInput.length(); i++) {
            char c = cleanedInput.charAt(i);


        if (seenLetters.contains(c)) {
            return false;

        }

        seenLetters.add(c);

        }

        return true;
    }
}


