package packages.sampleQuestions;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class soru47_OkulKayit {
    //1.  Bu programda, Öğrenci ve Öğretmen Kayıtları ile ilgili işlemler yapılabilmelidir.
    //    Kayıtlarda şu bilgiler olabilmelidir.
    //    Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
    //    Öğrenci:  Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.
    static Scanner scanner = new Scanner(System.in);
    ArrayList<soru47_Ogretmen> ogretmen = new ArrayList<>();
    ArrayList<soru47_Ogrenci> ogrenci = new ArrayList<>();


    // O G R E T M E N    M E N U
    void ogrt_ekleme() {
        int siraNo = 1;
        char secim;
        do {
            System.out.println("Lütfen ögretmenin AD'ini yaziniz: ");
            String ogrt_ad = scanner.next();
            System.out.println("Lütfen ögretmenin SOYADI'ni yaziniz: ");
            String ogrt_soyad = scanner.next();

            String ogrt_kimlik_no;
            do {
                System.out.println("Lütfen 4 basamakli TC kimlik numarasini giriniz: ");
                ogrt_kimlik_no = scanner.next();
                if (ogrt_kimlik_no.length() == 4) {
                    break;
                } else {
                    System.out.println("Hatali giris yaptiniz...");
                }
            } while (ogrt_kimlik_no.length() != 4);


            System.out.println("Lütfen ögretmenin YAS bilgisini giriniz: ");
            int ogrt_yas = scanner.nextInt();

            System.out.println("Lütfen ögretmenin BOLUM bilgisini giriniz: ");
            String ogrt_bolum = scanner.next();


            int basamakSayisiSicilNo = 0;
            String ogrt_sicil_no;
            do {
                System.out.println("Lütfen ögretmenin 4 haneli SICIL NO bilgisini giriniz: ");
                ogrt_sicil_no = scanner.next();

                if (ogrt_sicil_no.length() == 4) {
                    break;
                } else {
                    System.out.println("Hatali giris yaptiniz...");
                }
            } while (ogrt_sicil_no.length() != 4);
            System.out.println("Cikis yapmak icin Q ya basiniz, devam etmek icin herhangi bir harfe basabilirsiniz..");
            secim = scanner.next().toUpperCase().charAt(0);


            soru47_Ogretmen ogrt = new soru47_Ogretmen(siraNo, ogrt_ad, ogrt_soyad, ogrt_kimlik_no, ogrt_yas, ogrt_bolum, ogrt_sicil_no);
            ogretmen.add(ogrt);
            siraNo++;

        } while (secim != 'Q');

    }

    void ogrtArama() {

        System.out.println("Lütfen aradiginiz ogretmenin 4 haneli TC No bilgisini giriniz: ");
        String tcNo = scanner.next();
        boolean cikis = true;

        for (soru47_Ogretmen each : ogretmen
        ) {
            if (tcNo.equals(each.kimlikNo)) {
                System.out.println("Aradiginiz Ogretmene ait bilgiler: " + each.toString());
                cikis = false;
                break;

            }
        }
        if (cikis)
            System.out.println("Hatali TC No girdiniz ya da" + "\nSistemde bu TC'ye kayitli ogretmen bulunmamaktadir.");
    }


    void ogrtListele() {
        System.out.println("Okula kayitli ogretmenler: ");
        for (soru47_Ogretmen each : ogretmen
        ) {
            System.out.println("Ogrt Sira No: " + each.siraNo +
                    "\tAdi: " + each.ad +
                    "\tSoyadi: " + each.soyad +
                    "\tTC no: " + each.kimlikNo +
                    "\tYas: " + each.yas +
                    "\tBolum: " + each.bolum +
                    "\tSicil No: " + each.sicilNo);
            System.out.println("*************************");

        }
    }

    void ogrtSilme() {
        System.out.println("Lütfen silmek istediginiz kisinin TC No'sunu yaziniz: ");
        String tcNo = scanner.next();
        boolean cikis = true;
        for (soru47_Ogretmen each : ogretmen
        ) {
            if (tcNo.equals(each.kimlikNo)) {
                System.out.println("***Silme islemi basarili bir sekilde gerceklesmistir*** " + "\nSilinen kisiye ait bilgiler: " + each.toString());
                ogretmen.remove(each);
                break;

            } else {
                System.out.println("Hatali TC No girdiniz ya da" + "\nSistemde bu TC'ye kayitli ogretmen bulunmamaktadir.");
            }


        }
    }

    // O G R E N C I    M E N U
    void ogr_ekleme() {
        int siraNo = 1;
        char secim;
        do {
            System.out.println("Lütfen ögrencinin AD'ini yaziniz: ");
            String ogr_ad = scanner.next();
            System.out.println("Lütfen ögrencinin SOYADI'ni yaziniz: ");
            String ogr_soyad = scanner.next();

            String ogr_kimlik_no;
            do {
                System.out.println("Lütfen ögrencinin 4 haneli KIMLIK NO bilgisini giriniz: ");
                ogr_kimlik_no = scanner.next();

                if (ogr_kimlik_no.length() == 4) {
                    break;
                } else {
                    System.out.println("Hatali giris yaptiniz...");
                }
            } while (ogr_kimlik_no.length()!=4);

            System.out.println("Lütfen ögrencinin YAS bilgisini giriniz: ");
            int ogr_yas = scanner.nextInt();
            System.out.println("Lütfen ögrencinin NUMARA'sini giriniz: ");
            int ogr_numara = scanner.nextInt();
            System.out.println("Lütfen ögrencinin SINIF bilgisini giriniz: \nÖR:9/A");
            String ogr_sinif = scanner.next();
            System.out.println("Cikis yapmak icin Q ya basiniz, devam etmek icin herhangi bir harfe basabilirsiniz..");
            secim = scanner.next().toUpperCase().charAt(0);


            soru47_Ogrenci ogr = new soru47_Ogrenci(siraNo, ogr_ad, ogr_soyad, ogr_kimlik_no, ogr_yas, ogr_numara, ogr_sinif);
            ogrenci.add(ogr);
            siraNo++;

        } while (secim != 'Q');

    }

    void ogrArama() {

        System.out.println("Lütfen aradiginiz ogrencinin 4 haneli TC No bilgisini giriniz: ");
        String tcNo = scanner.next();
        boolean cikis = true;
        for (soru47_Ogrenci each : ogrenci
        ) {
            if (tcNo.equals(each.kimlikNo)) {
                System.out.println("Aradiginiz ogrenciye ait bilgiler: " + each.toString());
                cikis = false;
                break;

            }
        }
        if (cikis)
            System.out.println("Hatali TC No girdiniz ya da" + "\nSistemde bu TC'ye kayitli ogrenci bulunmamaktadir.");
    }


    void ogrListele() {
        System.out.println("Okula kayitli ogrenciler: ");
        for (soru47_Ogrenci each : ogrenci
        ) {
            System.out.println("Ogr Sira No: " + each.siraNo +
                    "\tAdi: " + each.ad +
                    "\tSoyadi: " + each.soyad +
                    "\tTC no: " + each.kimlikNo +
                    "\tYas: " + each.yas +
                    "\tNumara: " + each.numara +
                    "\tSinif: " + each.sinif);
            System.out.println("*************************");

        }
    }

    void ogrSilme() {
        System.out.println("Lütfen silmek istediginiz ogrencinin TC No'sunu yaziniz: ");
        String tcNo = scanner.next();
        boolean cikis = true;
        for (soru47_Ogrenci each : ogrenci
        ) {
            if (tcNo.equals(each.kimlikNo)) {
                System.out.println("***Silme islemi basarili bir sekilde gerceklesmistir*** " + "\nSilinen kisiye ait bilgiler: " + each.toString());
                ogrenci.remove(each);
                cikis = false;
                break;

            }
        }
        if (cikis)
            System.out.println("Hatali TC No girdiniz ya da" + "\nSistemde bu TC'ye kayitli ogretmen bulunmamaktadir.");
    }
}

