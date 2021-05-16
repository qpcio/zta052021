package Day2.Warzywniak;

public class Mango implements Owoce {
    int cena;
    int waga;
    int srednica;

    @Override
    public String toString() {
        return "Mango{" +
                "cena=" + cena +
                ", waga=" + waga +
                ", srednica=" + srednica +
                '}';
    }

    public Mango(int cena, int waga, int srednica) {
        this.cena = cena;
        this.waga = waga;
        this.srednica = srednica;
    }

    public int getSrednica() {
        return srednica;
    }

    @Override
    public int pobierzCene() {
        return cena;
    }

    @Override
    public int pobierzWage() {
        return waga;
    }
}
