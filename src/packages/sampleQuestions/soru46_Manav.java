package packages.sampleQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soru46_Manav {


    List<String> urunListesi = new ArrayList<>();
    List<soru46_Manav> tumSiparisler = new ArrayList<>();
    String urunAdi;
    double kg;
    double patatesFiyat = 10;
    double soganFiyat = 15;
    double domatesFiyat = 20;
    double elmaFiyat = 17;
    double muzFiyat = 25;
    static double hesap = 0;
    Scanner scanner = new Scanner(System.in);

    public soru46_Manav() {

    }

    public soru46_Manav(String urunAdi, double kg) {
        this.urunAdi = urunAdi;
        this.kg = kg;
    }

    void urunler() {
        urunListesi.add("Patates");
        urunListesi.add("Sogan");
        urunListesi.add("Domates");
        urunListesi.add("Elma");
        urunListesi.add("Muz");
        for (int i = 0; i < urunListesi.size(); i++) {
            System.out.println(urunListesi.get(i));
        }
    }

    void siparis() {

        String secim;
        do {
            System.out.println("1- Patates-kg Fiyat: 10 Tl" +
                    "\n2- Sogan-kg Fiyat: 15 Tl" +
                    "\n3- Domates-kg Fiyat: 20 Tl" +
                    "\n4- ELma- kg Fiyat: 17 Tl" +
                    "\n5- Muz- kg Fiyat: 25Tl");
            System.out.println("");
            System.out.println("Lütfen ürün adinin adini yaziniz:  \nSiparisiniz bittiginde CIKIS yaziniz. ");
            secim = scanner.next();
            if (secim.equalsIgnoreCase("cikis")) {
                if (tumSiparisler.isEmpty())
                    System.out.println("Henüz siparis vermediniz!");
                else {

                    for (int i = 0; i < tumSiparisler.size(); i++) {
                        System.out.println("Ürün adi: " + tumSiparisler.get(i).urunAdi +
                                "\nSiparis miktari: " + tumSiparisler.get(i).kg + " Kg");
                        System.out.println("");
                    }
                }


            } else if (secim.equalsIgnoreCase("domates") ||
                    secim.equalsIgnoreCase("patates") ||
                    secim.equalsIgnoreCase("sogan") ||
                    secim.equalsIgnoreCase("elma") ||
                    secim.equalsIgnoreCase("muz")) {
                System.out.println("Lütfen almak istediginiz miktari kg olarak giriniz: ");
                double kg = scanner.nextDouble();
                soru46_Manav siparisListesi = new soru46_Manav(secim, kg);
                tumSiparisler.add(siparisListesi);

            } else {
                System.out.println("Hatali giris yaptiniz");
            }

        } while (!secim.equalsIgnoreCase("Cikis"));
    }


    void siparisDetayi() {
        if (tumSiparisler.isEmpty()) {
            System.out.println("Henüz siparis vermediniz.");
        } else{

            for (int i = 0; i < tumSiparisler.size(); i++) {
                System.out.println("Ürün adi: " + tumSiparisler.get(i).urunAdi +
                        "\nSiparis miktari: " + tumSiparisler.get(i).kg + " Kg");
                System.out.println("");
            }
    }
}


    void toplamTutar() {


        for (int i = 0; i < tumSiparisler.size(); i++) {
            if (tumSiparisler.get(i).urunAdi.equalsIgnoreCase("Patates")) {
                hesap += tumSiparisler.get(i).kg * patatesFiyat;
            }
            if (tumSiparisler.get(i).urunAdi.equalsIgnoreCase("Sogan")) {
                hesap += tumSiparisler.get(i).kg * soganFiyat;
            }
            if (tumSiparisler.get(i).urunAdi.equalsIgnoreCase("Domates")) {
                hesap += tumSiparisler.get(i).kg * domatesFiyat;
            }
            if (tumSiparisler.get(i).urunAdi.equalsIgnoreCase("Elma")) {
                hesap += tumSiparisler.get(i).kg * elmaFiyat;
            }
            if (tumSiparisler.get(i).urunAdi.equalsIgnoreCase("Muz")) {
                hesap += tumSiparisler.get(i).kg * muzFiyat;
            }
        }
        System.out.println("*** Bizi tercih ettiginiz icin tesekkürler ***" + "\nSiparisinizin toplam tutari: " + hesap);

    }

    void menu() {
        System.out.println("****Manavimiza hosgeldiniz****");
        System.out.println("1- Urun listesini gör" +
                "\n2- Siparis ver" +
                "\n3- Siparise ekleme yap" +
                "\n4- Siparis listesi görüntüle" +
                "\n5- Kasaya git" +
                "\n6- Cikis");
        int tercih = scanner.nextInt();
        switch (tercih) {

            case 1:
                urunler();
                menu();
                break;

            case 2:
                siparis();
                menu();
                break;
            case 3:
                siparis();
                menu();
                break;
            case 4:
                siparisDetayi();
                menu();
                break;
            case 5:
                toplamTutar();
                break;

            case 6:
                System.exit(0);

            default:
                System.out.println("Hatali giris yaptiniz, lütfen tekrar deneyiniz.");
                break;
        }
    }

    public static void main(String[] args) {


        soru46_Manav obj = new soru46_Manav();
        obj.menu();
    }
}

