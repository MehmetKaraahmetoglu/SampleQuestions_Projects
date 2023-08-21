package packages.sampleQuestions;

import java.util.Scanner;

public class soru11 {
    public static void main(String[] args) {
        //Soru 11-)
        // Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
        //                 Ad ve soyadın baş harfleri büyük olmalıdır
        //                 Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
        //                 Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.

        //Ipucu: IF ile çözebilirsiniz.
        //Giriş :
        //		 > Gandalf Grey 5632458796321111
        //Çıktı :
        //		 > İsim : G****** G***
        //		 > CCN : **** **** **** 9632

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen adinizi giriniz: ");
        String ad = scanner.nextLine();
        ad = ad.substring(0, 1).toUpperCase() + ad.substring(1).replaceAll("\\S", "*");

        System.out.println("Lütfen soyadinizi giriniz: ");
        String soyad = scanner.next();
        soyad = soyad.substring(0, 1).toUpperCase() + soyad.substring(1).replaceAll("\\S", "*");


       /* kartNu = kartNu.substring(0, 4).replaceAll("\\d", "*") +
                " " +
                kartNu.substring(4, 8).replaceAll("\\d", "*") +
                " " +
                kartNu.substring(8, 12).replaceAll("\\d", "*") +
                " " +
                kartNu.substring(12, kartNu.length());
        System.out.println("CCN: " + kartNu);

        */
        System.out.println("Lütfen kredi karti numaranizi giriniz: ");
        String kartNu = scanner.next();

        while (kartNu.length() != 16) {

            System.out.println("Gecersiz kart numarasi.Lütfen tekrar giriniz");
            kartNu = scanner.next();
            break;


        } //             1234123412349632
        //		 > CCN : **** **** **** 9632   mehmet

        System.out.println("isim: " + ad + " " + soyad);
        System.out.println("CCN: " + kartNu.substring(0, 4).replaceAll("\\d", "*") +
                " " +
                kartNu.substring(4, 8).replaceAll("\\d", "*") +
                " " +
                kartNu.substring(8, 12).replaceAll("\\d", "*") +
                " " +
                kartNu.substring(12, kartNu.length()));


    }
}


