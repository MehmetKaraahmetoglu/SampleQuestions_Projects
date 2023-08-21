package packages;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir gün ismi giriniz");
        String gunIsmi = scanner.nextLine();
        int pazartesi = 1;
        int sali = 2;
        int carsamba = 3;
        int persembe = 4;
        int cuma = 5;
        int cumartesi = 6;
        int hafta = 7;

        if (gunIsmi.equals("pazartesi")) {
            System.out.println("simdi calisma zamani tatile " + (cumartesi - pazartesi) + " var");

        } else if (gunIsmi.equals("sali")) {
            System.out.println("simdi calisma zamani tatile " + (cumartesi - sali) + " var");

        } else if (gunIsmi.equals("carsamba")) {
            System.out.println("simdi calisma zamani tatile " + (cumartesi - carsamba) + " var");

        } else if (gunIsmi.equals("persembe")) {
            System.out.println("simdi calisma zamani tatile " + (cumartesi - persembe) + " var");

        } else if (gunIsmi.equals("cuma")) {
            System.out.println("simdi calisma zamani tatile " + (cumartesi - cuma) + " var.");

        } else {
            System.out.println("hafta sonu");
        }
    }
}
