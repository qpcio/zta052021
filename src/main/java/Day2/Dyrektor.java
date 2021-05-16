package Day2;
//ma rozszczerzac klase pracownik o String zarzadzanyDepartament;
//konstruktor
//toString
public class Dyrektor extends Pracownik{
     String zarzadzanyDepartament;

    public Dyrektor(String imie, String nazwisko, int wiek, String zarzadzanyDepartament) {
        super(imie, nazwisko, wiek);
        this.zarzadzanyDepartament = zarzadzanyDepartament;
    }

    @Override
    public String toString() {
        return "Dyrektor{" +
                "zarzadzanyDepartament='" + zarzadzanyDepartament + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
