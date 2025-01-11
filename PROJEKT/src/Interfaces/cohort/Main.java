package Interfaces.cohort;

public class Main {
    public static void main(String[] args) {
        Sponsor sponsor1 = new Sponsor("Jane Doe", 30, "female", "Google", 0);
        Cohort cohort1 = new Cohort("Trieda");

        Student joe = new Student();

        Student student1 = new Student();

       Student student2 = new Student("Dano",20,"Male","asdfasdf");



      cohort1.info();

      System.out.println(" ");

      Student student1TheCLONE = student1.clone();

      cohort1.addStudent(student1);
      cohort1.addStudent(student1TheCLONE);


      student1.introduce();
      student1TheCLONE.introduce();

      cohort1.info();


    }
}
