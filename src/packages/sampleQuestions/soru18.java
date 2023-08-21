package packages.sampleQuestions;

import java.util.Scanner;

public class soru18 {
    public static void main(String[] args) {
        //Soru 18-) Method Sorusu
        //Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini hesaplayan bir method yazalım.
        //Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim ve bize varış süremizi hesaplasın
        //İpucu:
        //yol=Hız*zaman

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen aracin hizini giriniz: ");
        double hiz = scanner.nextDouble();
        System.out.println("Lütfen varilacak yerin uzakligini giriniz: ");
        double yol = scanner.nextDouble();

        varisSuresi(hiz,yol);


    }

    public static void varisSuresi(double hiz, double yol) {

        double zaman = yol / hiz;
        System.out.println("Tahmini varis sürenüz: "+ zaman + " 'saattir.");


    }

}


