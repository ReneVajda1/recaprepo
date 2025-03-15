package JavaMasterClass;

public class IsAlien {
    public static void main(String[] args) {

        boolean isAlien = false;
        if  (isAlien == false) {
            System.out.println("it is not an alien");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than top score and less than 100");
        }

        if ((topScore > 90 ) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an true");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("Its not supposed to happen");
        }


        // TERNARY OPERATOR

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true; // Declared before use

        if (isDomestic) {
            System.out.println("This car is domestic");
        }


        int ageOfClient = 20;
        String ageText = ageOfClient >= 18 ? "Over Eighteen" : "Still a kid ";


        double firstVariable = 20;
        double secondVariable = 80;
        double bothTogether = (firstVariable + secondVariable) * 100.00;
        System.out.println(bothTogether);
        double theRemainder = bothTogether % 40.00;
        System.out.println(theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ?  true : false;
        System.out.println(isNoRemainder);
        if (!isNoRemainder){
            System.out.println("got some remainder");
        }

    }




    int ageOfClient = 20;
    String ageText = ageOfClient >= 18 ? "Over Eighteen" : "Still a kid ";


}
