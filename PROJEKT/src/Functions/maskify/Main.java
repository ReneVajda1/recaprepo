package Functions.maskify;

import java.util.Scanner;

import static Functions.maskify.Maskify.maskify;

public class Main {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("enter whatever number");
        System.out.println(maskify(scan1.next()));
    }
}
