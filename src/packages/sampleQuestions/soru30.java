package packages.sampleQuestions;

import java.util.Scanner;
import java.util.ArrayList;

public class soru30 {
    /*
    Soru 30-)

    Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
            ( mülakat sorusu )
    Örnek:
    String str="Javacokkolay"
    Yinelenen karakterler : [a, o, k]
    İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.

     */
    public static void main(String[] args) {

        System.out.println("lütfen yinelenen karakterlerini bulmak istediginiz bir kelime giriniz: ");
        Scanner scanner = new Scanner(System.in);
        String kelime = scanner.next();

        char[] chr = kelime.toCharArray();

        ArrayList<String> yinelenenKarakterler = new ArrayList<>();

        boolean flag;

        for (int i = 0; i < chr.length; i++) {
            flag = false;
            for (int j = i + 1; j < chr.length; j++) {
                if (chr[i] == chr[j] && !(yinelenenKarakterler.contains(chr[j])) && !(yinelenenKarakterler.contains(chr[i])) ) {
                    flag = true;

                }


            }
            if (flag){
                yinelenenKarakterler.add("" + chr[i]);
            }

        }
        System.out.println( "Yinelenen karakterler : "+yinelenenKarakterler);



    }
}

