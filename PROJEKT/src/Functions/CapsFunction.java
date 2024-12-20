package Functions;

public class CapsFunction {
    public static void main(String[] args) {

       String shouting = caps("why are you shouting");
        System.out.println(shouting);

    }

    public static String caps(String s) {
        return s.toUpperCase();
    }

}
