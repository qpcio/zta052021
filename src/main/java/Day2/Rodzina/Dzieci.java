package Day2.Rodzina;

public class Dzieci extends Rodzice {
    String samochod;

    public Dzieci(int powierzchniaDzialki, int powierzchniaDomu, String samochod){
        super(powierzchniaDzialki,powierzchniaDomu);
        // jesli uzywamy super, to ponizsze jest zbedne
//        this.powierzchniaDomu = powierzchniaDomu;
//        this.powierzchniaDzialki = powierzchniaDzialki;
        this.samochod = samochod;
    }


    


    @Override
    public String toString() {
        return "Dzieci{" +
                "powierzchniaDzialki=" + powierzchniaDzialki +
                ", samochod='" + samochod + '\'' +
                ", powierzchniaDomu=" + powierzchniaDomu +
                '}';
    }
}
