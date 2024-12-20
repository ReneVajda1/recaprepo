package Functions;

public class ArrayFunction {
    public static void main(String[] args) {
        int[] awesomeArray = givemeArrayFromInts(3,7,1);
        System.out.println(awesomeArray[0]);
        System.out.println(awesomeArray[1]);
        System.out.println(awesomeArray[2]);
    }

    public static int[] givemeArrayFromInts(int a, int b , int c){
        int[] array = new int[3];
        array[0] = a;
        array[1] = a;
        array[2] = a;
        return array;
    }
}
