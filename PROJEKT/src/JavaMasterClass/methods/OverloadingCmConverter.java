package JavaMasterClass.methods;

public class OverloadingCmConverter {
    public static void main(String[] args) {

        System.out.println(heightInFeets(6,5));

    }

    public static double convertToCentimeters(int entireHeightInInches){
        return entireHeightInInches * 2.54;
    }

    public static double convertToCentimeters(double entireHeightInInches){
        return entireHeightInInches * 2.54;
    }

    public static double heightInFeets(int heightInFeet, int remainingHeightInInches){
        double convertedToInchesOnly = convertToCentimeters(heightInFeet
                * 12 + remainingHeightInInches);
        return convertedToInchesOnly;
    }


}
