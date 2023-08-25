package packages.sampleQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soru46_Manav_ektraCozum {
    //Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
    //yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
    //method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
    //gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
    // kazandığını gösteren bir method yazınız.
    // Basit bir 5 ürünlü manav alisveris programi yaziniz.
    //
    //   1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
    //   2. Adim : Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir. Bu islemi alisverisi
    //             bitirmek isteyene kadar tekrarla.
    //   3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
    //   4. Adim : Alisveris bitince toplam odemesi gereken tutari goster

    List<Double> fiyatToplami = new ArrayList<>();
    static double fiyat;
    double toplamFiyat;
    Scanner scanner = new Scanner(System.in);

    public soru46_Manav_ektraCozum() {
    }

    void menu() {
        System.out.println("");
        System.out.println("*** Bakkal Sistemine Hosgeldiniz ***");
        System.out.println("\n1- Siparis ver" +
                "\n2- Cikis");
        int secim = scanner.nextInt();

        switch (secim) {
            case 1:
                siparisVer();
                menu();
            case 2:
                System.exit(0);
            default:
                System.out.println("Hatali giris yaptiniz.");
                menu();

        }

    }
    void ilaveAlisveris(){
        System.out.println("Almak istediginiz baska bir urun var mi?"+
                "\nE----EVET"+
                "\nH----HAYIR");
        char secim = scanner.next().toUpperCase().charAt(0);

        if (secim=='E'){
            siparisVer();
        }else if (secim=='H'){
            kasayaGit();
        }
    }

    private void kasayaGit() {
        for (int i = 0; i < fiyatToplami.size(); i++) {
            toplamFiyat += fiyatToplami.get(i);

        }
        System.out.println("...Yine bekleriz..."+"\nSiparisinizin toplam tutari: " + toplamFiyat+ " Tl'dir.");
        System.exit(0);
    }

    private void siparisVer() {

        double kg;
        System.out.println("Almak istediginiz ürün kodunu giriniz: " +
                "\n1- Patates---kg: 10 Tl" +
                "\n2- Domates---kg: 20 Tl"+
                "\n3- Elma------kg: 15 Tl"+
                "\n4- Muz-------kg: 25 Tl"+
                "\n5- Uzum------kg: 22 Tl"+
                "\n6- Menuye don");
        int tercih = scanner.nextInt();
        switch (tercih) {
            case 1:
                System.out.println("Kg olarak istediginiz miktari yaziniz: ");
                kg = scanner.nextDouble();
                fiyat = kg * 10;
                fiyatToplami.add(fiyat);
                fiyat=0;
                ilaveAlisveris();
                break;


            case 2:
                System.out.println("Kg olarak istediginiz miktari yaziniz: ");
                kg = scanner.nextDouble();
                fiyat = kg * 20;
                fiyatToplami.add(fiyat);
                fiyat=0;
                ilaveAlisveris();
                break;
            case 3:
                System.out.println("Kg olarak istediginiz miktari yaziniz: ");
                kg = scanner.nextDouble();
                fiyat = kg * 15;
                fiyatToplami.add(fiyat);
                fiyat=0;
                ilaveAlisveris();
                break;

            case 4:
                System.out.println("Kg olarak istediginiz miktari yaziniz: ");
                kg = scanner.nextDouble();
                fiyat = kg * 25;
                fiyatToplami.add(fiyat);
                fiyat=0;
                ilaveAlisveris();
                break;
            case 5:
                System.out.println("Kg olarak istediginiz miktari yaziniz: ");
                kg = scanner.nextDouble();
                fiyat = kg * 22;
                fiyatToplami.add(fiyat);
                fiyat=0;
                ilaveAlisveris();
                break;

            case 6:
                menu();
            default:
                System.out.println("Hatali secim yaptiniz.");
                siparisVer();
        }
    }

    public static void main(String[] args) {
        soru46_Manav_ektraCozum bakkal = new soru46_Manav_ektraCozum();
        bakkal.menu();
    }

}

