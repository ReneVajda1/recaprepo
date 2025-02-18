package StringBuilder;

public class ReverseString {
    public static void main(String[] args) {
        String duckReversed = "kcuD";

        reverseString(duckReversed);

        stringBuilderReverse(duckReversed);
    }


    public static void reverseString(String input){
        StringBuilder sb = new StringBuilder(input);

        sb.reverse();
        System.out.println(sb.toString());
    }

    public static StringBuilder stringBuilderReverse(String input){
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        System.out.println(sb.toString());
        return sb;
    }
}
