package JavaMasterClass.methods;

public class OverloadingSecondAndMinutesChallenge {
    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65,45));
        System.out.println(getDurationString(65,145));
        System.out.println(getDurationString(65,45));
        System.out.println(3945.3);
    }

    public static String getDurationString(int seconds) {
        if ( seconds < 0 ) {
            return " invalid data for seconds( " + seconds + " , must be positive integer value";
        }

        int minutes = seconds / 60;
        return getDurationString(seconds / 60, seconds % 60);
    }

    
    public static String getDurationString(int minutes, int seconds){
        if ( seconds < 0 ) {
            return " invalid data for seconds( " + seconds + " , must be positive integer value";
        }

        if ( seconds < 0 || seconds > 59 ) {
            return " invalid data for seconds( " + seconds + " , must be value between 0 and 59";
        }

    int hours = minutes / 60;

    int remainingMinutes = minutes % 60;

    return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }



}
