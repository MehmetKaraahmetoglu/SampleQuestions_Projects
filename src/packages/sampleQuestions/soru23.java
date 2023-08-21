package packages.sampleQuestions;

import java.util.Scanner;

public class soru23 {
    /*
    Soru 23-) Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın.
    Method bize çıktıyı döndürsün.

        Örnek:
        Girdi: 6
        Çıktı: 6!=65432*1=720
        ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.
      
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktoriyelinin hesaplanmasini istediginiz bir tam sayi giriniz: ");
        int sayi= scanner.nextInt();
        faktoriyelHesaplama(sayi);

    }
    public static int faktoriyelHesaplama (int sayi){

        int faktoriyel = 1;

        for (int i = 1; i <= sayi ; i++) {
            faktoriyel*=i;
            
        }
        System.out.println("Verilen sayinin faktoriyeli: " + faktoriyel);
        return faktoriyel;

    }
    
}
