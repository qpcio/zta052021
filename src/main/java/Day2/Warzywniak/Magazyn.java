package Day2.Warzywniak;

import java.util.ArrayList;
import java.util.List;

public class Magazyn {
    public static void main(String[] args) {
        Mango mango = new Mango(40,25,14);
        Jonagold jonagold = new Jonagold(12, 250);

        List<Owoce> owoce = new ArrayList<>();

        owoce.add(mango);
        owoce.add(jonagold);
        //tu tez zachodzi polimorfizm!! 

        System.out.println(owoce);
    }
}
