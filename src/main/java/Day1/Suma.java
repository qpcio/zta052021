package Day1;

import java.util.Scanner;

public class Suma {
    //prosimy uzytkownika o liczby do poki nie wprowadzi 0
    //po 0 uzytkownika wypisujemy sume dotychczasowych liczb
    public static void main(String[] args) {
        int suma = 0;
        int zmiennaUzytkownika = 0;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Podaj liczbe");
            zmiennaUzytkownika = scanner.nextInt();
            suma+=zmiennaUzytkownika;   // suma = suma + zmiennaUzytkownika;
        }while(zmiennaUzytkownika!=0);



        System.out.println("suma "+suma);

    }
}
