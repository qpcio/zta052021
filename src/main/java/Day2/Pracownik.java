package Day2;

public class Pracownik {
    // ma miec pola imie, nazwisko, wiek
    // metody zwracajace wszystkie pola
    //metody ustawiajace pola
    public String imie;
    public String nazwisko;
    public int wiek;

    public Pracownik(String imie,String nazwisko, int wiek){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Pracownik(){}

    public void setImie(String imie){
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko){
        if(nazwisko.length()>1) {
            this.nazwisko = nazwisko;
        }
    }

    public void setWiek(int wiek){
        this.wiek = wiek;
    }

     public String getImie(){
         return imie;     //return -> zwroc
     }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void pobierzDane(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
