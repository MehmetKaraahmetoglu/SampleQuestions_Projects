package packages.Deneme1;

import java.util.Scanner;

public class C04_sesliHarfDondurme {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sesli harflerini bulmak istediginiz bir metin giriniz");


        String metin = scanner.nextLine();


        String sesliHarfler = ("a,e,i,o,ö,u,ü");

        String metindekiSesliHarfler="";

        for (int i = 0; i < metin.length(); i++) {
            for (int j = 0; j < sesliHarfler.length(); j++) {
                if (metin.charAt(i) == sesliHarfler.charAt(j) && metindekiSesliHarfler.indexOf(sesliHarfler.charAt(j))< 0) {
                    metindekiSesliHarfler += sesliHarfler.charAt(j) + " ";
                }
            }
        }
        System.out.println("Metin icerisinde bulunan sesli harfler: " + metindekiSesliHarfler);

        int sayac = 0;
        for (int i = 0; i < metin.length(); i++) {
            for (int j = 0; j < sesliHarfler.length(); j++) {
                if (metin.charAt(i) == sesliHarfler.charAt(j)){
                    sayac++;
                }

            }

        }
        System.out.println("Metin icerisinde " + sayac +" adet sesli harf bulunmaktadir.");

    }
}
