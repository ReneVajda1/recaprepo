package JavaMasterClass.methods;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,-1,0));
    }

    public static boolean hasEqualSum(int num1, int num2, int num3){
        int sumOfFirstAndSecondInt = num1 + num2;
        if (sumOfFirstAndSecondInt == num3){
            return true;
        } else {
            return false;
        }
    }
}
