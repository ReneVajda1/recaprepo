package file.io.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;
//Exercise: Array Index Access
//Write a program that:
//
//Asks the user for the size of an array.
//Prompts the user to input numbers to fill the array.
//Asks the user to provide an index to access a value in the array.
//Prints the value at the provided index.
//Handles these scenarios:
//ArrayIndexOutOfBoundsException: If the user provides an invalid index (e.g., too large or negative), print an error message.
//InputMismatchException: If the user enters invalid input (e.g., a string instead of a number), print an error message.
public class ArrayIndexAccessUpgraded {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        while(true){
            try{
                System.out.println("enter the lenght of array please ");
                int size = scan1.nextInt();

                if (size < 0 ) {
                    System.out.println("dont enter negative please");
                    throw new NegativeArraySizeException();
                }

                int[] userInputArray  = new int[size];

                int sum = 0;
                System.out.println( "Enter " + userInputArray.length + " Integers to fill the array: ");
                for (int i = 0; i < userInputArray.length; i++) {
                    userInputArray[i] = scan1.nextInt();
                    sum += userInputArray[i];
                    System.out.println("enter the number " + userInputArray[i] );
                }

                break;
            } catch ( NegativeArraySizeException e){
                System.out.println("Error: Enter only non negative numbers ");
                scan1.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: Enter ONLY single while number ");
                scan1.nextLine();
            }

        }
        scan1.close();
    }

}

