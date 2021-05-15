package Day1;

public class Tablice2 {
    //zrobcie tablice 0 -> 100
    // wypisac elementy "Element ma wartosc...." foreach
    public static void main(String[] args) {
        int[] tablica = new int[101];
        for(int i = 0; i<=100;i++){
            tablica[i]=i;
        }

        System.out.println("wielkosc tablicy: "+tablica.length);

        for(int i : tablica){ //for each
            System.out.println("Element ma wartosc "+i);
        }
    }
}
