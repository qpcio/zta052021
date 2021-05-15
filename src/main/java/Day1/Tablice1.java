package Day1;

import java.util.Scanner;

public class Tablice1 {
    //Napisz program, w którym zadeklarujesz i utworzysz pięcioelementową tablicę odpowiedniego typu.
    // W pętli pobierzesz od użytkownika 5 imion i je w niej zapiszesz.
    // Następnie wyświetl na ekranie powiadomienia "Witaj imie_z_tablicy" dla każdego z podanych parametrów.

    public static void main(String[] args) {
        String[] imiona = new String[5];
        Scanner scanner = new Scanner(System.in);

        for (int i=0;i<5;i++){
            System.out.println("podaj imie");
            imiona[i]=scanner.nextLine();
        }
        for(int i=0;i<5;i++){
            System.out.println("Witaj "+imiona[i]);
        }
    }
}
