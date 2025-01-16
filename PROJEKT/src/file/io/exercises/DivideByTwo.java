package file.io.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByTwo {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        try {
            System.out.println("enter the number 1 >> ");
            int numberOne = scan1.nextInt();

            System.out.println("enter the number 2 >> ");
            int numberTwo = scan1.nextInt();

            int result = numberOne / numberTwo;
            System.out.println("The result of first Number divided by Second number is : ");
            System.out.println(numberTwo + " / " + numberTwo + " = " +result);

        } catch (ArithmeticException e) {
            System.out.println("You cant divide by ZERO");
        } catch (InputMismatchException e) {
            System.out.println("Enter proper format (the whole number) please");
        } finally {
            scan1.close();
        }

    }
}
