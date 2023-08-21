package packages.StringManipulationsSorular;

import java.util.Scanner;

public class C04_StringManipulations {
    public static void main(String[] args) {


        /*
        Kullanicidan bir cümle alin,
        -cümlede ev geciyorsa "home sweet home"
        -cümlede is geciyorsa "calismak guzeldir"
        -ikisini de iceriyorsa "Hem ev lazim hem is"
        -hicbirini icermiyorsa "cok calisman lazim"
        yazdirin
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String girilenCumle = scanner.nextLine();

        int ilkDeger=(girilenCumle.indexOf("ev"));
        int ikinci_deger=girilenCumle.indexOf("is");

        if (ilkDeger>=0 && ikinci_deger>=0) {
            System.out.println("hem ev lazim hem is");

        }else if (ikinci_deger>=0){
            System.out.println("calismak güzeldir");

        } else if (ilkDeger>=0) {
            System.out.println("home sweet home");

        }else{
            System.out.println("cok calisman lazim");



        }

    }
}
