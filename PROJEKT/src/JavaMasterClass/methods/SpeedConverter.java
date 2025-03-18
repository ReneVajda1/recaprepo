package JavaMasterClass.methods;

public class SpeedConverter {
    public static void main(String[] args) {


        System.out.println("....");

        printConversion2(1.5);
        printConversion2(10.25);
        printConversion2(-5.6);
        printConversion2(25.42);
        printConversion2(75.114);
        printConversion2(0);
        printConversion2(-2);

    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }
         double number = 0.621371;
         double oneMilePerHour = kilometersPerHour * number;
         return Math.round(oneMilePerHour);
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour > 0) {
            double milesPerhourFromKmParameter = kilometersPerHour * 1.60934;
            long roundedMilesPerHour = Math.round(milesPerhourFromKmParameter);
            System.out.println(roundedMilesPerHour + "km/h = " + kilometersPerHour + " mi/h");
        }
    }

    public static void printConversion2(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

}
