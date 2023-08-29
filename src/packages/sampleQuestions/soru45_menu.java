package packages.sampleQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soru45_menu {

    static Scanner scanner = new Scanner(System.in);

   static soru45_bakkalProjesi obj = new soru45_bakkalProjesi();





    static void menu() {

        boolean cikis = true;

        do {
            System.out.println("Bakkal sistemine hosgeldiniz,lütfen yapmak istediginiz islemi giriniz:"
                    + "\n1- Günlük kazanclari girme"
                    + "\n2- Haftalik ortalama kazanci sorgula"
                    + "\n3- Ortalama kazancin üstünde ki günleri gör"
                    + "\n4- Ortalama kazancin altinda ki günleri gör"
                    + "\n5- Cikis");
            int secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    obj.gunlukKazancEkleme();
                    break;
                case 2:
                    soru45_bakkalProjesi.getOrtalamaKazanc();
                    break;
                case 3:
                    obj.getOrtalamaninUstundekiKazancGunleri();
                    break;
                case 4:
                    obj.getOrtalamaninAltindaKazancGunleri();
                    break;
                case 5:
                    cikis=false;
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz.");
                    break;
            }


        } while (cikis);
    }

}
