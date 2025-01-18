package expressionControlFlow;

import java.util.Scanner;

public class PrintBigger {
    // Write a program that asks for two numbers and prints the bigger one.
    // If they are equal, it prints the second one.
    //
    // Example
    //
    // Please enter a number: 5
    // Please enter a number: 13
    // 13

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int firstNumber = scan1.nextInt();
        System.out.println("enter the second number");
        int secondNumber = scan1.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("firstnumber is bigger " + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println(" second number is bigger " + secondNumber);
        } else if (secondNumber == firstNumber) {
            System.out.println("second number is same as "+ "first number which is " + firstNumber
                    + "but i print it so the winner is >>>>>> " + secondNumber +  " <<<<<<");
        }
    }
}
