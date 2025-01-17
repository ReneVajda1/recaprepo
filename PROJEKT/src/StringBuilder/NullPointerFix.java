package StringBuilder;

public class NullPointerFix {
    public static void main(String[] args) {


            String str = "default";
            String strResult = str;

            if (strResult != null && strResult.equals("default")) { // Throws NPE if `str` is null
                System.out.println(str);
            } else {
                System.out.println("strResult is null or not matching");
            }



    }
}