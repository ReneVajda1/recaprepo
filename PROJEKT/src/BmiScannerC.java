import java.util.Scanner;

public class BmiScannerC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for height in meters
        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();

        // Prompt the user for weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Print the BMI result and category
        System.out.printf("Your BMI is: %.2f%n", bmi);
        
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        // Close the scanner
        input.close();
    }
}