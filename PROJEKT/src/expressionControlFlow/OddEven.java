package expressionControlFlow;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("eneter the number: ");
        int userInput = scan1.nextInt();

        if (userInput  % 2 == 0) {
            System.out.println("the number is even");
        } else {
            System.out.println("the number is odd");
        }
    }
}
