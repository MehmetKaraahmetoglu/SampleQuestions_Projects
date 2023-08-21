package packages.StringManipulationsSorular;

import java.util.Scanner;

public class C10_doWhile {
    //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
    //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
    //baslangic degerinden kucuk olsa da program calissin
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Baslangic sayisini girniz: ");
        int baslangic = scanner.nextInt();
        System.out.println("bitis sayisini giriniz: ");
        int bitis = scanner.nextInt();

        int toplam =0;

        if (baslangic<bitis){
            for (int i = baslangic; i <=bitis ; i++) {
                toplam += i;

            }
            System.out.println("toplam deger: " + toplam);
        }
        if (baslangic>bitis){
            for (int i = bitis; i <=baslangic ; i++) {
                toplam += i;

            }
            System.out.println("toplam deger: " + toplam);
        }

    }
}
