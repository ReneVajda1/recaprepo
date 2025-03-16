package JavaMasterClass;

public class ReverseString {
    public static void main(String[] args) {
        String string1 = "ASDF";
        System.out.println("123");
        System.out.println(string1);

        System.out.println(reverseString("123"));
        System.out.println(reverseString(string1));
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder(string);
        sb.reverse();
        return sb.toString();
    }
}
