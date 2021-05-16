package Day2;

public class Zadanie {
    // metode sumEven - przyjmuje jeden parametr (calkowitoliczbowy) i
    // zwraca sume liczb parzystych dodatnich, mniejszych od tego parametru
    public static void main(String[] args) {

        System.out.println(sumEven(7));
    }


    public static int sumEven(int n) {
        int suma = 0;
        for (int i = 2; i < n; i+=2) {
                suma = suma + i; //suma += i;
        }
        return suma;
    }

    public static boolean isPrime(int n){
        //czy liczba n jest liczba pierwsza (taka, ktora dzieli sie bez reszty TYLKO przez 1 i sama siebie
        // najmniejsza liczba pierwsza to 2 !!

        return true; 
    }


}
