package packages.StringManipulationsSorular;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        //Soru : Kullanicidan Kullanicidan sifre
        //isteyin asagidaki sartlari saglamayan
        //sifrelerde hatalari yazdirip,
        //kullanicinin yeni sifre girmesi isteyin
        //Gecerli bir sifre yazilincaya kadar bu
        //islemi tekrar edin gecerli sifre
        //yazilinca “sifreniz basari ile
        //kaydedildi” yazdirin
        //sartlar :
        //- sifrenin ilk karakteri kucuk harf
        //olmali
        //- sifrenin son karakteri sayi olmali


        boolean sonuc = false;


        while (sonuc == false) {
            int sayac = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("lutfen sifrenizi giriniz: ");
            String sifre = scanner.next();

            char ilkHarf = sifre.charAt(0);
            if (!(ilkHarf >= 'a' && ilkHarf <= 'z')) {
                System.out.println("ilk harf kucuk olmali!");
                sayac++;
            }
            char sonKarakter = sifre.charAt(sifre.length() - 1);
            if (!(sonKarakter >= '0' && sonKarakter <= '9')) {
                System.out.println("son karaker rakam olmali");
                sayac++;
            }
            if (sayac == 0) {
                sonuc = true;
                System.out.println("sifreniz basariyla  kaydedildi");

            }

        }
    }
}
