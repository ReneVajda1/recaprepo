package JavaMasterClass.methods;

public class Challenge {

    public static void main(String[] args) {

        displayHighScorePosition("Tim",2);

        int highScorePosition = calculateHighScorePosition1(1500);
        int highScorePosition2 = calculateHighScorePosition2(1500);

        System.out.println(" asdf" + highScorePosition);
        System.out.println(" asdf" + highScorePosition2);


        System.out.println(" ... ");

        int highScorePosition3 = calculateHighScorePosition2(1500);
        displayHighScorePosition("Tim", highScorePosition3);

        highScorePosition3 = calculateHighScorePosition2(1000);
        displayHighScorePosition("Bob", highScorePosition3);

        highScorePosition3 = calculateHighScorePosition2(500);
        displayHighScorePosition("Percy", highScorePosition3);

        highScorePosition3 = calculateHighScorePosition2(100);
        displayHighScorePosition("Gilbert", highScorePosition3);

        highScorePosition3 = calculateHighScorePosition2(25);
        displayHighScorePosition("James", highScorePosition3);


        System.out.println("......");

        int highScorePosition4 = calculateHighScorePosition1(1500);
        displayHighScorePosition("Tim", highScorePosition4);

        highScorePosition4 = calculateHighScorePosition1(1000);
        displayHighScorePosition("Bob", highScorePosition4);

        highScorePosition4 = calculateHighScorePosition1(500);
        displayHighScorePosition("Percy", highScorePosition4);

        highScorePosition4 = calculateHighScorePosition1(100);
        displayHighScorePosition("Gilbert", highScorePosition4);

        highScorePosition4 = calculateHighScorePosition1(25);
        displayHighScorePosition("James", highScorePosition4);


        System.out.println("......");

        int highScorePosition5 = calculateHighScorePosition3(1500);
        displayHighScorePosition("Tim", highScorePosition5);

        highScorePosition5 = calculateHighScorePosition3(1000);
        displayHighScorePosition("Bob", highScorePosition5);

        highScorePosition5 = calculateHighScorePosition3(500);
        displayHighScorePosition("Percy", highScorePosition5);

        highScorePosition5 = calculateHighScorePosition3(100);
        displayHighScorePosition("Gilbert", highScorePosition5);

        highScorePosition5 = calculateHighScorePosition3(25);
        displayHighScorePosition("James", highScorePosition5);
    }


    public static void displayHighScorePosition(String name, int position) {
        System.out.println( name + " managed to get int position " +
                position + " on the high score list");
    }

    public static int calculateHighScorePosition1 (int playersScore) {
        int result;
        if (playersScore >= 1000) {
            result = 1;
        } else if ((playersScore >= 500) && (playersScore < 1000)) {
            result = 2;
        } else if ((playersScore >= 100) && (playersScore < 500)) {
            result = 3;
        } else
            result = 4;

        return  result;
    }

    public static int calculateHighScorePosition2 (int playersScore) {
        if (playersScore >= 1000) {
            return 1;
        } else if (playersScore >= 500) {
            return 2;
        } else if (playersScore >= 100) {
            return 3;

        }
        return 4;
    }

    public static int calculateHighScorePosition3 (int playersScore) {
        int result = 4;
        if (playersScore >= 1000) {
            result = 1;
        } else if ((playersScore >= 500) && (playersScore < 1000)) {
            result = 2;
        } else if ((playersScore >= 100) && (playersScore < 500)) {
            result = 3;
        }

        return  result;
    }

}


