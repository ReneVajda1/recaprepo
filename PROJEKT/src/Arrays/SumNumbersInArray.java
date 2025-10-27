package Arrays;

import java.util.Arrays;


public class SumNumbersInArray {
    public static void main(String[] args) {

        int[] sumNum = {10,20,30,40};

        for (int i = 0; i < sumNum.length; i++) {

        }
        System.out.println(Arrays.stream(sumNum).sum());


    }
}
