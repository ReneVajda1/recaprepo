package Functions;

public class SumOfDigitsFunction {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
    }

    public static int sumOfDigits(int num){
        int sum = 0;
        while(num>0) {
            sum = sum + num % 10;
            num = num /10;
        }
        return sum;
    }
}
