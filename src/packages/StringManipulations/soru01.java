package packages.StringManipulations;

import java.util.Scanner;

public class soru01 {
    public static void main(String[] args) {
        //Soru 1 : Kullanicidan bir string bir metin ve aranacak bir string metni alin.
        //String’in aranan metni icerip icermedigini indexOf( ) method’u kullanarak yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir  metin giriniz");
        String metin = scanner.nextLine();

        System.out.println("Metin icerisinde aranacak metini giriniz");
        String aranacakMetin = scanner.nextLine();

        int arananMetinIndex = metin.indexOf(aranacakMetin);

        if (arananMetinIndex >= 0) {

            System.out.println(aranacakMetin + " " + metin + " icerisinde kullanilmistir.");
        }else {
            System.out.println(aranacakMetin + " " + metin + " icerisinde kullanilmamistir.");
        }
    }
}
