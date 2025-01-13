package RandomExercises;

public class CodingHrs {

    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        int attendeeCodesDaily = 6;
        int semesterInWeeks = 17;

        int workHoursWeekly = 52;

        int workDaysInWeekly = 52;


        int totalCodingHoursByAtendee = attendeeCodesDaily*workDaysInWeekly*semesterInWeeks;

        int totalWorkHoursInSemester = workHoursWeekly * semesterInWeeks;

        double codingPercentage = ((double) totalCodingHoursByAtendee / totalWorkHoursInSemester) * 100;
        System.out.println("Percentage of coding hours: " + codingPercentage + "%");


    }

}
