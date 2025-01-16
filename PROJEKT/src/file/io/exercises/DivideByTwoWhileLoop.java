package file.io.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByTwoWhileLoop {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        while (true){
            try {
                System.out.println("please enter the first number: ");
                int firstNumber = scan1.nextInt();

                System.out.println("please enter the second number: ");
                int secondNumber = scan1.nextInt();

                int result = firstNumber / secondNumber;
                System.out.println("The result of first Number divided by Second number is : ");
                System.out.println(firstNumber + " / " + secondNumber + " = " +result);
                break;
            } catch (ArithmeticException e) {
                System.out.println("no 0 division please");
                System.out.println(" ");
                scan1.nextLine();
            } catch(InputMismatchException e) {
                System.out.println( "enter the numbers only please");
                System.out.println(" ");
                scan1.nextLine();
            }

        }

        scan1.close();
    }
}
