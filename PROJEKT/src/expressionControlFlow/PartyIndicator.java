package expressionControlFlow;

import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the number of girls that attend the party");

            int numOfGirls = scan1.nextInt();

            System.out.println("Enter the number of boys that attend the party");
            int numOfBoys = scan1.nextInt();

            int numberOfPeopleTogether = numOfBoys + numOfGirls;

        if (numberOfPeopleTogether >= 20) {
            if (numOfGirls == numOfBoys) {
                System.out.println("The party is excellent!");
            } else {
                System.out.println("Quite a cool party!");
            }
        } else if (numOfGirls == 0) {
            System.out.println("Sausage party");
        } else {
            System.out.println("Average party...");
        }

    }
}