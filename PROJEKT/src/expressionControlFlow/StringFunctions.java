package expressionControlFlow;

public class StringFunctions {
    public static void main(String[] args) {
        // 1. length() - Returns the length of the string.
        String str = "Hello";
        System.out.println(str.length()); // Output: 5

// 2. charAt(int index) - Returns the character at the specified index.
        str = "Hello";
        System.out.println(str.charAt(1)); // Output: e

// 3. substring(int beginIndex) / substring(int beginIndex, int endIndex) - Extracts a portion of the string.
        str = "Hello, World!";
        System.out.println(str.substring(7)); // Output: World!
        System.out.println(str.substring(0, 5)); // Output: Hello

// 4. indexOf(String str) / indexOf(char ch) - Returns the index of the first occurrence of a character or substring.
        str = "Hello, World!";
        System.out.println(str.indexOf('o')); // Output: 4
        System.out.println(str.indexOf("World")); // Output: 7

// 5. lastIndexOf(String str) / lastIndexOf(char ch) - Returns the index of the last occurrence of a character or substring.
        str = "Hello, Hello!";
        System.out.println(str.lastIndexOf("Hello")); // Output: 7

// 6. toUpperCase() / toLowerCase() - Converts the string to upper or lower case.
        str = "Hello";
        System.out.println(str.toUpperCase()); // Output: HELLO
        System.out.println(str.toLowerCase()); // Output: hello

// 7. equals(String str) - Compares two strings for equality.
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println(str1.equals(str2)); // Output: false

// 8. equalsIgnoreCase(String str) - Compares two strings, ignoring case.
        str1 = "Hello";
        str2 = "hello";
        System.out.println(str1.equalsIgnoreCase(str2)); // Output: true

// 9. compareTo(String str) / compareToIgnoreCase(String str) - Compares two strings lexicographically.
        str1 = "Apple";
        str2 = "Banana";
        System.out.println(str1.compareTo(str2)); // Output: -1

// 10. trim() - Removes leading and trailing whitespace.
        str = "   Hello   ";
        System.out.println(str.trim()); // Output: Hello

// 11. replace(char oldChar, char newChar) / replace(CharSequence oldSeq, CharSequence newSeq) - Replaces characters or substrings.
        str = "Hello, World!";
        System.out.println(str.replace('o', 'a')); // Output: Hella, Warld!
        System.out.println(str.replace("World", "Java")); // Output: Hello, Java!

// 12. replaceAll(String regex, String replacement) - Replaces all matches of a regex with a replacement.
        str = "1,2,3,4";
        System.out.println(str.replaceAll(",", "-")); // Output: 1-2-3-4

// 13. replaceFirst(String regex, String replacement) - Replaces the first match of a regex with a replacement.
        str = "1,2,3,4";
        System.out.println(str.replaceFirst(",", "-")); // Output: 1-2,3,4

// 14. split(String regex) - Splits the string into an array using a regex delimiter.
        str = "apple,banana,cherry";
        String[] fruits = str.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit); // Output: apple banana cherry
        }

// 15. join(CharSequence delimiter, CharSequence... elements) - Joins elements with a delimiter into a single string.
        String result = String.join(", ", "apple", "banana", "cherry");
        System.out.println(result); // Output: apple, banana, cherry

// 16. contains(CharSequence seq) - Checks if the string contains a substring.
        str = "Hello, World!";
        System.out.println(str.contains("World")); // Output: true

// 17. startsWith(String prefix) / endsWith(String suffix) - Checks if the string starts or ends with a specific substring.
        str = "Hello, World!";
        System.out.println(str.startsWith("Hello")); // Output: true
        System.out.println(str.endsWith("!")); // Output: true

// 18. valueOf() - Converts other types (int, double, char, etc.) to a string.
        int num = 123;
        str = String.valueOf(num);
        System.out.println(str); // Output: "123"

// 19. toCharArray() - Converts the string to a char array.
        str = "Hello";
        char[] chars = str.toCharArray();
        for (char c : chars) {
            System.out.println(c); // Output: H e l l o
        }

// 20. matches(String regex) - Checks if the string matches a regex.
        str = "12345";
        System.out.println(str.matches("\\d+")); // Output: true

// 21. isEmpty() / isBlank() - Checks if the string is empty or contains only whitespace.
        str = "";
        System.out.println(str.isEmpty()); // Output: true
        str = "   ";
        System.out.println(str.isBlank()); // Output: true

// 22. repeat(int count) - Repeats the string `count` times.
        str = "Hi";
        System.out.println(str.repeat(3)); // Output: HiHiHi

// 23. intern() - Returns the canonical representation of the string.
        str = new String("Hello").intern();
        System.out.println(str); // Output: Hello

    }
}
