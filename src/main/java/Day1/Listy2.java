package Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listy2 {
    //pobieramy od uzytkownika liczby i umieszczemy je w liscie
    // do poki nie trafi sie taka, ktora juz jest w tej liscie
    // wtedy przerywamy i wypisujemy liste - sout(lista)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        while (true){
            System.out.println("Podaj liczbe");
            int liczbaUzytkownika = scanner.nextInt();
            if(lista.contains(liczbaUzytkownika))break;    // sprawdzenie zanim dodamy.
            lista.add(liczbaUzytkownika);                   //jesli nie istnial to dodajemy
        }
        System.out.println(lista);
    }
}
