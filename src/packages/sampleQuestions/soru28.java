package packages.sampleQuestions;

import java.util.Scanner;

public class soru28 {
    public static void main(String[] args) {
        // Soru-28) Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
        //          Örnek:
        //          Sayı: 1238
        //          Sayının Tersi: 8321
        //          İpucu:  Loop kullanabilirsiniz.

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir sayi giriniz: ");
        int sayi = scan.nextInt();


        System.out.print("Yeni sayi: ");

        while(sayi > 0) {

            System.out.print(sayi % 10);
            sayi /= 10;
        }
    }
}
