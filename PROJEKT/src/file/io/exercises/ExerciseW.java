import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerciseW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
        try {
            System.out.print("Enter the size of the array: ");
            int cislo = scanner.nextInt();

            int[] allNum = new int[cislo];
            int[] evenNum = new int[cislo];
            int[] oddNum = new int[cislo];

            int oddPocitadlo = 0;
            int evenPocitadlo = 0;

            for (int i = 0; i < cislo; i++) {
                System.out.println("Enter number " + (i + 1) + ": ");
                allNum[i] = scanner.nextInt();

                if (allNum[i] % 2 == 0) {
                    evenNum[evenPocitadlo++] = allNum[i];
                } else {
                    oddNum[oddPocitadlo++] = allNum[i];
                }
            }

            System.out.println("Odd numbers:");
            for (int i = 0; i < oddPocitadlo; i++) {
                System.out.print(oddNum[i] + " ");
            }
            System.out.println();

            System.out.println("Even numbers:");
            for (int i = 0; i < evenPocitadlo; i++) {
                System.out.print(evenNum[i] + " ");
            }
            System.out.println();
            break;


        } catch (InputMismatchException e ) {
            System.out.println("enter the numbers only");
            scanner.nextLine();
        }

        }

        scanner.close();
    }
}
