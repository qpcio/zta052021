package Day2;

public class Ulica {
    public static void main(String[] args) {
        //Fabryka samochodow wyprodukuje samochod, ale sama nie bedzie miala
        // swojej instancji (to robi static przy metodzie)
        // wolamy metode bezposrednio z klasy FabrykaSamochodow
        SamochodInt pierwszy = FabrykaSamochodow.getSamochod("BMW");
        System.out.println(pierwszy.getClass().toString());
    }
}
