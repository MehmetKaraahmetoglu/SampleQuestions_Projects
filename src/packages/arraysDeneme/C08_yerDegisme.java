package packages.arraysDeneme;

import java.util.Arrays;
import java.util.Scanner;

public class C08_yerDegisme {
    public static void main(String[] args) {
        //Soru 3- Verilen bir array deki tüm elementleri bir saga kaydirip,
        //        sondaki elementi de basa tasiyacak bir method olusturun, array'i yeni haliyle kaydedin.


        System.out.println("lütfen elementlerini bir saga kaydirmak istediginiz Array icin bir uzunluk giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int uzunluk = scanner.nextInt();
        int[] arr = new int[uzunluk];

        for (int i = 0; i < arr.length; i++) {

            System.out.println("lütfen elementleri giriniz");
            arr[i] = scanner.nextInt();

        }

        int[] yeniArr = new int[arr.length];

        int sayacArr = 0;
        int sayacYeniArr = 1;

        yeniArr[0] = arr[arr.length - 1];

        for (
                int i = 1;
                i < arr.length; i++) {
            yeniArr[i] = arr[sayacArr];

            sayacYeniArr++;
            sayacArr++;

        }
        System.out.println(Arrays.toString(yeniArr));
    }
}
