package StringBuilder;

public class SbDifferentTests {
    public static void main(String[] args) {
        String string = "hi";

        hello1(string);
        System.out.println(hello2(string));
        hello3(string);

      // wont work  System.out.println(hello3(string));

        hello4Reversed(string);

        hello5ReverseBack(string);

    }

    public static void hello1(String input){
        StringBuilder sb = new StringBuilder(input);

        sb.append(" hello");
        System.out.println(sb.toString());
    }

    public static StringBuilder hello2(String input){
        StringBuilder sb = new StringBuilder(input);
        sb.append(" HelloHI");

        return sb;
    }

    public static void hello3(String input){
        StringBuilder sb = new StringBuilder(input);
        sb.append(" helloooo");
        System.out.println(sb.append(" helloooo") + sb.toString());
    }

    public static void hello4Reversed(String input){
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        System.out.println(sb.toString());
    }

    public static StringBuilder hello5ReverseBack(String input){
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        return  sb;
    }
}
