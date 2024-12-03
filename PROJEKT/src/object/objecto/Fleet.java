public class FleetOfThings {

    public static void main(String[] args) {
        // Step 1: Create a new Fleet object
        Fleet fleet = new Fleet();

        // Step 2: Add Things to the fleet
        Thing thing1 = new Thing("Get milk"); // Create Thing "Get milk"
        Thing thing2 = new Thing("Remove the obstacles"); // Create Thing "Remove the obstacles"
        Thing thing3 = new Thing("Stand up"); // Create Thing "Stand up"
        Thing thing4 = new Thing("Eat lunch"); // Create Thing "Eat lunch"

        // Step 3: Add the things to the fleet
        fleet.add(thing1);
        fleet.add(thing2);
        fleet.add(thing3);
        fleet.add(thing4);

        // Step 4: Mark specific Things as completed
        thing3.complete(); // "Stand up" completed
        thing4.complete(); // "Eat lunch" completed

        // Step 5: Print the Fleet to check the status of Things
        System.out.println(fleet);
    }
}
