package packages.sampleQuestions;

import java.util.Scanner;

public class soru26 {
    public static void main(String[] args) {
        //Soru 26: Sayının Mükemmel sayı olup olmadığını kontrol eden kodu yazalım.
        //         NOT:  Kendisi hariç, pozitif bölenlerinin toplamı o sayıya eşitse, bu tür sayılar Mükemmel Sayı olabilir.
        //         Örnek:
        //         Giriş :6
        //         Çıkış: 6 Mükemmel Sayıdır
        //         Giriş :7
        //         Çıkış:7 Mükemmel Sayı Değildir
        //         ipucu: For Loop kullanarak ve belki biraz da if else yardımı ile bu soruyu çözebilirsiniz

        Scanner scanner= new Scanner(System.in);
        System.out.println("Mükemmel olup olmadigini ögrenmek istediginiz sayiyi giriniz: ");
        int sayi = scanner.nextInt();

        int bolenToplami = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0){
                bolenToplami += i;
            }
        }
        if (bolenToplami != sayi){
            System.out.println("Mükemmel sayi degildir");
        }else{
            System.out.println("Mükemmel sayidir");
        }
    }
}
