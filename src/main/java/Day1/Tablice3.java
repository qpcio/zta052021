package Day1;

public class Tablice3 {
    public static void main(String[] args) {
        int[][] tablica = new int[2][3];

        int licznik = 0;
        for(int i=0;i<tablica.length;i++){
            for (int j= 0;j<tablica[i].length;j++){
                tablica[i][j] = licznik;
                licznik++;
            }
        }
        //czy ponizsze jest intuicyjne?
        for (int[] i:tablica){
            for(int j:i){
                System.out.println(j);
            }
        }

        for(int i=0;i<tablica.length;i++){
            for (int j= 0;j<tablica[i].length;j++){
                System.out.println("Tab["+i+","+j+"]="+tablica[i][j]);
            }
        }

    }
}
