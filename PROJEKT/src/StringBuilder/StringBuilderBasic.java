package StringBuilder;

public class StringBuilderBasic {

    public static void main(String[] args) {

        String string = "Duck";

    }

    public static void buildAString(String input){
        StringBuilder sb = new StringBuilder(input);
        sb.append("123");
        sb.delete(0,4);
        sb.reverse();
        sb.insert(3,"insertedTXT");
        sb.deleteCharAt(23);
        sb.replace(3,15,"sdfgReplacedTEXT");
        System.out.println(sb.toString());
    }
}
