package packages.Deneme1;

import java.util.Scanner;

public class C01_SayiYerDegistirme {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);


        System.out.println("sayi1'i giriniz:");
        int sayi1 =scanner.nextInt();

        System.out.println("sayi2'yi giriniz");
        int sayi2 =scanner.nextInt();

        int temp = sayi1;
        sayi1 = sayi2;
        sayi2 = temp;

        System.out.println("Yeni sayi1: " + sayi1);
        System.out.println("Yeni sayi2: " + sayi2);



    }
}
