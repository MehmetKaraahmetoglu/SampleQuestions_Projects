package packages.sampleQuestions;

import java.util.Scanner;

public class soru22 {
    /*Soru 22-)
    Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
    Giriş : 30 ve 40
    Beklenen Çıktı:30 ve 40 için EBOB= 10
                   30 ve 40 için EKOK= 120
    ipucu:
    Loopları kullanarak çözebiliriz. İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.

     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen EBOB ve EKOK'unun hesaplanmasini istediginiz 2 adet sayi giriniz: ");
        System.out.println("Sayi 1: ");
        int sayi1 = scanner.nextInt();

        System.out.println("Sayi 2: ");
        int sayi2 = scanner.nextInt();

        int ebob = 1;
        int ekok;


        for (int i = 1; i <= sayi1 && i <= sayi2; i++) {

            if (sayi1 % i == 0 && sayi2 % i == 0){
                ebob = i;
            }
        }
        ekok = (sayi1 * sayi2) / ebob;

        System.out.println("EBOB: "+  ebob);
        System.out.println("EKOK: " + ekok);
    }


}

