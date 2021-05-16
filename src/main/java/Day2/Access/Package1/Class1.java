package Day2.Access.Package1;

public class Class1 {
    public int publiczne;
    protected int protektowane;
    int poProstuInt;
    private int prywatny;

    public void metoda() {
        publiczne = 1;
        protektowane = 1;
        poProstuInt = 1;
        prywatny = 1;
    }

    // Class2 - w tym samym pakiecie, ktora dziedziczy po Class1
    // w niej zrobcie metode, i zobaczcie do ktorych pol ma dostep?

    // Class3 - w tym samym pakiecie
    // w psvm stworzcie obiekt klasy Class1 - zobaczcie do ktorych pol jest dostep

    // Class4 w pakiecie Package2 - dziedziczy po Class1
    // w niej metoda - do ktorych pol ma dostep

    // Class5 w pakiecie Package2 -
    // w psvm stworzcie obiekt klasy Class1 - zobaczcie do ktorych pol dostep
}
