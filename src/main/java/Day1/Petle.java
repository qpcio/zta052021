package Day1;

import java.util.Scanner;

public class Petle {
    //Napisz program, który pobierze od użytkownika całkowitą liczbę dodatnią.
    // Następnie przy użyciu wyświetleń na ekranie zasymuluj odliczanie z tekstem "Bomba wybuchnie za ... „
    // gdzie w miejsce dwukropka mają się pojawić liczby od podanej przez użytkownika do 0. a potem BUM
    // Napisz program w 3 wersjach przy użyciu różnych pętli.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbe: ");
        int odliczanie = scanner.nextInt();

        for (int licznik = odliczanie; licznik > 0; licznik--) {
            System.out.println("Bomba wybuchnie za " + licznik);
        }
        System.out.println("bum!");

        int licznik = odliczanie;
        while (licznik > 0) {
            System.out.println("Bomba wybuchnie za " + licznik);
            licznik--;
        }
        System.out.println("bum!");

        licznik = odliczanie;
        do {
            System.out.println("Bomba wybuchnie za " + licznik);
            licznik--;
        } while (licznik > 0);
        System.out.println("bum!");


    }
}
