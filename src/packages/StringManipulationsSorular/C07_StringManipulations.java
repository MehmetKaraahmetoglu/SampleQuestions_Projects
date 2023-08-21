package packages.StringManipulationsSorular;

import java.util.Scanner;

public class C07_StringManipulations {
    public static void main(String[] args) {

        /*
        Kullanicidan bir sifre isteyip asagidaki sartlari kontrol edin ve kullaniciya
        düzeltmesi gereken tüm eksikleri söyleyin, eger tüm sartlari sagliyorsa"sifre basariyla kaydedildi" yazdirin
        -ilk harf kucuk olmali
        -son karakter rakam olmali
        -sifre bosluk icermemeli
        -uzunlugu en az 10 karakter olmali
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sifrenizi giriniz: ");
        String sifre = scanner.nextLine();

        boolean flag= true;

        if (sifre.length() < 10) {
            System.out.println("sifre en az 10 karakter olmali");
            flag = false;


        } if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
            System.out.println("ilk harf kucuk  olmali");
            flag =false;


        } if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.length() - 1 <= '9')) {
            System.out.println("son karakter rakam olmali");
            flag = false;


        } if (sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
            flag=false;

        }
        if (flag) {
            System.out.println("Sifre basarili  bir sekilde kaydedildi");
        }



    }
}