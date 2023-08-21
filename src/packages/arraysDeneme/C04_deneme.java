package packages.arraysDeneme;

import java.util.Arrays;
import java.util.Scanner;

public class C04_deneme {
    public static void main(String[] args) {
         //Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan
         //        ve bize donduren bir method olusturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen olusturmak istediginiz Array`in boyutunu giriniz:");
        int boyut =scanner.nextInt();
        int[] arr = new int[boyut];

        for (int i = 0; i < arr.length; i++) {

            System.out.println("lütfen elementleri giriniz");
            arr[i] = scanner.nextInt();


        }

        System.out.println(Arrays.toString(arr));
    }
}
