package RandomExercises;

import java.util.Scanner;

public class SumFunction {
    public static void main(String[] args) {
        // Create the usual class wrapper (Sum) and main method on your own
        // Write a function called `sum()` that returns the sum of numbers from zero
        // to the given parameter
        //
        // Example: sum(5) = 0 + 1 + 2 + 3 + 4 + 5 = 15
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the number");
        int number =scan1.nextInt();
        int vysledok = sum(number);
        System.out.println("("+(number)+")"+"sum"+" = " + vysledok);
        scan1.close();
    }
    public static int sum(int cislo) {
        int šicko = 0;
        for (int i = 0; i <=cislo ; i++) {
            System.out.print(" + " + i);
            šicko += i;
        }
        return šicko;
    }
}
