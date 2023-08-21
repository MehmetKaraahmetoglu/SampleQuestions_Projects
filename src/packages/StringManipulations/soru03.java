package packages.StringManipulations;

import java.util.Scanner;

public class soru03 {
    public static void main(String[] args) {
        //Soru 5 : Kullanicidan bir cumle alin
        // - cumlede ev geciyorsa, "home home sweet home" yazdirin
        // - cumlede is geciyorsa, "calismak guzeldir"
        // - ikisini de iceriyorsa "Hem ev lazim hem is"
        // - hicbirini icermiyorsa "cok calisman lazim" yazdiri

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String metin = scanner.nextLine();

        int evIndexi = metin.indexOf("ev");
        int isIndexi = metin.indexOf("is");

        if (evIndexi>=0 && isIndexi>=0){
            System.out.println("Hem ev lazim hem is");
        } else if (isIndexi>=0) {
            System.out.println("calismak güzeldir");
        } else if (evIndexi>=0) {
            System.out.println("home sweet home");
        }else {
            System.out.println("Cok calisman lazim");
        }

    }
}
