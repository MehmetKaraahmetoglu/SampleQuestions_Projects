package packages.Deneme1;

import java.util.Scanner;

public class C03_IfVeElseOrnekleri {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise “Emekli olabilirsin” yazdirin,
        yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.
        
        Soru 4- Kullanicidan bir karakter girmesini isteyin,
        girilen karakterin buyuk harf olup olmadigini yazdirin.

        Soru 5- Kullanicidan bir harf isteyin,
        girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin, yoksa girilen harfi yazdirin
         */

        //Soru-3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz: ");
        int girilenYas = scanner.nextInt();

        if (girilenYas >= 65 ){
            System.out.println("Emekli olabilirsin");
        }else
            System.out.println("Emekli olabilmeniz icin calisilmasi gereken yil: " + (65-girilenYas));

        //Soru-4

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz: ");
        char  girilenKarakter = scanner.next().charAt(0);
        //kullanici ne kadar uzun kelime veya kelimeler girsede ilk karakteri alir.

        if (girilenKarakter  >= 'A'  && girilenKarakter <= 'Z'){
            System.out.println("girilen karakter buyuk harf");
        }else{
            System.out.println("girilen karakter buyuk harf degil");
        }
    }
}
