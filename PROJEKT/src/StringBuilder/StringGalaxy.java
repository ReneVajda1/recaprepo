package StringBuilder;

import java.util.regex.Pattern;

public class StringGalaxy {
    public static void main(String... args){
        String example = "In a dishwasher far, far away";

        // Below is a famous sentence from the beginning of a famous movie, but it has a problem.
        // Someone played a prank on us and replaced the word "galaxy" with "dishwasher".
        // Please fix the sentence so that the code prints "In a galaxy far, far away" to the console

        System.out.println(example + " 1 ");

        galaxyReplace(example + " 2 ");



        galaxyReplace(example + " 555");

        StringBuilder sb2 = new StringBuilder(example);
//        example.replace("far","not far " + " 3 ");
//        System.out.println(example + " 5 ");
//
//
//        System.out.println(sb2.replace(5,11,"FAR FAR" + " 4 ")  );
//
//
        System.out.println(Pattern.compile("dishwasher").matcher(sb2).replaceAll("galaxy"));
    }

    public static void galaxyReplace(String input){
        StringBuilder sb = new StringBuilder(input);

            sb.replace(4,11,"asdf");
            System.out.println(sb.toString());

    }
}