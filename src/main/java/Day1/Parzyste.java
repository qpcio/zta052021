package Day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Parzyste {
    //wczytaj liczbe od uzytkownika
    //wypisz czy jest parzysta, czy nieparzysta

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe");
       try {
           int liczba = scanner.nextInt();
           if (liczba % 2 == 0) {
               System.out.println("Liczba jest parzysta");
           } else {
               System.out.println("Liczba jest nieparzysta");
           }
       }catch(InputMismatchException e){
           System.out.println("Podaj liczbe!!!!!!!!");
       }
    }
}
