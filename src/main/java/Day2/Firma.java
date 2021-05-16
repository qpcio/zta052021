package Day2;

import java.util.ArrayList;
import java.util.List;

public class Firma {
    public static void main(String[] args) {
        //stworzyc dwoch pracownikow
        //wypisac ich na sout
        Pracownik janek = new Pracownik();
        janek.imie = "Jan";
        janek.nazwisko = "Kowalski";
        janek.wiek = 44;

        Pracownik karyna = new Pracownik();
        karyna.imie = "Karyna";
        karyna.nazwisko = "Nowak";
        karyna.wiek = 18;

        karyna.wiek=67;

        List<Pracownik> pracownicy = new ArrayList<>();
        pracownicy.add(janek);
        pracownicy.add(karyna);

        for (Pracownik p:pracownicy) {
//            System.out.println(p);
            p.pobierzDane();
        }

        System.out.println(pracownicy.get(1).getWiek());

        pracownicy.get(0).setNazwisko("Kos");

        //ponizsze uwaza sie za nie najlepsze podejscie
        pracownicy.get(0).nazwisko = "Jednak-Kloss";

        pracownicy.get(0).setNazwisko("A");
        
        for (Pracownik p:pracownicy) {
//            System.out.println(p);
            p.pobierzDane();
        }
        //   stworzyc nowego pracownika parametryzowanym
        //konstruktorem i dodac do listy,
        //wypisac liste
        Pracownik konstruowanyPracownik =
                new Pracownik("Mis","Uszatek",123);
        pracownicy.add(konstruowanyPracownik);
        System.out.println(pracownicy);

        pracownicy.add(new Pracownik("Dodany","WLocie",10));
        System.out.println(pracownicy);

        Dyrektor dyrektor = new Dyrektor("Jarosław","Mewiński",99,"PL");

        pracownicy.add(dyrektor);
        System.out.println(pracownicy);

        /*List<Dyrektor> dyrektorzy = new ArrayList<>();
        dyrektorzy.add(karyna); tego nie da sie zrobic, bo pracownik nie jest dyrektorem

         */

    }
}
