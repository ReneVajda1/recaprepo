package expressionControlFlow;

public class Arrays {
    public static void main(String[] args) {
        // two ways to initialize aray
        // 1
        int[]         ages = {17, 21, 18, 19 }; // any amount of int separated by ,
        // 2
        boolean[] students = new boolean[4];

        students[0] = true;
        students[1] = false;
        students[2] = false;
        students[3] = true;

        // prints all within array
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
    }
}
