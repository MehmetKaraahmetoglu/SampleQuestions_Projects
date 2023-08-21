package packages.sampleQuestions;

import java.util.Scanner;

public class soru12 {
    public static void main(String[] args) {
        //Soru 12-)
        //Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir
        // hesaplamak ve yazdırmak için bir program oluşturalım
        //Eğer verilen tamsayıların veya toplamınin 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım
        //fazla yüklenme durunu yoksa sayilari toplayin

        //Ipucu:  IF/Else kullanabilirsiniz.
        //        Örnek:
        //İki tamsayı girin:
        //25  veya  4567986321453
        //46   veya 123456
        //Konsolda Çıktı :
        //Sayıların toplamı: 71  veya  Fazla Yüklenme

        System.out.println("Lütfen toplanmasini istediginiz 2 tane sayi giriniz:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("sayi1: ");
        long sayi1 = scanner.nextLong();


        System.out.println("sayi2: ");
        long sayi2 = scanner.nextLong();

        long toplam = sayi1 + sayi2;
        long toplam1 = toplam;

        int basamakSayisiSayi1 = 0;
        while (sayi1 > 0) {
            sayi1 = sayi1 / 10;
            basamakSayisiSayi1++;
        }
        int basamakSayisiSayi2 = 0;

        while (sayi2 > 0) {
            sayi2 /= 10;
            basamakSayisiSayi2++;
        }
        int basamakSayisiToplam = 0;
        while (toplam1 > 0) {
            toplam1 = toplam1 / 10;
            basamakSayisiToplam++;
        }


        if (basamakSayisiSayi1 > 10 || basamakSayisiSayi2 > 10 || basamakSayisiToplam > 10) {
            System.out.println("Fazla Yüklenme");

        } else {

            System.out.println("Sayilarin toplami: " + toplam);

        }

    }
}




