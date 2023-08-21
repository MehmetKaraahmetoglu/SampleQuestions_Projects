package packages.sampleQuestions;

import java.util.Scanner;

public class soru16 {
    public static void main(String[] args) {
        //Soru 16- Kullanıcıdan 2 isim/kelime alın: isim1 ve isim2
        //          -> isim1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin
        //          -> ilk kelime de tek sayılar varsa,  'isim2, isim1'e eklenemez" ifadesini yazdırın.

        //       isim1 = mehmet   isim2 = ali     mehali
        //               ali              mehmet

        //          Ipucu: If Else ve String Manipulation konusunu hatırlayalım!  Substring,concat,lengt...
        //          Örn:
        //	        isim1= masa
        //          isim2= ali
        //	        Konsol => maalisa

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz: ");
        String isim1 = scanner.next();
        System.out.println("Lütfen bir kelime daha giriniz: ");
        String isim2 = scanner.next();

        if (isim1.length() % 2 == 0){
            System.out.println("Olusan yeni isim: "
                    + isim1.substring(0,isim1.length()/2)
                    + isim2
                    + isim1.substring(isim1.length()/2));
        }else {
            System.out.println("isim2, isim1'e eklenemez");
        }

    }
}
