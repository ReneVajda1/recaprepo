import java.util.Scanner;

public class Samohlasky {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadajte vetu: ");
        String input = scanner.nextLine().toLowerCase();

        int samohlasky = 0;
        int spoluhlasky = 0;


        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                if ("aeiouáäéíóúý".indexOf(ch) != -1) {
                    samohlasky++;
                } else {
                    spoluhlasky++;
                }
            }
        }

        System.out.println("Počet samohlások: " + samohlasky);
        System.out.println("Počet spoluhlások: " + spoluhlasky);

        scanner.close();
    }
}
