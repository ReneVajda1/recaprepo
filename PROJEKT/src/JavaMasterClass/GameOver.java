package JavaMasterClass;

public class GameOver {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if ((score < 5000) && score > 1000){
            System.out.println("Your score was less than 5000 and more than 1000");
        } else if (score < 1000){
            System.out.println("your score is less than 1000");
        } else {
            System.out.println("You got here");
        }
    }
}
