package RandomExercises;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CuboidScanner {
    // Set the 3 sides to 10.4, 13.5, 8.2 and your program should
    // produce the following output:
    //
    // Surface Area: 672.76
    // Volume: 1151.28
    public static void main(String[] args) {
        System.out.println("Welcome to the cuboid calculator of Surface Area and Volume");
        Scanner surfaceAreaScanner = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double a = surfaceAreaScanner.nextDouble();
        System.out.println("Enter the length: ");
        double b = surfaceAreaScanner.nextDouble();
        System.out.println("Enter the height: ");
        double c = surfaceAreaScanner.nextDouble();

        double bottom = a*b;
        double top = bottom;
        double front = a*c;
        double back =front;
        double rightSide = c*b;
        double leftSide = rightSide;

        double surfaceArea = bottom+top+front+back+rightSide+leftSide;
        System.out.println("Surface Area: " + surfaceArea);
        double volume = a*b*c;
        System.out.println("Volume: " + volume);

    }

}
