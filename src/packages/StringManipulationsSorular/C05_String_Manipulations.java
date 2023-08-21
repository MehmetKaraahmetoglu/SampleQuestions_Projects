package packages.StringManipulationsSorular;

import java.util.Scanner;

public class C05_String_Manipulations {
    public static void main(String[] args) {

        /*
        Kullanicinin belirli bir formatta verdigi STRING fiyatlarini toplayip yazdirin.
        input : 15,30
        input2 :11,40
        toplam: 26,70
         */

        Scanner scanner =new Scanner(System.in);
        System.out.println("Ilk ürün fiyatlarini giriniz: ");
        String urunFiyati = scanner.next();
        System.out.println("Ikinci ürün fiyatini giriniz: ");
        String urunFiyati2 = scanner.next();

        System.out.println("girdiginiz urunlerin toplam fiyati: " + (Double.parseDouble(urunFiyati) + Double.parseDouble(urunFiyati2)));


    }
}
