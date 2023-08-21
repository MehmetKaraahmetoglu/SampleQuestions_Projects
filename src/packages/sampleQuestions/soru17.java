package packages.sampleQuestions;

import java.util.Scanner;

public class soru17 {
    public static void main(String[] args) {
        //Soru 17-)

        //Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır.
        //Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
        //İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"
        //değil ise konsolda "Dize benzersiz karakterlere sahip" yazdıralım.

        //Ipucu:
        //IF/Else - Ternary kullanabilirsiniz. Harfleri Char ile alıp karşılaştırabilirsiniz.

        System.out.println("Lütfen 3 harften olusan bir isim giriniz: ");
        Scanner scanner = new Scanner(System.in);
        String isim = scanner.next();



        char ilkKrk = isim.charAt(0);
        char ikinciKrk = isim.charAt(1);
        char ucuncuKrk = isim.charAt(2);

        if (ilkKrk == ikinciKrk || ilkKrk == ucuncuKrk || ikinciKrk == ucuncuKrk) {
            System.out.println("Dize yinelenen karakterlere sahip");
        } else {
            System.out.println("Dize benzersiz karakterlere sahip");

        }
    }
}

