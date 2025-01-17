package file.io.exercises;

import java.util.Scanner;



public class CountOddNumbersBelowN2 {
    //Given a number n, return the number of positive odd numbers below n, EASY!
    //
    //Examples (Input -> Output)
    //7  -> 3 (because odd numbers below 7 are [1, 3, 5])
    //15 -> 7 (because odd numbers below 15 are [1, 3, 5, 7, 9, 11, 13])
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.println("please enter the number");
        int userInput = scan1.nextInt();

        int result = oddCount(userInput);

        System.out.println(result);
    }

    public static int oddCount(int i ){
        return i / 2;
    }
}
