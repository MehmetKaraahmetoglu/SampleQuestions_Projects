package packages.sampleQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class soru32 {
    public static void main(String[] args) {
        //Soru 32: Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini
        //         Reverse olarak (tersten) yazdırınız.
        //         İpucu:  int arrReverse[] diye bir array oluşturun
        //         ve kullancıya oluşturdugunuz arrayi buna tersten assign edin.

        System.out.println("Tersten Array Yazdirma Programi:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen önce tersten yazdirmak istediginiz array'in uzunlugunu giriniz: ");
        int uzunluk = scanner.nextInt();

        int[] sayilar = new int[uzunluk];

        int sayac = 1;
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("Lütfen " + sayac + "." + " elementi giriniz:");
            sayilar[i] = scanner.nextInt();
            sayac++;
        }


        int[] tersten = new int[sayilar.length];
        int sayac1=0;
        for (int i = sayilar.length-1; i >= 0 ; i--) {
            tersten[sayac1] = sayilar[i];
            sayac1++;

        }

        System.out.println(Arrays.toString(tersten));


    }
}
