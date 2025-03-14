package JavaMasterClass;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        // Step 1: Handle invalid input (negative numbers, 0, or 1)
        if (number < 2) {
            return -1;
        }

        int largestPrime = -1;

        // Step 2: Remove all factors of 2 (smallest prime)
        while (number % 2 == 0) {
            largestPrime = 2;
            number /= 2;
        }

        // Step 3: Check for odd prime factors from 3 to sqrt(number)
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                largestPrime = i;
                number /= i;
            }
        }

        // Step 4: If number is still greater than 2, it is prime itself
        if (number > 2) {
            largestPrime = number;
        }

        return largestPrime;
    }
    public static void main(String[] args) {
        // Test cases
        System.out.println(getLargestPrime(21));   // Output: 7
        System.out.println(getLargestPrime(217));  // Output: 31
        System.out.println(getLargestPrime(0));    // Output: -1
        System.out.println(getLargestPrime(45));   // Output: 5
        System.out.println(getLargestPrime(-1));   // Output: -1
    }
}