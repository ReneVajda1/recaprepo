package Interfaces.cohort;

public class Person implements Cloneable {
    protected String name;
    protected int age;
    protected String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    @Override
    public Person clone() {
        return new Person(this.name, this.age, this.gender);
    }

    public void introduce() {
        System.out.println("Hi, I am " + name + ", a " + age + " year old " + gender + ".");
    }

    public void getGoal(){
        System.out.println("GOAAAAAAAAAAAAAAAAAAAAAAAAL");
    }
}
