package Day1;

public class Wyjatki {
    public static void main(String[] args) {
        int[] tablica = new int[3];
        try {
            tablica[6] = 2/0;       //najpierw co, a potem gdzie
        } catch (ArrayIndexOutOfBoundsException tralalal) {
            System.out.println("Poleciał wyjatek " + tralalal.getMessage());
        } catch (ArithmeticException e){    // catchy moze byc wiecej niz 1
            System.out.println("Czyzbys dzielil przez 0?");
        }finally {
            System.out.println("Koniec!"); //finally wykonuje sie zawsze!
        }
    }
}
