import org.w3c.dom.ls.LSOutput;

import java.time.MonthDay;
import java.util.Scanner;

public class TriangleLoop {
    // *
    // **
    // ***
    // ****
    // *****
    // ******
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the matrix: ");
        int numberOfStars = scan1.nextInt();

         for (int i = 1; i < numberOfStars; i++) {
             for (int j = 0; j < i; j++) {
                 System.out.print("*");
             }
             System.out.println();
        }
    }
}
