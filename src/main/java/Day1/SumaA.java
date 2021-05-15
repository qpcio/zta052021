package Day1;

import java.util.Scanner;

public class SumaA {



        //prosimy uzytkownika o liczby do poki nie wprowadzi 0
        //po 0 uzytkownika wypisujemy sume dotychczasowych liczb
        public static void main(String[] args) {
            int suma = 0;

            Scanner scanner = new Scanner(System.in);
             while(true) {

                 System.out.println("Podaj liczbe");
                 int zmiennaUzytkownika = scanner.nextInt();
                 if(zmiennaUzytkownika == 0)break;
                 suma += zmiennaUzytkownika;   // suma = suma + zmiennaUzytkownika;
             }
            System.out.println("suma "+suma);
        }
}
