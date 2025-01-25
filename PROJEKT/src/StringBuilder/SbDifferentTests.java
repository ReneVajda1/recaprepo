package StringBuilder;

public class SbDifferentTests {
    public static void main(String[] args) {
        String string = "hi";

        hello(string);
    }

    public static void hello(String input){
        StringBuilder sb = new StringBuilder(input);

        sb.append(" hello");
        System.out.println(sb.toString());
    }

    public static void hellooo(String input){
        StringBuilder sb = new StringBuilder(input);

        
        sb.append(" hello");
        System.out.println(sb.toString());
    }
}
