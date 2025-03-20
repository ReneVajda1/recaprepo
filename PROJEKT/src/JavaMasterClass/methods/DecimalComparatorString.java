package JavaMasterClass.methods;

public class DecimalComparatorString {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        String str1 = String.format("%.3f",num1 );
        String str2 = String.format("%.3f",num1 );
        return str1.equals(str2);
    }

}


