package packages.sampleQuestions;

import java.util.Scanner;

public class soru39_Arrays {
    public static void main(String[] args) {
//Soru-39)
//Bir diziyi (Array) parametre olarak kabul eden
//ve dizideki tüm elemanların toplamını döndüren bir method yazın
//ve ardından sonucu main methodda yazdırın.
//Örn:
//girdi : {1,2,3,4,5,6,7,8}
//çıkış: 36
//ıpucu: For Loop ile arrayin elemanlarını toplayın ve methodu yazdırarak döndürün


        System.out.println("Elementlerini toplamak isteginiz bir array icin uzunluk giriniz:");
        Scanner scanner = new Scanner(System.in);
        int uzunluk = scanner.nextInt();

        int[] sayilar = new int[uzunluk];

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("Lütfen sayilari giriniz:");
            sayilar[i] = scanner.nextInt();

        }

        System.out.println("Array'in icindeki sayilar toplami: " +toplam(sayilar));

    }
    public static int toplam (int[] arr){

        int toplam =0;
        for (int i = 0; i < arr.length; i++) {
            toplam +=  arr[i];

        }
        return toplam;
    }
}

