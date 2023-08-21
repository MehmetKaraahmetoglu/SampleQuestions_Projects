package packages;

import java.util.Scanner;

public class ay {
    public static void main(String[] args) {
        //Kullanicidan ay numarasini alip mevsimi yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir ay numarasi giriniz");
        int ayNu = scanner.nextInt();

        switch (ayNu) {
            case 12: // aralik

            case 1: //ocak

            case 2:  // subat
                System.out.println("Kis");
                break;

            case 3: //Mart

            case 4: //nisan

            case 5: //mayis
                System.out.println("ilkbahar");
                break;

            case 6: //haziran

            case 7: // temmuz

            case 8: // agustos
                System.out.println("yaz");
                break;

            case 9: // eylül

            case 10: //ekim

            case 11: //kasim
                System.out.println("sonbahar");
                break;

            default:
                System.out.println("hatali giris yaptiniz");



        }
    }
}
