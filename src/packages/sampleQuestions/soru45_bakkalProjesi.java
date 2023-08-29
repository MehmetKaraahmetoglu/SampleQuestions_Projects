package packages.sampleQuestions;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class soru45_bakkalProjesi {
    /*
    Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
 kazandığını gösteren bir method yazınız.

 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
   2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
   3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
   4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
   5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
             for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır ortalama
             kazançtan yüksekse o günleri return yap.
   6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
             for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
             ortalama kazançtan aşağıysa o günleri return yap.
     */

    String gun;
    Double gunlukKazanc;
    static double ortalamaKazanc;
    static double toplam = 0;
    static ArrayList<soru45_bakkalProjesi> liste = new ArrayList<>();


    String[] gunler = {"Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"};
    static Scanner scanner = new Scanner(System.in);


    public soru45_bakkalProjesi() { // Parametresiz
    }



    public soru45_bakkalProjesi(String gun, Double gunlukKazanc) { //Parametreli
        this.gun = gun;
        this.gunlukKazanc = gunlukKazanc;
        /*
        Burda const olusturdum cunku;
        birlikte kullanilacak parametreleri tek bir obje icinde toplamak istedim.
        Asagida da bu objeleri de liste adinda ki listemiz de depoladik.
         */
    }





    //3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
    void gunlukKazancEkleme() {


        for (int i = 0; i < gunler.length; i++) {

            System.out.println("Lütfen " + gunler[i] + " gününe ait kazancinizi giriniz:");
            double kazanc = scanner.nextDouble();
            soru45_bakkalProjesi obj = new soru45_bakkalProjesi(gunler[i], kazanc);
            liste.add(obj);
        }
    }



    //4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
    static void getOrtalamaKazanc() {


        for (int i = 0; i < liste.size(); i++) {
            toplam += liste.get(i).gunlukKazanc;
            ortalamaKazanc =toplam/7;
        }
        System.out.println("Haftalik ortalama kazanciniz: " + ortalamaKazanc);
    }



    // 5. Adım :   getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
    //             for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır ortalama
    //             kazançtan yüksekse o günleri return yap.
    void getOrtalamaninUstundekiKazancGunleri() {
        //                                      { [p,k]   [s,k]   [c,k]   []   []   []   []   }

        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i).gunlukKazanc > ortalamaKazanc) {
                System.out.println("Ortalamanin üstünde kazanc sagladiginiz gün(ler): " + liste.get(i).gun);

            }
        }
    }




    //6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
    //             for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
    //             ortalama kazançtan aşağıysa o günleri return yap.

    void getOrtalamaninAltindaKazancGunleri() {
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i).gunlukKazanc < ortalamaKazanc){
                System.out.println("Ortalamanin altinda kazanc sagladiginiz gün(ler): " + liste.get(i).gun);
            }

        }

    }

}

