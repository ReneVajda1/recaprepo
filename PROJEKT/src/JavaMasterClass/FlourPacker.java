package JavaMasterClass;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // Step 1: Check for invalid inputs
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        // Step 2: Use as many big bags (5kg each) as possible without exceeding goal
        int maxBigBagsUsed = goal / 5;  // Maximum possible big bags we can use
        int bigBagsUsed = Math.min(bigCount, maxBigBagsUsed);  // Use available big bags

        // Step 3: Calculate remaining kilos needed after using big bags
        int remainingKilos = goal - (bigBagsUsed * 5);

        // Step 4: Check if remaining kilos can be covered using small bags (1kg each)
        return remainingKilos <= smallCount;
    }

    public static void main(String[] args) {
        System.out.println(canPack(1,1,1));
    }
}