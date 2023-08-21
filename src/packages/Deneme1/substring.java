package packages.Deneme1;

import java.util.Scanner;

public class substring {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("metin giriniz");
        String metin = scanner.nextLine();

        System.out.println(metin.substring(4,7));
        System.out.println("");
        System.out.println((metin.toUpperCase().charAt(0)) +metin.substring(1).toLowerCase());
    }
}
