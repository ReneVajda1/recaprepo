package JavaMasterClass.methods;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUP2(true,1));
        System.out.println(shouldWakeUP2(false,2));
        System.out.println(shouldWakeUP2(true,8));
        System.out.println(shouldWakeUP2(true,-1));
    }

    public static boolean shouldWakeUP2(boolean barking, int hoursOfDay) {
        if (hoursOfDay < 0 || hoursOfDay > 23) {
            return false;
        }
        if (barking == true && (hoursOfDay < 8 || hoursOfDay > 22)) {
            return true;
        }
        return false;
    }
}
