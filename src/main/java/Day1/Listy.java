package Day1;

import java.util.ArrayList;
import java.util.List;

public class Listy {
    //zrobcie liste intow i wypelnijcie ja liczbami od 1 do 20

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        int liczba;   // typ prymitywny (ma tylko liczbe)
        Integer liczba2;   // obiekt, ma liczbe i bonusy
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                lista.add(i * 3);
            } else {
                lista.add(i); //tu nastepuje automatyczne rzutowanie int -> Integer
            }
        }
        System.out.println(lista);

        lista.add(1);

        for (Integer i : lista) {  //for each
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }


    }
}
