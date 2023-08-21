package packages.arraysDeneme;

import java.util.Scanner;

public class C03_deneme {
    public static void main(String[] args) {
        // Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        //         ve varsa kac kere kullanildigini yazdiran bir method olusturun.


        int[] arr = {3, 5, 2, 3, 5, 6, 7, 1, 8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aramak istediginiz sayiyi girin: ");
        int arananSayi = scanner.nextInt();
        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arananSayi) {
                sayac++;
            }
        }
        if (sayac == 0) {
            System.out.println("Array icinde " + arananSayi + " yoktur");
        } else {
            System.out.println("Array icinde " + sayac + " adet " + arananSayi + " vardir");


        }
    }
}

