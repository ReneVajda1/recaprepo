package file.io.exercises;

import java.util.Scanner;

public class DivideByZero2 {
    public static void main(String[] args) {
        // Create a `divide10By` function that divides number 10 (integer)
        // by an integer number that's passed as a parameter and prints the result.
        // The result of the division should be an integer as well (not a floating point number).
        // It should print "fail" if the parameter is 0

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter the number:");
        try {
            int divisor = scan1.nextInt();
            int ultimateResult = divide10By(divisor);
            System.out.println(ultimateResult);
        } catch (ArithmeticException e) {
            System.out.println("fail");
        } catch (Exception e) {
            System.out.println("Invalid input");
        } finally {
            scan1.close();
        }
    }

    
//        // Examples:
//        divide10By(2); // should print 5
//        divide10By(5); // should print 2
//        divide10By(4); // should print 2
//        divide10By(3); // should print 3
//        divide10By(0); // should print fail
    public static int divide10By(int i) {
        return 10/i;
    }
}