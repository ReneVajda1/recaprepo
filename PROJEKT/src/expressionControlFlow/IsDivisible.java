package expressionControlFlow;

public class IsDivisible {
    public static void main(String[] args) {
        int j = 1521;
        boolean isDivisible = true;
        if (j % 5 == 0 || j % 3 == 0) {
            System.out.println(isDivisible);
        }
    }
}
