package packages.StringManipulationsSorular;

import java.util.Scanner;

public class forloop_deneme {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("dikdortgenin 1 kenarinin uzunlugunu giriniz");
        int kenar1 = scanner.nextInt();
        System.out.println("dikdörtgenin 2. kenarinin uzunlugunu giriniz");
        int kenar2 = scanner.nextInt();

        System.out.println(sekilYapma(kenar1,kenar2));



    }


    public static String sekilYapma(int kenar1, int kenar2) {

        String sekil = "";
        for (int i = 1; i <= kenar1; i++) {
            System.out.println("");

            for (int j = 1; j <= kenar2; j++) {

                System.out.print("*" + "  ");



            }

        }
        return sekil;
    }
}







