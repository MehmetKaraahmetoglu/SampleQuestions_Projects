package packages.sampleQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class soru31 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan Arrayin uzunlugunu isteyin.
        Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
        İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen olusturmak istediginiz array'in uzunlugunu giriniz: ");
        int uzunluk = scanner.nextInt();

        int[] sayilar = new int[uzunluk];

        int sayac =1;
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("Lütfen " + sayac +"." + " elementi giriniz:");
            sayilar[i] =scanner.nextInt();
            sayac++;

        }

        System.out.println(Arrays.toString(sayilar));


    }

}
