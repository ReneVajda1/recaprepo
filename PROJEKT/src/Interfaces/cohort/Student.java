package Interfaces.cohort;

public class Student extends Person {
    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        super("Jane Doe", 30, "female");
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    @Override
    public Student clone() {
        return new Student(this.name, this.age, this.gender, this.previousOrganization);
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I am " + name + ", a " + age + " year old " + gender +
                " from " + previousOrganization + " who skipped " + skippedDays + " days.");
    }
}
