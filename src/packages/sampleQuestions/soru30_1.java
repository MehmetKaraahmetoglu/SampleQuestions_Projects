package packages.sampleQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class soru30_1 {
    public static void main(String[] args) {
        /*
        Soru 30-)
Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
( mülakat sorusu )
Örnek:
String str="Javacokkolay"
Yinelenen karakterler : [a, o, k]
İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
         */
        System.out.println("lütfen yinelenen karakterlerini bulmak istediginiz bir kelime giriniz: ");
        Scanner scanner = new Scanner(System.in);
        String kelime = scanner.next();

        String ayniKarakter = "";

        char[] kelimeCharArray = new char[kelime.length()];
        for (int i = 0; i < kelime.length(); i++) {
            kelimeCharArray[i] = kelime.charAt(i);
        }


        //char[] kelimeCharArray = kelime.toCharArray();

/*        char ornek1='j';
        char ornek2='a';
        char [] ornek = new char[2];
        ornek[0]=ornek1;
        ornek[1]=ornek2;*/

        // j avacokkolay
        //  j a v a c o k k o l a y
        //  aynikarakter ="";
        //  aynikarakter ="";
        //  aynikarakter ="" +a ; aynikarakter ="a";
        //aynikarakter= "a"+"o" ;aynikarakter ="ao";

        int sayac = 0;
        for (int i = 0; i < kelimeCharArray.length; i++) {
            sayac = 0;
            for (int j = 0; j < kelimeCharArray.length; j++) {
                if (kelime.charAt(i) == kelimeCharArray[j]) {
                    sayac++;
                }
            }

            if (sayac > 1 && ayniKarakter.indexOf(kelimeCharArray[i]) < 0) {
                ayniKarakter = ayniKarakter + kelimeCharArray[i];
            }


        }


        String[] kelimeArray = new String[ayniKarakter.length()];
        for (int i = 0; i < ayniKarakter.length(); i++) {
            kelimeArray[i] = "" + ayniKarakter.charAt(i);

        }
        System.out.println(Arrays.toString(kelimeArray));
    }
}


