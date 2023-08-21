package packages.sampleQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class soru36_Arrays {
    //Soru 36-)
    //Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın.
    //( Yapabilirseniz Dinamik kod yazmaya çalışın,
    //Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
    //Örnek:
    //inputarr[]=   {1,2,3,4,5,6,7}
    //output:         4
    //İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz.
    //Kendinizi geliştirme adına sorunun cevabını degişik yollardan yapabilir,
    //Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olusturmak istediginiz Array icine eklemek istediginiz elementleri yanyana yazip entere basin");

        String girilenElementler = scanner.nextLine();

        // String[] krk = girilenElementler.split("");

        // System.out.println(Arrays.toString(krk));

        char[] karakterler = girilenElementler.toCharArray();

        char[] ortadakiDeger = new char[1];

        System.out.println(Arrays.toString(ortadakiDeger));


        if (karakterler.length % 2 == 0) {
            System.out.println("Cift sayida karakter girdiniz.");
        } else {
            ortadakiDeger[0] = karakterler[(karakterler.length - 1) / 2];
            System.out.println(Arrays.toString(ortadakiDeger));
        }


    }
}

