package expressionControlFlow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileTrue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       while(true) {
           try {
               int userInput = scanner.nextInt();
               ;
               int i = 0;
               while (userInput > i) {
                   System.out.println(" hello ");
                   i++;
               }
               break;
           } catch (InputMismatchException e ) {
               System.out.println("enter the value in numbers");
               scanner.nextLine();
           }
       }
       scanner.close();
    }
}
