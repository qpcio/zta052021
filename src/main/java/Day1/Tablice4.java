package Day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tablice4 {
    // Utwórz tablicę typu int przechowującą n elementów
    // - gdzie n jest parametrem pobieranym od użytkownika.
    // Następnie wypełnij ją liczbami od 1 do n i wyświetl zawartość na ekranie przy pomocy pętli foreach.
    // zabezpiecz swój program :)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");

        try {
            int liczbaUzytkownika = scanner.nextInt();
            int[] tablica = new int[liczbaUzytkownika];

            for(int i=0;i<tablica.length;i++){
                tablica[i] = i+1;
            }

            for(int i : tablica){
                System.out.println(i);
            }

        }catch(InputMismatchException e){
            System.out.println("Musi byc liczba calkowita! ");
        }

    }

}
