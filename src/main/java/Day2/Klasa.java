package Day2;

import java.awt.*;

public class Klasa {
    public static void main(String[] args) {
        Samochod samochod = new Samochod();    // Samochod() - wywolanie domyslnego konstruktora klasy Samochod
        samochod.jedzie();
        System.out.println(samochod.kolor);
    }
}


class Samochod{
    public Color kolor = new Color(255,255,255);

    public void jedzie(){       // void mowi o tym, ze metoda nic nie zwraca
        System.out.println("Brum Brum!");
    }
}
