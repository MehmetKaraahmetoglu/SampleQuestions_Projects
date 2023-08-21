package packages.sampleQuestions;

import java.util.Scanner;

public class soru14 {
    public static void main(String[] args) {
        //Soru 14-)
        //Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        //ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.

        //Ipucu:
        //Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz!
        //Sayac adlı bir int variable oluşturarak bunun ile kelimenin
        //kaç defa geçtigini Loop içindeki İf ile bulabilirsiniz!

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen kelimenin icinde aratmak istediginiz karakteri giriniz:");
        char karakter = scanner.next().charAt(0);
        System.out.println("Icerisinde verdiginiz karakteri aratmak istediginiz kelimeyi giriniz:");
        String kelime = scanner.next();

        int sayac1 = 0;
        int sayac2 = 0;
        while (sayac1 < kelime.length()) {  //Bütün harfleri tek tek gezmesi icin
            if (karakter == kelime.charAt(sayac1++)) { //aranan karaktere denk geldikce calisir
                sayac2++;

            }
        }
            System.out.println("Girdiginiz kelime icinde " + sayac2 + " adet " + karakter + " vardir");
    }
}
