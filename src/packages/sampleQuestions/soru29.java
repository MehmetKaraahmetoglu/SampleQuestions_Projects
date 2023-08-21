package packages.sampleQuestions;

public class soru29 {
    public static void main(String[] args) {
        //Soru29-)
        //1'den 100'e kadar olan doğal sayıların toplamını bulmak için bir Program yazın.
        //İpucu: Loop kulanabilirsiniz

        int sayi = 100;
        int toplam = 0;

        for (int i = 0; i <= sayi; i++) {
            toplam += i;

        }
        System.out.println("1'den 100'e kadar olan doğal sayıların toplamı: " + toplam); //5050
    }
}
