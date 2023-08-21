package packages.sampleQuestions;

import java.util.Scanner;

public class soru15 {
    public static void main(String[] args) {
        //Soru 15-)  Kullanıcıdan en az 5 harfli bir kelime alın.
        //           Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın



        //           Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
        //           Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
        //           Loopun içerisinde StringM methodlarından  yararlanalım!

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen en az 5 harften olusan bir kelime giriniz: ");
        String kelime = scanner.next();



        int kelimeHarfSayisi = kelime.length();

        while (kelimeHarfSayisi < 5) {

            System.out.println("Hatali giris lütfen tekrardan en az 5 harften olusan bir kelime giriniz");
            kelime =scanner.next();
            kelimeHarfSayisi = kelime.length();


        }
        //          met      = mehmet.substring(met)
        String yeniKelime = kelime.substring(kelime.length()-3);
        System.out.println("Yeni kelime: " +yeniKelime + yeniKelime);
    }
}
