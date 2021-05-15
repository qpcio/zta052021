package Day1;

import java.util.Scanner;

public class Liczby {
    public static void main(String[] args) {
        //pobierz dwie liczby calkowite, porownaj
        //wypisz stosowny komunikat

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe:");
        int liczbaA = scanner.nextInt();
        System.out.println("Podaj druga liczbe:");
        int liczbaB = scanner.nextInt();

        if (liczbaA==0 || liczbaB==0){
            System.out.println("A czemu takie trudne liczby mi dajesz?");
        } // w przeciwnym razie nie robimy nic

        if (liczbaA > liczbaB) {
            System.out.println("Pierwsza liczba jest większa!");
        } else if (liczbaB > liczbaA) {
            System.out.println("Druga liczba jest większa!");
        } else {
            System.out.println("Liczby są równe!");
        }
    }
}
