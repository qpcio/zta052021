package Day2.Warzywniak;

public abstract class Jablko implements Owoce {
    int cena;
    int waga;
    String odmiana;

    public Jablko(int cena, int waga, String odmiana) {
        this.cena = cena;
        this.waga = waga;
        this.odmiana = odmiana;
    }

    @Override
    public String toString() {
        return "Jablko{" +
                "cena=" + cena +
                ", waga=" + waga +
                ", odmiana='" + odmiana + '\'' +
                '}';
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
