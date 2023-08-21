package packages.StringManipulations;

import java.util.Scanner;

public class soru02 {
    //Soru 2 : Kullanicidan bir String ve aranacak metin alin.
    // Aranan metnin String icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini yazdirin.
    //- String aranan metni icermiyor
    //- Aranan metin String’de sadece 1 kere kullanilmis
    //- Aranan metin String’de sadece 1’den fazla kullanilmis
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir  metin giriniz");
        String metin = scanner.nextLine();

        System.out.println("Metin icerisinde aranacak metini giriniz");
        String aranacakMetin = scanner.nextLine();

        int arananMetinIndex = metin.indexOf(aranacakMetin);

        if (arananMetinIndex == -1) {
            System.out.println("String aranan metni icermiyor");


        } else {
            int sonrakiKullanimIndex = metin.indexOf(aranacakMetin,arananMetinIndex+1);

            if (sonrakiKullanimIndex == -1){
                System.out.println("Aranan metin String’de sadece 1 kere kullanilmis");
            }else {
                System.out.println("Aranan metin String’de 1’den fazla kullanilmis");
            }

        }
    }
}
