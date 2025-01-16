package file.io.exercises;


import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("enter the number ");
            int divisor = scanner.nextInt();
            double result = 12 / divisor; // If the input value for divisor was 0 the program breaks
            System.out.println(result); // The program doesn't reach this line if the input was 0
        } catch (ArithmeticException e){
            System.out.println("cant divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("no decimals please");
        }
    }

}

