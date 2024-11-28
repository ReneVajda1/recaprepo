package object.objecto;

public class Kava  {
 public Kava(String typ, double teplota, double cena, boolean jeNaSklade) {
  this.typ = typ;
  this.teplota = teplota;
  this.cena = cena;
  this.jeNaSklade = jeNaSklade;
 }

 String typ;
 double teplota;
 double cena;
 boolean jeNaSklade = true;

    void odpijemSebe (){
     System.out.println("odpil som z "+ this.typ);
    }

 @Override
 public String toString() {
  return "Kava{" +
          "typ='" + typ + '\'' +
          ", teplota=" + teplota +
          ", cena=" + cena +
          ", jeNaSklade=" + jeNaSklade +
          '}';
 }
}


