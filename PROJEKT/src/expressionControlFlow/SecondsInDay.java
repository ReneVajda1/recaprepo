package expressionControlFlow;

public class SecondsInDay {
    public static void main(String[] args) {

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int totalSecInDay = ( 24 * 60 *60);

        int secNow = (currentHours * 60 *60) + (currentMinutes * 60) + currentSeconds;

        int remainingSecInDay = totalSecInDay - secNow;
        System.out.println(remainingSecInDay);
    }
}
