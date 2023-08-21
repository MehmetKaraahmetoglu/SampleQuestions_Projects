package packages.arraysDeneme;

import java.util.Arrays;
import java.util.Scanner;

public class C06_deneme {
    public static void main(String[] args) {
        //Soru 7-Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        //       eski array’e yeni degeri atayin.

        int[] arr = {1, 2, 3, 4, 5};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen array'in hangi index'ine element atamak istediginizi giriniz: ");
        int indexNu = scanner.nextInt();
        System.out.println("Lütfen eklemek istediginiz elementi giriniz: ");
        int yeniElement = scanner.nextInt();

        arrayElementEkleme(arr, indexNu, yeniElement);



    }


    public static int[] arrayElementEkleme(int[] arr, int index, int yeniElement) {

        //String mesaj = "";

        if (index < arr.length) {
            for (int i = 0; i < arr.length; i++) {
                arr[index] = yeniElement;


            }
            System.out.println("Yeni Array: " + Arrays.toString(arr));
            // mesaj = "Yeni Array: " + Arrays.toString(arr);

        } else {
            System.out.println("Arrayin uzunlugu: " + arr.length + "'tir. Lütfen sinirlari asmadan deger giriniz.");

            //mesaj = "Arrayin uzunlugu: " + arr.length + "'tir. Lütfen sinirlari asmadan deger giriniz.";
        }
        //System.out.println(mesaj);
        return arr;
    }


}


