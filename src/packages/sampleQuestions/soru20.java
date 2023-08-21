package packages.sampleQuestions;

import java.util.Scanner;

public class soru20 {
    public static void main(String[] args) {
        //Soru 20-)
        //Kullanıcıdan bir isim yazmasını isteyin, İsim uzunluğu 3 olmalıdır.
        //Daha sonra ismin aynı karakterlere sahip olup olmadığını kontrol edin.
        //Dize aynı karakterlere sahipse:  "Dizede yinelenen karakterler var" ;
        //aynı karakterlere sahip degilse  "String benzersiz karakterlere sahip" yazdırın.
        //İsim 3 karakterden uzunsa "Bu kadar uzun cümleyi anlayamam ben agam" yazdırın.
        //
        //                Örnek:
        //                giriş: ama
        //		çıkış: Dizede yinelenen karakterler var
        //
        //                İpucu: İf Else ve Char kullanarak çözebiliriz.
        System.out.println("Lütfen 3 harften olusan bir isim giriniz: ");
        Scanner scanner = new Scanner(System.in);
        String isim = scanner.next();

        int uzunluk = isim.length();

        char ilkKrk = isim.charAt(0);
        char ikinciKrk = isim.charAt(1);
        char ucuncuKrk = isim.charAt(2);

        if (uzunluk>3) {
            System.out.println("Bu kadar uzun cümleyi anlayamam ben agam");
        } else if (ilkKrk == ikinciKrk || ilkKrk == ucuncuKrk || ikinciKrk == ucuncuKrk) {
            System.out.println("Dizede yinelenen karakterler var");
        }else {
            System.out.println("String benzersiz karakterlere sahip");
        }

    }
}
