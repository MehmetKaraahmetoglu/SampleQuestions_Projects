package packages.StringManipulationsSorular;

import java.util.Scanner;

public class C08_StringManipulations {
    public static void main(String[] args) {

        /*
        Kullanicidan isim ve soyismini ayri ayri alin
        -ismi daha uzun ise, isim ve soyismi ilk harf buyuk digerleri kucuk sekilde yazdirin
        -soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen adinizi giriniz: ");
        String ad = scanner.nextLine();

        System.out.println("lütfen soyadinizi giriniz: ");
        String soyad = scanner.nextLine();

        if (ad.length() > soyad.length()){
            System.out.println((ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase()) + " " +
                    (soyad.substring(0,1).toUpperCase() + soyad.substring(1).toLowerCase()));
        }else {
            System.out.println((ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase()) + " " +
                    soyad.toUpperCase());
        }
    }
}
