package packages.arraysDeneme;

public class C02_deneme {
    public static void main(String[] args) {
        //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz.


        int[] arr = {-4, 5, 2, 0, 3}; // beklenen output: pozitif elementin toplami 5+2+3 =10
        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            toplam +=i;

        }
        System.out.println(toplam);
    }
}
