package Day1;

import java.util.Scanner;

public class Warzywniak {
    //     W hurtowni są dwa rodzaje owoców: jabłka, banany.
    //     Jeśli ilość tych owoców przekracza 100kg tzn. że jest ich za dużo.
    //     Napisz program, który będzie przyjmował od użytkownika dwie zmienne:
    //     nazwa owocu i ilość w magazynie. Dla każdej możliwej opcji wyświetl komunikat,
    //      np. „Jabłek jest za dużo o x kg” albo „Jabłek jest w sam raz, mamy jeszcze x kg miejsca”

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwe owocow");
        String nazwa = scanner.nextLine();

        System.out.println("Podaj mase owocow");
        int masa = scanner.nextInt();

        switch (nazwa) {
            case "jabłka":
                if (masa > 100) {
                    int roznica = masa - 100;
                    System.out.println("Jablek jest za duzo o " + roznica+" kg");
                } else if (masa < 100) {
                    int roznica = 100 - masa;
                    System.out.println("Mam jeszcze " + roznica + " kg miejsca na jablka");
                } else {
                    System.out.println("Jablek jest w sam raz");
                }
                break;
            case "banany":
                if (masa > 100) {
                    int roznica = masa - 100;
                    System.out.println("Bananow jest za duzo o " + roznica);
                } else if (masa < 100) {
                    int roznica = 100 - masa;
                    System.out.println("Mam jeszcze " + roznica + " kg miejsca na banany");
                } else {
                    System.out.println("Bananow jest w sam raz");
                }
                break;
            default:
                System.out.println("Tych owoców nie obsługujemy");
        }

    }
}
