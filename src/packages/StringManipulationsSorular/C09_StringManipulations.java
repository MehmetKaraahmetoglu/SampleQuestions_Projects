package packages.StringManipulationsSorular;

import java.util.Scanner;

public class C09_StringManipulations {
    public static void main(String[] args) {

        // Kullanicidan bi rstring ali, String uzunlugu cift sayi ise tam ortasina :) ekleyin,
        // String uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String metin = scanner.next();
        int uzunluk = metin.length();


        if (metin.length() %2 == 0){
            System.out.print("kelimenin uzunlugu cift sayi : " + metin.substring(0,uzunluk/2)+":)" +
                    metin.substring(uzunluk/2));

        }else{
            System.out.println("kelimenin uzunlugu tek sayi ise: " + metin.substring(0,uzunluk/2) +":(" +
                    metin.substring(uzunluk/2+1));
        }

    }
}
