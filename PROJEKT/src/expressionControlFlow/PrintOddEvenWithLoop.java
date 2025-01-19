package expressionControlFlow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintOddEvenWithLoop {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        while(true){
            try {
                System.out.println("enter the first number: ");
                int firstNumber = scan1.nextInt();

                if (firstNumber % 2 == 0) {
                    for (int i = 0; i < firstNumber+2; i+=2) {
                        System.out.println("here are even numbers: "+ i);
                    }
                } else {
                    for (int i = 1; i < firstNumber; i+=2) {
                        System.out.println("here are odd numbers: " + i);
                    }
                }
                break;
            } catch (InputMismatchException e ) {
                String errorMessage = "|>>!! ERROR: ENTER ONLY NUMERIC VALUES PLEASE !!<<|  -  ";
                System.out.println(errorMessage.repeat(3));
                scan1.nextLine();
            }
        }
        scan1.close();
    }
}
