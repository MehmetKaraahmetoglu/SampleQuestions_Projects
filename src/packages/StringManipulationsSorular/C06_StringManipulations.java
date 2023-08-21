package packages.StringManipulationsSorular;

import java.util.Scanner;

public class C06_StringManipulations {
    public static void main(String[] args) {

        /*
        Kullanicidan alinan metinde ki istenmeyen rakam ve ozel karakterleri silip,
        sadece ilk harf buyuk diger harfler kucuk yazan bir program yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz:");
        String metin= scanner.nextLine();

        metin = metin.replaceAll("\\d","");
        metin = metin.replaceAll("\\s","1");
        metin = metin.replaceAll("\\W","");
        metin = metin.replaceAll("1", " ");

        metin = metin.substring(0,1).toUpperCase() + metin.substring(1).toLowerCase();

        System.out.println(metin);

    }
}
