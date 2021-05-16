package Day1;

import java.util.Scanner;

public class Imiona {
    //    Napisz program, który pobierze od użytkownika imię i przechowa je w zmiennej.
    //    Następnie stwórz kilka warunków z różnymi imionami.
    //    Jeśli któreś z imion będzie pasowało wyświetl "Cześć jakieś_imię„.
    //    Gdy program nie znajdzie imienia wyświetl "Przykro mi, ale Cię nie znam".

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Jak masz na imie?");
        String imie = scanner.nextLine();

        switch (imie) {
            case "Wojtek":
                System.out.println("Siemasz Wojtek!");
                break;
            case "Janina":
                System.out.println("Uszanowanie Janino!");
                break;
            case "Marek":
                System.out.println("Oddawaj nasze 70 milionow!");
                //break;
            default:
                System.out.println("Soreczka, ale Cie nie znam");
        }
    }
}
