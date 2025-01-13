import java.util.Scanner;

public class BmiScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user for height in meters
        System.out.print("Enter your height in meters: ");
        var height = input.nextDouble();

        // Prompt the user for weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        var weight = input.nextDouble();

        // Calculate BMI
        var bmi = weight / (height * height);

        // Print the BMI result
        System.out.printf("Your BMI is: %.2f%n", bmi);
    }
}