package Recursion;

public class CountBackwards {
    public static void main(String[] args) {
countBackwards(10);
    }
    public static void countBackwards(int n){
        if (n == 0) {
            System.out.println("Done!");
        } else {
            n--;
            countBackwards(n);

        }
    }
}
