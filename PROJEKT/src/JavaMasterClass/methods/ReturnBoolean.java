package JavaMasterClass.methods;

public class ReturnBoolean {

    public static void main(String[] args) {

        int age = 34;
        int age2 = 14;

        System.out.println(isTooYoung(age));
        System.out.println(isTooYoung(age2));
    }

    public static boolean isTooYoung(int age ){
        boolean passTheAgeRequirement = false;
        if (age >= 18) {
            passTheAgeRequirement = true;
        }

        if (passTheAgeRequirement == true) {
            System.out.println( " Age is above 18"+ " " + age + " all good ");
        } else {
            System.out.println( " Too young" + " " + age + " not enough");
        }

        return passTheAgeRequirement;
    }
}
