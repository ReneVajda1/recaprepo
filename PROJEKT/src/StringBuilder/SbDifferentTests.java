package StringBuilder;

public class SbDifferentTests {
    public static void main(String[] args) {
        String string = "hi";

        hello(string);
        System.out.println(hellohi(string));

    }

    public static void hello(String input){
        StringBuilder sb = new StringBuilder(input);

        sb.append(" hello");
        System.out.println(sb.toString());
    }

    public static StringBuilder hellohi(String input){
        StringBuilder sb = new StringBuilder(input);
        sb.append(" HelloHI");

        return sb;
    }
}
