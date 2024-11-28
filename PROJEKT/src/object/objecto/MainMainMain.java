package object.objecto;

import object.objecto.Kava;

public class MainMainMain {
    @Override
    public String toString() {
        return "MainMainMain{}";
    }

    public static void main(String[] args) {
   Kava kava1 = new Kava("Kapucino",80,3.5,true);

        System.out.println(kava1.typ);

        kava1.odpijemSebe();

   Kava kava2 = new Kava("Espresso", 60,4,false);

        System.out.println(kava2.jeNaSklade);

    }

}
